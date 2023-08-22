package codinghub;

public class doubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0;
		int a=0,rev=0,temp=0,count=0;
		while(a>0) {
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
			
			
		}
		
		System.out.println(rev);
		temp=rev;
		while(rev>0) {
			rem=rev%10;
			System.out.println(rem);
			rev=rev/10;
			
		}
		
		while(temp!=0) {
			rem=temp%10;
			
			switch(rem) {
                case 0:
				
				count++;
				
				if(count==1) {
					System.out.println("zero");
					break;
				}
				else if(count==2){
					System.out.println("double");
					break;
				}
				
				break;

			case 1:
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				
				break;
			case 2:
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
				
				
			case 3:
				
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
			case 4:
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
				
			case 5:
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
				
			case 6:
				
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
			case 7:
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
				
			case 8:
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
				
			case 9:
				
				count++;
				if(count==1) {
					System.out.println("zero");
				}
				else if(count==2){
					System.out.println("double");
				}
				break;
			
			
			
			default:
				System.out.println("nothing");
			}
			temp=temp/10;
			
		}
		
		

	}
}


