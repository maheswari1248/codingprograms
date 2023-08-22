package codinghub.range;

public class exam3range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int start=1,end=100000,copy=0,sq=0,number=0,digit=0,p=1,s=0;
		  for(;start<=end;start++) {
			  copy=start;p=1;digit=0;
			  for(;start>0;start/=10) {
				  digit++;
			  }
			  start=copy;
			  //sq=start*start;
			  sq=(int)Math.pow(start, 2);
			  /*for(;digit>0;digit--) {
				  p=p*10;
				  
			  }*/
			  p=(int)(Math.pow(10,digit));
			  s=sq%p;
			  if(s==start) {
				  System.out.println(start);
			  }
			  
		  }
			
			
			
		}

	}


