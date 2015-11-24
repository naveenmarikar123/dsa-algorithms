public class CheckArrayInSortedOrder {
	
	
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,25};
		System.out.println(checkIfArrayIsSorted(arr, arr.length));
	}
	
	public static boolean checkIfArrayIsSorted(int[] arr,int n)
	{
		if(n==1)
			return true;
		else
		{
			if(arr[n-1] > arr[n-2])
			{
				return checkIfArrayIsSorted(arr,n-1);
			}
			else
			{
				return false;
			}
		}
	}

}
