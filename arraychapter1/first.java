package arraychapter1;

public class first {
	      public void length(int a[],char b[],String s[],boolean d[]) {
	    	  System.out.println(a.length);
	    	  System.out.println(b.length);
	    	  System.out.println(s.length);
	    	  System.out.println(d.length);
	      }
	      public void withoutlength(int a[],char b[],String s[],boolean d[]) {
	    	  int count=0,count1=0,count2=0,count3=0;
	    	  for(int i=0;i<a.length;i++) {
	    		  count++;
	    	  }
	    	  System.out.println(count);
	    	  for(int i=0;i<b.length;i++) {
	    		  count1++;
	    	  }
	    	  System.out.println(count1);
	    	  for(int i=0;i<s.length;i++) {
	    		  count2++;
	    	  }
	    	  System.out.println(count2);
	    	  for(int i=0;i<d.length;i++) {
	    		  count3++;
	    	  }
	    	  System.out.println(count3);
	    	  
	      }
	      public void foreaching(int a[],char b[],String s[],boolean d[]) {
	    	  for(int var:a) {
	    		  System.out.println(var);
	    	  }
	    	  for(char var:b) {
	    		  System.out.println(var);
	    	  }
	    	  for(String var:s) {
	    		  System.out.println(var);
	    	  }
	    	  for(boolean var:d) {
	    		  System.out.println(var);
	    	  }
	      }
          public static void main(String args[]) {
        	  int a[] ={	139 , 12 , 34 , 5 , 566 , 7};
        	  char[] b= {'c','3','(','?'};
        	  String s[]= {	"hello","all","good","Morning","453","?<>|+_"};
        	  boolean d[]= {true,false,true,false,true,true};
        	  first f=new first();
        	  f.length(a, b, s, d);
        	  System.out.println("without reverese");
        	  f.withoutlength(a, b, s, d);
        	  System.out.println("foreach");
        	  f.foreaching(a, b, s, d);
          }
}
