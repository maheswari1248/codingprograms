package model3method;

public class star {

	public static void main(String[] args) {
		int x = 0;
		for( x=1;x<=5;x++) {
			test3 t=new test3();
			t.star(x);
		}

	}

}
class test3{
	public void star(int x) {
		int y;
		for(y=1;y<=x;y++) {
			System.out.print("*");
		}
		System.out.println();
		
	
	}
}
