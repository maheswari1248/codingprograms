
public class twinprime {

	public static void main(String[] args) {
		int a=3,b=5;
		int c=a,d=b;
		int count=0, i=1,j=1,count1=0,count3=0;
		while(a>=i) {
			if(a%i==0) {
				count++;
				
			}
			i++;
		}
		System.out.println(count);
		if(count==2) {
			System.out.println("prime");
		}
		while(b>=j)
		{
			if(b%j==0) {
				count1++;
			}
			j++;
		}
		System.out.println(count);
		if(count1==2) {
			System.out.println("prime");
		}
		
	
		if(count==2 && count1==2)
		{ 
			for(int k=c;k<d;k++) 
			{
				count3++;
			}
			System.out.println(count3);
			if(count3==2) {
				System.out.println("twin prime");
			}
			else {
				System.out.println("not twin prime");
			}
			
		}
		
	}

}
