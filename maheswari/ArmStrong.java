package maheswari;

public class ArmStrong {
	public static void main(String args[]) {
		int a=153,arm=0,rem=0;
		int temp=a;
		while(a>0) {
			rem=a%10;
			arm=rem*rem*rem+arm;
			a=a/10;
		}
		System.out.println(arm);
		if(temp==arm) {
          System.out.println("arm strong");
		}
		else {
			System.out.println("not a arm strong");
		}
	}

}
