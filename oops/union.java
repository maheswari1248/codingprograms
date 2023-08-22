package oops;
import java.util.*;

public class union {

	public static void main(String[] args)
	{
		 
	    ArrayList a=new ArrayList(Arrays.asList(1,2,4,3,5));
	    ArrayList b=new ArrayList(Arrays.asList(2,3,4,5,4,4,7,8));
	    HashSet h=new HashSet();
	    for(int i=0;i<a.size()+b.size();i++) 
	    {
	    	h.addAll(a);
	    	h.addAll(b);
	    	
	    	
	    }
	    System.out.println(h);
	   
	    
		

	}

}
