package stringproblems;

public class Highest_Vowels {

	public static void main(String[] args)
	{
		String s=new String("MAHE PROGRAMMING QUOTES");
	    String s1[]=s.split(" ");
	    String s3 ="";
	    int count=0,max=0,index=0;
	    for(int i=0;i<s1.length;i++)
	    {
	      s3=s1[i];count=0;
	      for(int j=0;j<s3.length();j++){
	          if(s3.charAt(j)=='A'|| s3.charAt(j)=='E' || s3.charAt(j)=='I' || s3.charAt(j)=='O'||s3.charAt(j)=='U')
	          {
	              count++;
	          }
	      }
	      if(count>max)
	      {
	          max=count;
	          index=i;
	      }
	    }
	    System.out.println(max+" "+ s1[index]);
	}
}
