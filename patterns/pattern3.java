package patterns;

public class pattern3 {
	public static void main(String args[]) {
	for(int i=1;i<5;i++) {
		/*for(int j=1;j<=i;j++) {
			System.out.print((char)(j+64)+"   ");
			
			
		}*/
		
		
		for(int k=4;k>=1;k--) {
			for(int l=k;l<=k;l--) {
				System.out.print((char)(l+64));
			}
			
		}
		
		System.out.println();
		
	}
	}

}
