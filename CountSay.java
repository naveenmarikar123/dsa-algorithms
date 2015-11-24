
public class CountSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getNextNumber("1"));

	}
	
	public static String getNextNumber(String number)
	{
		int i = 1;
		int j = 1;
		char temp = number.charAt(0);
		StringBuilder res = new StringBuilder();
		while(i<number.length())
		{
			if(temp == number.charAt(i))
			{
				j++;
				temp=number.charAt(i);
			}
			else
			{
				res.append(j);
				res.append(temp);
				temp=number.charAt(i);
				j=1;	
			}
			i++;	
		}
		if(j>=1)
		{
			res.append(j);
			res.append(temp);
		}
		
		return res.toString();
	}

}
