package arrays;

import java.util.Arrays;

public class combine2alternate {
	  public static void main(String args[]) {
		  int a[]= {1,2,3,4};
		  int b[]= {5,6,7,8};
		  int d[]=new int[a.length+b.length];
		  int x,y=0;
		  for(x=0;x<a.length;x++) {
			  d[y++]=a[x];
			  d[y++]=b[x];
		  }
		  System.out.println(Arrays.toString(d));
	  }
		

}
