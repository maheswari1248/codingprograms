package BasicPrograms;
import java.util.*;

public class train {

	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 String t=null;
		 String tname[]= new String[]{"hyd_express","banglore_express","chennai","pune"};
		 String[] gtrain=new String [] {"general_hyd","general_banglore"};
		 int trainid[]= {12655,12588};
		 String destination[]=new String[] {"warangal","khammam","ongole","markapuram"};
		 String coauch[]=new String[] {"sleeper","2tier","3tier","4tier"};
		 int charges[]= {150,300,500,1000};
	     String name=sc.nextLine();
	     System.out.println("choose train");
	     String train=sc.nextLine();
	     System.out.println("choose source");
	      String source=sc.nextLine();
	      switch(source) {
	      
	      case "Warangal":
	    	  for(int i=0;i<tname.length;i++) {
	    		    t= tname[0];
	    	  }
	    	  System.out.println(t);
	    	  
	    	  
	      }
		 
	 }
}
