package patterns;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5,i,j;
      for( i=1;i<=r;i++) {
    	  for( j=1;j<=r;j++) {
    		  if((i==r)||(j==r)||(j==1)||(i==1)||(i+j)==(r+1)||(i==j)) {
    			  System.out.print("*"+"  ");
    		  }
    		  else 
    			  System.out.print("   ");
    		  
    		  
    	  }
    	  System.out.println();                                                                                                                                                          
    	  }
	}

}                                                                                                                                        
