package patterns;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) {
	       	  for(int j=i;j<=6;j++) {
	       		  System.out.print("-");
	       	  }
	       	  for(int k=6;k>=i;k--) {
	       		  System.out.print("*");
	       	  }
	       	  System.out.println();
	         }

	}

}
