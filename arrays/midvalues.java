package arrays;

public class midvalues {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		for(int i=0;i<=(a.length-1)/2;i++) {
			System.out.println(a[i]);
			
		}
		for(int i=((a.length-1)/2)+1;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
