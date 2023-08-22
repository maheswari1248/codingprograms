package codinghub.range;

public class factorialrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,fact=1;
		for(x=1;x<=10;x++) {
			fact=1;
          for(y=1;y<=x;y++) {
        	  fact=fact*y;
          }
          System.out.println(fact);
          
          
	}
		
	}

}
