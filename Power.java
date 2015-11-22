import java.math.BigInteger;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sqrt(308634616));

	}
	public static int sqrt(int a) {
		if(a==1)
			return 1;
		
	    int high = a/2;
	    int low = 1 ;
	    int floorpower = 1;
	    
	    while(low<=high)
	    {
	        int mid = low + (high-low)/2;
	   
	        BigInteger pow = BigInteger.valueOf(mid).multiply(BigInteger.valueOf(mid));
	        if(pow.equals(BigInteger.valueOf(a)))
	        {
	            return mid;
	        }
	        else if(pow.compareTo(BigInteger.valueOf(a)) == -1)
	        {
	            low = mid+1;
	            floorpower = mid;
	        }
	        else if(pow.compareTo(BigInteger.valueOf(a)) == 1)
	        {
	            high = mid-1;
	        }
	    }
	    return floorpower;
	    
	    
	}

}
