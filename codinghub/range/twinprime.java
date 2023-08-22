package codinghub.range;

public class twinprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int count=0;
        for(int i=1;i<=100;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {//i=1 ,count=1 and break no need
				if(i%j==0 ) {
					count++;
					break;//accuracy is decreased by keeping it break
				}
			}
			
			if(count==0 && i!=1) {
				System.out.println(i);
			}
        }
	}

}
