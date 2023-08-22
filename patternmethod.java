

public class patternmethod {
	void mahe() {
		for(int i=1;i<=3;i++) {
	       	  for(int j=i;j<=3;j++) {
	       		  System.out.print(" ");
	       	  }
	       	  for(int k=1;k<=i;k++) {
	       		  System.out.print("*");
	       	  }
	       	  for(int l=1;l<=i;l++) {
	       		  if(i==l) {
	       		  System.out.print("");
	       		  }
	       		  else {
	       			  System.out.print("*");
	       		  }
	       	  }
	       	
	       	  System.out.println();
	       	
	         }
	}
		
	
	void maheswari() {
		for(int i=2;i>=1;i--) {
	       	  for(int j=i;j<=3;j++) {
	       		  System.out.print(" ");
	       	  }
	       	  for(int k=1;k<=i;k++) {
	       		  System.out.print("#");
	       	  }
	       	for(int l=1;l<=i;l++) {
	       		if(i==l) {
	       			System.out.print("");
	       		}
	       		else
	       		  System.out.print("#");
	       	  }
	       	  System.out.println();
	         }
		}
	
      
  
	public static void main(String args[]) {
		
		patternmethod m=new patternmethod();
		m.mahe();
		m.maheswari();
		
	       	  
		
		
		
	}

}
