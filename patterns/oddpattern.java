package patterns;

public class oddpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int x=1,count=0;
           for(int i=1;i<=4;i++) {
        	   for(int j=1;j<=i;j++) {
        		   
        		   if(j%x==0) {
        			   count++;
        		   }
        		   if(count==2) {
        			   System.out.println(j);
        		   }
        		   else {
        			   System.out.print("*");
        		   }
        		   
        		   
        	   }
        	   System.out.println();
           }
	}

}
