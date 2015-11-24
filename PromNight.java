import java.util.Arrays;
import java.util.Scanner;

public class PromNight {

	public static void main(String[] args) {
		
		
		
	       Scanner in = new Scanner(System.in);
	       int t = in.nextInt();
	       int m , n;
	       while(t>0)
	       {
	       	m = in.nextInt();
	       	n = in.nextInt();
	       	int[] boys = new int[m];
	       	int[] girls = new int[n];
	       	for(int i = 0 ; i < m ; i++)
	       	{
	       		boys[i] = in.nextInt();
	       	}
	       	for(int i = 0 ; i < n ; i++)
	       	{
	       		girls[i] = in.nextInt();
	       	}
	       	
	       	if(boys.length > girls.length)
	       	{
	       		Arrays.sort(boys);
	       		Arrays.sort(girls);
	       		if(boys[boys.length-1] > girls[girls.length-1])
	       		{
	       			System.out.println("YES");
	       		}
	       		else
	       		{
	       			System.out.println("NO");
	       		}
	       	}
	       	else
	       	{
	       		System.out.println("NO");
	       	}
	       
	       	t--;

	}
	}
}


