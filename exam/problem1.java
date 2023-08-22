package exam;

public class problem1 {
	int a=766,count=0,p=1,q=1,temp=a;
	public int m2() {
	while(a>0) {
		
		count++;
		a=a/10;
	}
	p=(int)(Math.pow(temp,count));
	 q=(int)(Math.pow(10,count));
	int r=p%q;
	
	if(temp==r){
	     
		System.out.println("automatic");
	    }
	else {
		System.out.println("not a automatic number");
	}
	return 0;
	
     
	}
	
	
	public static void main(String args[]){

	     problem1 m=new problem1();
	      
	      int n1=m.m2();
	      System.out.println(n1);
	      
	}

}
