package model3method;

public class prime {
	public static void main(String args[]) {
		int count=0;
		for(int i=1;i<=10;i++) {
			count=0;
			
			test1 t=new test1();
			
		int result=	t.checkingprime(i);
		t.countchecking(result,i);
		
		}
	}


}
class test1{
	int count=0,j;
	public int checkingprime(int i) {
		int j;
		for( j=2;j<=i/2;j++) {
			if(i%j==0) {
				count++;
				break;
			}
			
		}
		return count;
	}
	public void countchecking(int result,int i) {
		if(result==0) {
			System.out.println(i);
		}
		
	}
}
