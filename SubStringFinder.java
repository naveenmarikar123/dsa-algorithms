
public class SubStringFinder {
	
	
	public static void main(String[] args)
	{
		
		System.out.println(findSubString("abcd   f","f"));
		
	}
	
	public static int findSubString(String haystack , String needle)
	{
		if(needle.length() > haystack.length())
			return -1;
		else if(needle.length()==0 || haystack.length()==0)
		{
			return -1;
		}
		else if(needle.length() == haystack.length())
		{
			if(needle.equals(haystack))
				return 0;
		}
		else {
		for(int i = 0 ; i < haystack.length()- (needle.length()-1) ; i++)
		{
			int j = 0;
			int k = i;
			while(j<needle.length())
			{
				if(needle.charAt(j)==haystack.charAt(k))
				{
					k++;
					j++;
				}
				else
				{
					break;
				}
			}
			if(j==needle.length())
			{
				return i;
			}
			
		}
		return -1;
		}
		return 0;
		
	}

}
