package practiceproblems;

import java.util.Arrays;

public class evenodd {
    public static void main(String args[]) {
    	int a[]= {10,15,30,20,19,17,54,99,77,125};
    	int  b[]=new int[a.length];
		int i;
    	int c[]=new int[a.length];
    	int d[]=new int[a.length];
    	System.out.println("even");
    	for( i=0;i<a.length;i=i+2) {
    		b[i]=a[i];
    		
    		System.out.println(b[i]);
    		
    	}
    	
  	
    	System.out.println("odd");
    	for( i=0;i<a.length;i++) {
    		 c[i]=a[i];
    		 if(i%2!=0)
    			System.out.println(c[i]);
    		
    		
    	}
    	
    	
    	
    	
    }
    
}
