
public class ROMANTOINT {

	/*
	I	1
	V	5
	X	10
	L	50
	C	100
	D	500
	M	1,000
	 * 
	 */
	
	public static int getValueFromRoman(char a)
	{
		if(a=='I')
			return 1;
		else if(a=='V')
			return 5;
		else if(a=='X')
			return 10;
		else if(a=='L')
			return 50;
		else if(a=='C')
			return 100;
		else if(a=='D')
			return 500;
		else if(a=='M');
			return 1000;
	}
	

	
	
	public static void main(String[] args)
	{
		
		System.out.println(romanToInt("MCMXC"));
		System.out.println(romanToInt("MCMLIV"));
		System.out.println(romanToInt("III"));
		
		
	}
	
	public static int romanToInt(String a) {
		
		if(a.length()==0)
			return 0;
		else if(a.length() == 1)
			return getValueFromRoman(a.charAt(0));
		else
		{
			int res = 0;
			int temp = getValueFromRoman(a.charAt(0));
			res=res+temp;
			for(int i = 1 ; i < a.length() ; i++)
			{
				int val = getValueFromRoman(a.charAt(i));
				if(val > temp)
				{
					res = res - temp;
					temp = val - temp;
					res = res+temp;
				}
				else
				{
				temp = val;
				res = res + val;
				}
			}
			return res;
		}
	    
	    
	}

}
