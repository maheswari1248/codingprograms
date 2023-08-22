package codinghub;

public class dou {

	public static void main(String[] args) {
		int number=11223,rem=0,rev=0,digit=0,digit2=0,rev1=0,rem1=0,count=0;
		int copy=number;
		for(;number>0;number/=10) {
			rem=number%10;
			rev=rev*10+rem;
			digit++;
			
		}
		System.out.println(rev);

		number=copy;
		int temp=rev;
		for(;rev>0;rev/=10) {
			digit2++;
			
			rem=rev%10;
			
			
			
		}
		while(temp!=0) {
			rem=temp%10;
		
		
		
		
		switch(rem) {
		case 0:
			int i=0;
			while(i>0) {
				count++;
				i=i/10;
			}
			
			if(count==1) {
				System.out.println("zero");
			}
			if(count==2) {
				System.out.println("double zero");
			}
			
			break;

		case 1:
			int j=1;
			while(j>0) {
				count++;
				j=j/10;
			}
			if(count==1) {
				System.out.println("one");
			}
			
			if(count==2) {
				System.out.println("double one");
			}
			
			break;
			
		case 2:
			int k=2;
			while(k>0) {
				count++;
				k=k/10;
			}
			if(count==1) {
				System.out.println("two");
				
				break;
			}
		
			if(count==2) {
				System.out.println("double two");
				break;
			}
			
			break;
			
		case 3:
			int l=3;
			while(l>0) {
				count++;
				l=l/10;
			}
			
			if(count==2) {
				System.out.println("double three");
			}
			else {
				System.out.println("three");
			}
			break;
		case 4:
			int m=4;
			while(m>0) {
				count++;
				m=m/10;
			}
			
			if(count==2) {
				System.out.println("double four");
			}
			else {
				System.out.println("four");
			}
			break;
		case 5:
			int n=5;
			while(n>0) {
				count++;
				n=n/10;
			}
			
			
			if(count==2) {
				System.out.println("double five");
			}
			
			
			  
		case 6:
			int o=6;
			while(o>0) {
				count++;
				o=o/10;
			}
			
			if(count==2) {
				System.out.println("double six");
			}
			
			break;
		case 7:
			int p=7;
			while(p>0) {
				count++;
				p=p/10;
			}
			
			if(count==2) {
				System.out.println("double seven");
			}
			else {
				System.out.println("seven");
			}
			break;
		case 8:
			int q=8;
			while(q>0) {
				count++;
				q=q/10;
			}
			
			if(count==2) {
				System.out.println("double eight");
			}
			else {
				System.out.println("eight");
			}
			break;
		case 9:
			int r=9;
			while(r>0) {
				count++;
				r=r/10;
			}
			
			if(count==2) {
				System.out.println("double nine");
			}
			else {
				System.out.println("nine");
			}
			break;
		
		default:
			System.out.println("nothing");
		}
		temp=temp/10;
	}
		if(count==2) {
			
		}

	}

}
