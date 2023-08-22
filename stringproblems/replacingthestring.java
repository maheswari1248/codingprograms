package stringproblems;

public class replacingthestring 
{

	public static void main(String[] args) 
	{
		String s=new String("Hello this is codinghub user");
		String a[]=s.split(" ");
		String temp=" ",temp1=" ";
		int i=0;
	    for( i=0;i<a.length;i++)
	    { 
	    	if(a[i].equalsIgnoreCase(a[a.length-1])) 
	    	{
	    	temp=a[0];
	    	a[0]=a[a.length-1];
	    	a[a.length-1]=temp;
	    	
	    	}
	    	 else {
	 	    	for(int j=a.length-1;j>=0;j--)
	 	    	{
	 	    		
	 	    		System.out.println(a[j]);
	 	    		
	 	    		}
	 	    	}
	 	    	break;
	 	    }
	    	
	       }
	    
	   
	    
	    
	
}

	


