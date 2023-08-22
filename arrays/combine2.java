package arrays;

public class combine2 {
	
	int i,j;
	public void com(int a[],int b[],int c[]) {
		 

		for( i=0;i<a.length;i++) {
			c[i]=a[i];
				
			}
		for( i=0;i<a.length;i++) {
			System.out.print(c[i]);
				
			} 
		for( j=0;j<b.length;j++) {
			c[j]=b[j];
				
			}
		for( j=0;j<b.length;j++) {
			System.out.print(c[j]);
				
			}
		
	
			
		}
	
		
	

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]=new int[a.length*2];
		combine2 d=new combine2();
		d.com(a, b, c);
		
		
		
	}

}
