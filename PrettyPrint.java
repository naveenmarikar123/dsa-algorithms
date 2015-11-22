
public class PrettyPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] array = prettyPrinter(9);
	
		for(int i = 0 ;i<array.length;i++)
		{
			for(int j =0 ;j<array.length;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}

	}
	
	public static int[][] prettyPrinter(int a)
	{
		int size = getArraySizeRequired(a);
		int[][] array = new int[size][size];
		int i = 0 ;
		while(true){
			writeInCircle(array,i,size,a);
			if(a==1)
				break;
			i++;
			a--;	
		}
		return array;
	}
	
	public static int getArraySizeRequired(int a)
	{
		int size = 1 ; 
		if(a==1)
			return size;
		else
		{
			while(a>1)
			{
				size = size+2;
				a--;
			}
			return size;
		}	
	}
	
	public static void writeInCircle(int[][] array,int point,int size,int val)
	{
		for(int i = point ; i < size - point ; i++)
		{
			array[point][i] = val;
			array[i][point] = val;
			array[i][size-point-1] = val;
			array[size-point-1][i]=val;
		}	
		
	}

}
