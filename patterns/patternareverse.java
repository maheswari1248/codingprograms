package patterns;

public class patternareverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           for(int i=1;i<=7;i++)
           {
        	   for(int sp=1;sp<i;sp++) {
        		   System.out.print("-"+"  ");
        		   
        	   }
        	   for(int y=7;y>i;y--) {
        		   System.out.print("*"+"  ");
        		   
        	   }
        	   System.out.println();
           }
	}

}
