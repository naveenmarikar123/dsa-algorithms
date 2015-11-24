
public class INT2ROMAN {
	
	public static String getResult(int a)
	{
		StringBuilder result = new StringBuilder();
		while(true)
		{
			if(a<=0)
			{
				break;
			}
			if(a>=1000)
			{
				result.append(getRoman(1000));
				a = a-1000;
				continue;
			}
			if(a>=900)
			{
				result.append(getRoman(900));
				a = a-900;
				continue;
			}
			else if(a>=500)
			{
				result.append(getRoman(1000));
				a = a-1000;
				continue;
			}
			else if(a>=400)
			{
				result.append(getRoman(400));
				a = a-400;
				continue;
			}
			else if(a>=100)
			{
				result.append(getRoman(100));
				a = a-100;
				continue;
			}
			else if(a>=90)
			{
				result.append(getRoman(90));
				a = a-90;
				continue;
			}
			else if(a>=50)
			{
				result.append(getRoman(50));
				a = a-50;
				continue;
			}
			else if(a>=40)
			{
				result.append(getRoman(40));
				a = a-40;
				continue;
			}
			else if(a>=10)
			{
				result.append(getRoman(10));
				a = a-10;
				continue;
			}
			else if(a>=9)
			{
				result.append(getRoman(9));
				a = a-10;
				continue;
			}
			else if(a>=5)
			{
				result.append(getRoman(5));
				a = a-5;
				continue;
			}
			else if(a>=4)
			{
				result.append(getRoman(4));
				a = a-4;
				continue;	
			}
			else if(a<=3)
			{
				result.append(getRoman(1));
				a= a-1;
				continue;
			}
			
			
			
		}
		return result.toString();
		
	}
	
	public static String getRoman(int a)
	{
		if(a==1000)
			return "M";
		else if(a==900)
			return "CM";
		else if(a==500)
			return "D";
		else if(a==400)
			return "CD";
		else if(a==100)
			return "C";
		else if(a==90)
			return "XC";
		else if(a==50)
			return "L";
		else if(a==40)
			return "XL";
		else if(a==10)
			return "X";
		else if(a==9)
			return "IX";
		else if(a==5)
			return "V";
		else if(a==4)
			return "IV";
		else if(a == 1)
			return "I";
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getResult(1990));

	}

}
