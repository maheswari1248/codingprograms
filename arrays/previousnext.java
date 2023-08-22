package arrays;

public class previousnext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {1,2,3,4,5};
         
         int b[]=new int[a.length];
         
         for(int i=0 ;i<a.length;i++) {
        	 b[i]=a[i];
         }
         
         
         int x=0; 
         for(x=0;x<b.length;x++) 
         { 
         if(x==0) 
         { 
         b[x]=a[x]+a[x+1]; 
         } 
         else if (x==a.length-1) 
         { 
         b[x]=a[x]+a[x-1]; 
         } 
         else 
         { 
         b[x]=a[x-1]+a[x+1]; 
         } 
          
         } 
         for(x=0;x<a.length;x++) 
         { 
          System.out.println(b[x]); 
         } 
     
         
         }
	}


