package codinghub.range;

public class firstarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=1,count=0,rem=0,x,y;
		for(x=1;count1<=10;x++) {
			int arm=0;count=0;
			for(y=x;y>0;y/=10) {
				
				rem=y%10;
				count++;
				
			}
			
			for(y=x;y>0;y/=10) {
				rem=y%10;
				arm=(int)(Math.pow(rem, count)+arm);
				
			}
			if(arm==x) {
				System.out.println(x);
				count1++;
				
			}
			
			
		}
	}
}

	


