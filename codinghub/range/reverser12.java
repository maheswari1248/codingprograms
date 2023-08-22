XXZZAZSpackage codinghub.range;

public class reverser12 {
	public static void main(String args[]) {
		int temp=0,rev=0,sq1=0,sq2=0;
		long sqrev=0;
		 for(int i=12;i<=200;i++)
		 {
			 sq1=i*i;
			 temp=i;
			 sqrev=0;rev=0;
			 while(temp!=0)
			 { 
				 int rem=temp%10;
				 rev=rev*10+rem;
				 temp=temp/10;
			 }
			 sq2=rev*rev;
			 temp=sq2;
			 while(temp!=0)
			 { 
				 int rem=temp%10;
				 	sqrev=sqrev*10+rem;
				 temp=temp/10;
			 }
			 if(sqrev==sq1)
				 System.out.println(i);
		}
		
	}

}
