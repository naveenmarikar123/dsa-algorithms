import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class StringObject
{
	private String mainPart;
	private String subPart;
	public String getMainPart() {
		return mainPart;
	}
	public void setMainPart(String mainPart) {
		this.mainPart = mainPart;
	}
	public String getSubPart() {
		return subPart;
	}
	public void setSubPart(String subPart) {
		this.subPart = subPart;
	}
	public String getFullString()
	{
		return this.mainPart+this.subPart;
	}
}

class MyMainPartComparator implements Comparator<StringObject>
{
	@Override
	public int compare(StringObject o1, StringObject o2) {
		return o1.getMainPart().compareTo(o2.getMainPart());
	}	
}


public class MaxOccurence {
	


	
@SuppressWarnings("unchecked")
public static void main(String args[] ) throws Exception {
	
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	int n  , k = 0 , m;
	in.nextLine();
	
	TreeSet<StringObject> listOfStrings = new TreeSet<StringObject>(new MyMainPartComparator());
	
	while(t>0)
	{
		n = in.nextInt();
		k = in.nextInt();
		m = in.nextInt();
		in.nextLine();
		
		while(n > 0)
		{
			
			String temp = in.nextLine();
			StringObject x = new StringObject();
			x.setMainPart(temp.substring(0, m));
			x.setSubPart(temp.substring(m, temp.length()));
			listOfStrings.add(x);
			n--;
		}
		t--;
	}
	
	for(StringObject x : listOfStrings)
	{
		System.out.println(x.getFullString());
	}
	

}

}



