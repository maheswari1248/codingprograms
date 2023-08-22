package patterns;

public class pattern2a {
	public static void main(String args[]) {
		int i,j,alp=65;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				System.out.print((char)(alp));
				alp++;
			}
			System.out.println();
		}
	}

	
	
}
