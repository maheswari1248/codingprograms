package arrays;

public class deletion {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		for(int i=5;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		for(int var:a) {
			System.out.println(var);
		}
		
	}

}
