package stringproblems;

public class deleteduplicatewords {

	public static void main(String[] args) 
	{
		String s1=new String("Hello all good morning Hello all");
		String s2[]=s1.split(" ");
		int i,j;
		 String ans="";
		for(i=0;i<s2.length;i++)
		{
			for(j=0;j<s2.length;j++) 
			{
				if(s2[i].equals(s2[j])) 
				{
				  break;
			    }
		    }
			if(i==j) 
			{
				ans=ans+s2[i];
			}
	   }
		System.out.println(ans);
	}

}
