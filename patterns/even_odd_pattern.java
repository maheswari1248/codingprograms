package patterns;

public class even_odd_pattern {
	public static void main(String args[]) {
		int count=0,k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=1;j++) {
				if(j%k==0) {
					count++;
				}
				if(count==2) {
					System.out.print(j);
				}
				k++;
				
			}
			System.out.println();
		}
	}

}
