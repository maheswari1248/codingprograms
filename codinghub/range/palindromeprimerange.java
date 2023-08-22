package codinghub.range;

public class palindromeprimerange {

	public static void main(String[] args) {
	 
	 int x,y,digit=0,number=9801,p=1,div=0,rem=0,sum=0,sq=0;
	  int start=1,end=100;
	  for(;start<=end;start++)
	  {
	   digit=0;p=1;//carry forward
	   for(x=start;x>0;x/=10) {
	    digit++;
	   }
	   if(digit%2==0)
	   {
	    digit=digit/2;//2
	    p=(int)(Math.pow(10,digit));
	    rem=start%p;
	    div=start/p;
	    sum=rem+div;
	    sq=sum*sum;
	    if(sq==start)
	     System.out.println(start);
	   }
	  }
		  
		 
		 }
	 
	 }
		


