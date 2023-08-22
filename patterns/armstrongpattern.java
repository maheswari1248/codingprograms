package patterns;

public class armstrongpattern {
	public static void main(String args[]) {
		int x=152;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				int y,rem=0,arm=0,count=0;
				x++;
				for(;x<=10000;x++) {
					arm=0;count=0;
					for(y=x;y>0;y/=10) {
						
						rem=y%10;
						count++;
						
					}
					
					for(y=x;y>0;y/=10) {
						rem=y%10;
						arm=(int)(Math.pow(rem, count)+arm);
						
						
					}
					if(arm==x) 
					{
						System.out.print(x);
						break;
					}
					
					
					 
					
				}
				
			}
			System.out.println();
		}
			
	}
		
	}



