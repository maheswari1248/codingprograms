package stringproblems;
import java.util.*;
public class duplicatecharacters_using_for {

	public static void main(String[] args) 
	{
		String s=new String("hello all good morning");
		String s2[]=s.split(" ");
		String s3="",ans="";
		int i,j,k;
		for( i=0;i<s2.length;i++)
		{
			s3=s2[i].substring(0,1).toUpperCase()+s2[i].substring(1);
			for(j=0;j<s3.length();j++) 
			{
				for( k=0;k<s3.length();k++) 
				{
					if(s3.charAt(j)==s3.charAt(k))
					{
						break;
					}
				}
				if(j==k) 
				{
					ans=ans+s3.charAt(j);
				}
			}
			
		
		}
		System.out.println(ans);

	}

}
