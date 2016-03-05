
jQuery(function($) {

    $(document).ready(function() {


        var server_location = "http://localhost:8080/api/get-count";
        var initialCount = 0; 
        var timeTakenToShowAllWords = 0; // This is the time taken to show all the words.
        var regex1 = "([a-zA-Z0-9]+)"; // Matching only a word pattern - alphanumeric.
        var word_count = 0; // Init to 0. Will get total count once jQuery traverses all word nodes in DOM.
        var arr = new Array(); // Needed for randomizing
        var hash = new Array(); // Final random order for the range 0 - word_count

        function getWordCount(){ 
        $("#bodyContent").highlight(regex1);
        count = $("span#word").length;          
        }


        function initArray() {
        var i = word_count;
        while (i) {
            arr[i] = i;
            i = i - 1;
        }
        }

        initArray();
        getWordCount();

        function showWords() {
            var end = hash.length;
            var k = 0;
            while (end) {
                end = end - 1;
                $("#bodyContent").find(word[hash[end]]).delay(1 * k).animate({
                    opacity: 1
                }, 5000);
                k = k + 1;
            }
        }

        function hideWords() {
            var start = 0;
            var k = 0 ;
            while(start<hash.length) {
                $("#bodyContent").find(word[hash[start++]]).delay(1 * k).animate({
                    opacity: 0
                }, 5000);
                k = k + 1;              
            }
        }


        function shuffle(array) {
            var m = array.length,
                t, i, k;
            k = 0;
            while (m) {
                i = Math.floor(Math.random() * m--);
                array[m] = array[i] + (array[i] = array[m]) - array[m];
                $("#bodyContent").find(word[array[m]]).delay(1 * k).animate({
                    opacity: 0
                }, 5000);
                hash[k] = array[m];
                k = k + 1;
            }
        }

        $.ajax(server_location, {
            success: function(response) {
                initialCount = parseInt(response);
                console.log(initialCount);
                shuffle(arr); //First time hiding.
                timeTakenToShowAllWords = 1*hash.length;
                console.log(window.location.href);
            }
        });

        function ajaxToServer() {
            $.get(server_location, function(data) {
                var serverCount = parseInt(data);
                initialCount++;
                if (serverCount != initialCount) {
                    showWords();
                    initialCount=serverCount;
                    setTimeout(hideWords,timeTakenToShowAllWords);

                }
                setTimeout(ajaxToServer, 2000); //Check server every 2 seconds for changes.
            });
        }

        setTimeout(ajaxToServer, 1000);




    });



});