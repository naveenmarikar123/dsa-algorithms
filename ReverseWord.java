
public class ReverseWord {
	
	public static void main(String[] args)
	{
		System.out.println(reverseWords("fddu xq l vy azs"));
	}
	
	public static String reverseWords(String a)
	{
		String[] arr = a.split(" ");
		StringBuilder result = new StringBuilder();
		
		if(a.length()==1)
			return a;
		
		for(int i = arr.length-1 ; i>=0 ; i--)
		{
			if(!arr[i].isEmpty())
			{
			result.append(arr[i]);
			result.append(" ");
			}	
		}
		
		
		
		return result.substring(0, result.length()-1);
	}

}
