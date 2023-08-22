package patterns;

public class afdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}

}
