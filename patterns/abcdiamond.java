package patterns;

public class abcdiamond {
	public static void main(String args[]) {
		int alp=65;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alp));
				alp++;
			}
			System.out.println();
		}
		
	}

}
