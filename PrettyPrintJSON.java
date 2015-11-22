import java.util.ArrayList;

public class PrettyPrintJSON {
	
	public static void main(String[] args)
	{
		//System.out.println(getResult("{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}"));
		
	
		
	}
	
	public static StringBuilder tabAppender(int tabcount)
	{
		int k = 0;
		StringBuilder res = new StringBuilder();
		while (k < tabcount)
		{
			res.append("\t");
			k++;
		}
		
		return res;
	}
	
	public static ArrayList<String> prettyJSON(String a)
	{
		
		ArrayList<String> result = new ArrayList<String>();
		
		
		StringBuilder res = new StringBuilder();
		int tabcount = 0;
		for(int i = 0 ; i < a.length() ; i++)
		{
			if( a.charAt(i)=='{' || a.charAt(i)==('['))
			{
				
				res.append(a.charAt(i));
				result.add(res.toString());
				res= new StringBuilder();
				
				//res.append("\n");
				tabcount++;
				res.append(tabAppender(tabcount));
			}
			
			else if(a.charAt(i)==',')
			{
				
				res.append(a.charAt(i));
				result.add(res.toString());
				res= new StringBuilder();
				//res.append("\n");
				res.append(tabAppender(tabcount));
			}
			
			else if(a.charAt(i) ==':' && ((a.charAt(i+1) =='{') || (a.charAt(i+1) =='[')))
			{
				res.append(a.charAt(i));
				result.add(res.toString());
				res= new StringBuilder();
				//res.append("\n");
				res.append(tabAppender(tabcount));
			}
			
			else if( a.charAt(i)=='}' || a.charAt(i)==(']'))
			{
				result.add(res.toString());
				res= new StringBuilder();
				//res.append("\n");
				tabcount--;
				res.append(tabAppender(tabcount));
				
				res.append(a.charAt(i));
			}
			
			else
			{
				
				res.append(a.charAt(i));
			}
			
			
		}
		
		result.add(res.toString());
		
		
		
		return result;
	}
}
