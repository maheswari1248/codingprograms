package patterns;

public class duplicate {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{30,40,50},{50,60,70}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					System.out.print(a[i][j]+"  ");
				}
				else {
					System.out.print("0"+"  ");
				}
				
			}
			System.out.println();
		}
		
	}

	}


