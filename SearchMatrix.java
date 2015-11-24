import java.util.ArrayList;
import java.util.List;

public class SearchMatrix {
	
		public static void main(String[] args)
		{
			ArrayList<Integer> result =  new ArrayList<Integer>();
		
				result.add(1);
			 result.add(1);
			 result.add(1);
			 result.add(3);
			 result.add(3);
			 result.add(4);
			 result.add(4);
			 result.add(4);
			 result.add(4);
			 result.add(5);
			 result.add(5);
			 result.add(5);
			 result.add(5);
			 
			 System.out.println(searchRange(result,4));
		}


		// DO NOT MODIFY THE LIST
		public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		    
		    
		    ArrayList<Integer> result = new ArrayList<Integer>();
		    if(a.size()==0)
		    {
		        result.add(-1);
		        result.add(-1);
		        return result;
		    }
		    
		    
		    int start = 0;
		    int end = a.size()-1;
		    
		    //Let's first get the leftmost bound
		    
		    while(start+1<end)
		    {
		        int mid = start + (end-start)/2;
		        if(b == a.get(mid))
		        {	
		            end = mid;
		        }
		        else if(b > a.get(mid))
		        {
		            start = mid;
		        }
		        else
		        {
		            end = mid;
		        }
		    }
		        
		        if(a.get(start) == b)
		        {
		        	result.add(start);
		        }
		        else if(a.get(end) == b)
		        {
		        	result.add(end);
		        }
		       
		       
		        
		        start = 0;
		        end = a.size() - 1;
		        
		        while(start+1 < end)
		        {
		        	int mid = start + (end - start) / 2;
		        	System.out.println(mid);
		        	
		        	if(a.get(mid) == b)
		        	{
		        		start = mid;
		        	}
		        	else if(a.get(mid)>b)
		        	{
		        		end = mid;
		        	}
		        	else
		        	{
		        		start = mid;
		        	}
		        }
		       if(a.get(end) == b)
		       {
		    	   result.add(end);
		       }
		        else if(a.get(start) == b)
		        {
		        	result.add(start);
		        }
		      
		        
		        return result;
		        
		       
		    }
		    
		
		 
		    
		    
		}



