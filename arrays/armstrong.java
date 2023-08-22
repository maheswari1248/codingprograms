package arrays;

public class armstrong {
	
	

	public static void main(String[] args) {
		int a[]= {10,20,32,153,1,9};
		int count=0,rem=0,p=0,max=0;
		for(int i=0;i<a.length;i++) {
		int	y=a[i];
		count=0;p=0;
			for(int j=a[i];j>0;j=j/10) {
				count++;
			}
			for(int j=a[i];j>0;j=j/10) {
				rem=j%10;
				 p=(int)(Math.pow(rem, count))+p;
			}
			if(p==y) {
				System.out.println(y);
				
				
			}
			
			
		}
		

	}

}
