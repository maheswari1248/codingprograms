package practiceproblems;

public class primehigh {

	public static void main(String[] args) {
		int a=1236,rem=0,max=0,i=1,count=0,j=1,high=0,z;
		while(a>0) {
			rem=a%10;
			count=0;
			if(rem>max) {
				max=rem;
				while(max>=i) {
					
					if(max%i==0) {
						z=i;
						
						while(z>=j) {
						  if(z%j==0) {
							  count++;
						  }
						  j++;
						}
						if(count==2) {
							if(z>high) {
								high=i;
							}
							System.out.println(high);
						}
						
						
					}
					i++;
				}
				
			}
			
			a=a/10;
		}
	}

}
