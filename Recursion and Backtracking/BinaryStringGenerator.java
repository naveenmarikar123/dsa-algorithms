
public class BinaryStringGenerator {
	
	public static void main(String[] args)
	{
		printResult(4);
	}
	
	public static void printResult(int n)
	{
		//Let's get the decimal equavalent of the number which is 2 raised to n.
		int result = (int) Math.pow((double)2, (double)n);
		for(int i = 0 ; i < result ; i++)
		{
			String res = Integer.toBinaryString(i);
			while(res.length()<n)
			{
				res = "0"+res;
			}
			System.out.println(res);
		}
	}

}
