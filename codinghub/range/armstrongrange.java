package codinghub.range;

public class armstrongrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,rem=0,arm=0,count=0;
		for(x=153;x<=10000;x++) {
			arm=0;count=0;
			for(y=x;y>0;y/=10) {
				
				rem=y%10;
				count++;
				
			}
			
			for(y=x;y>0;y/=10) {
				rem=y%10;
				arm=(int)(Math.pow(rem, count)+arm);
				
			}
			if(arm==x) 
			{
				System.out.println(x);
			}
			
			
			 
			
		}
		
		
		
		
		

	}

}
