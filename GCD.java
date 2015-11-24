import java.math.BigInteger;
import java.util.Scanner;

public class GCD {
	
	public static void main(String args[] ) throws Exception {
	      
	      Scanner in = new Scanner(System.in);
	      int t = in.nextInt();
	      BigInteger g;
		int n;
	      while(t>0)
	      {
	      	g = in.nextBigInteger();
	      	n = in.nextInt();
	      	
	      	if(n == 1)
	      	{
	      		System.out.println(g.multiply(BigInteger.valueOf(2)));
	      	}
	      	else
	      	{
	      		for(int i = 1 ; i < n ; i++)
	      		{
	      			System.out.print(g.multiply(BigInteger.valueOf(2)) + " ");
	      		}
	      		System.out.println(g.multiply(BigInteger.valueOf(3)));
	      	}
	      	
	     	
	      	t--;
	      }
	    }
}
