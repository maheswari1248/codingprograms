package rotation;

public class storingrotations {
	public void leftstoring(int a[],int r) {
		int temp,x;
		for(int y=0;y<2;y++) {
		     temp=a[0] ;
			for(x=0;x<a.length-1;x++) {
				a[x]=a[x+1];
				
			}
			a[a.length-1]=temp;
			}
			
			
			for(int var:a) {
				System.out.println( var);
			}
	}
	public void rightstoring(int a[],int r1) {
		for(int y=0;y<=r1;y++) {
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
	}
		for(int var:a) {
			System.out.println(var);
		}
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int r=0,x,temp,r1=0;
		
		storingrotations s=new storingrotations();
		
		System.out.println("right rotating");
		s.rightstoring(a, r);
		
		
	}
	

}
