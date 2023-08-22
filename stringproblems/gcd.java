package stringproblems;

public class gcd 
{
  public static void main(String args[])
  {
	 
	/*int a=100,b=200,i=1,gcd=0;
	while(a>=i&&b>=1)
	{
		if(a%i==0 &&b%i==0) 
		{
			gcd=i;
		}
		i++;
	}
	System.out.println(gcd);
  }*/
	  
  String s1=new String("ABCABC");
  String s2=new String("ABCABC");
    char c[]=s1.toCharArray();
    char d[]=s2.toCharArray();
    String ans="",ans1="";
    String gcd="";
    int i,j,k,l;
    for( i=0;i<c.length;i++)
    {
    	for( j=0;j<c.length;j++) {
    		if(c[i]==c[j]) {
    			break;
    		}
    	
    	}
    	if(i==j)
    	ans=ans+c[i];
    
    	
    }
    System.out.println(ans);
    for( k=0;k<d.length;k++)
    {
    	for( l=0;l<d.length;l++) {
    		if(d[k]==d[l]) {
    			break;
    		}
    	
    	}
    	if(k==l)
    	ans1=ans1+d[k];
    
    	
    }
    System.out.println(ans1);
    if(ans.equals(ans1)) {
    	gcd=ans;
    	
    }
    
    else if(ans.equalsIgnoreCase(ans))
    {
    	gcd="''";
    }
    System.out.println(gcd);
  
  }
  }

