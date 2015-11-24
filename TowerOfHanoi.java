
public class TowerOfHanoi {

	public static void main(String[] args) {
		
		TowerOfHanoiSolver(3, 'A', 'C', 'B');
	}
	
	public static int TowerOfHanoiSolver(int n , char frompeg , char topeg , char auxpeg)
	{
		if(n==1)
		{
			System.out.println("Move "  +n+"th disk from " +frompeg+" to " + topeg);
			return 0;
		}
		else
		{
			//Move n-1 from source to aux
			TowerOfHanoiSolver(n-1,frompeg,auxpeg,topeg);
			//Move the nth from source to destination
			System.out.println("Move "  +n+"th disk from " +frompeg+" to " + topeg);
			//Move the n-1 from aux to destination now
			TowerOfHanoiSolver(n-1,auxpeg,topeg,frompeg);
		}
		return 0;
	}

}
