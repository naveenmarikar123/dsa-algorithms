
public class LastWord {
public static int lengthOfLastWord(final String a) {
	    
	    int start = 0;
	    int end = a.length()-1;
	    
	    int count = 0;
	    
	    int space = 0;
	    
	    if(end==0)
	    {
	    	return 1;
	    }
	    
	    while(a.charAt(end) == ' ')
	    {
	    	end--;
	    	space = 1;
	    }
	    
	    while(a.charAt(end) !=' ')
	    {
	    	
	        count++;
	        end--;
	        if(start==end)
	        	break;
	       
	    }
	    
	    if(a.charAt(end) == ' ')
	    {
	    	return count;
	    }
	    	  if(end==start)
	        return count+1;
			return 0;
	    
	   
	    
	    
	}


public static void main(String[] args)
{
	System.out.println(lengthOfLastWord("Hello"));
}

}
