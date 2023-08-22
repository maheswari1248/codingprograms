package sorting;

public class usingsingleloopsorting {
      public static void main(String args[]) {
    	  int a[]= {10,4,3,2,1},x,temp=0;
    	  for(x=0;x<a.length-1;x++) {
    		  if(a[x]>a[x+1]) {
    			  temp=a[x];
    			  a[x]=a[x+1];
    			  a[x+1]=temp;
    			  x=-1;
    		  }
    	  }
    	  for(int var:a) {
    		  System.out.println(var);
    	  }
      }
}
