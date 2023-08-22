package model2methods;

public class arrays {
	public void method() {
		int a[]= {10,20,4,59};
		for(int j :a) {
			System.out.println(j);
		}
	}
	public void method2(int a1[]) {
		 int a[]=new int[] {10,20,30,5,6};
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		
	}

	public static void main(String args[]) {
		arrays a=new arrays();
		a.method();
	
		a.method2(a1[]);
		
		
	}
	

}
