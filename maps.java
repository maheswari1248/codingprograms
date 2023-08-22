import java.util.*;

public class maps {

	public static void main(String[] args) 
	{
	  for(int i=1;i<=5;i++) {
		  int j=1;
		  while(j<=i) 
		  {
			  if(j%i==0) {
				  count++;
			  }
		  }
		  if(count==2) {
			  System.out.println(i);
		  }
	  }
		
	}
}