
public class PalindromeChecker {
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("race a car"));
	}
	
	public static boolean isAlphaNumeric(char x)
	{
		int ascii = (int) x;
		boolean numberCheck = x>=48 && x<=57;
		boolean lowerCaseAlphaCheck = x>=65 && x<=90;
		boolean upperCaseAlphaCheck = x>=97 && x<=122;
		if(numberCheck || lowerCaseAlphaCheck || upperCaseAlphaCheck)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	
	public static int isPalindrome(String a) {
		
		int start = 0 ;
		int end = a.length()-1;
		
		while(start <= end)
		{
			char x = a.charAt(start);
			char y = a.charAt(end);
			
			if(!isAlphaNumeric(x))
			{
				start++;
				continue;
			}
			else if(!isAlphaNumeric(y))
			{
				end--;
				continue;
			}
			
			if(Character.toLowerCase(x)==Character.toLowerCase(y))
			{
				start++;
				end--;
			}
			else
			{
				return 0;
			}
		}
		return 1;
	}
}
