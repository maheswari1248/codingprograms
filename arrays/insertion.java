package arrays;

public class insertion {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100,0};
		int element=55,i,r=5;
		for( i=a.length-1;i>r;i--) {
			a[i]=a[i-1];
		}
		a[i]=element;
		for(int var:a) {
			System.out.println(var);
		}

	}

}
