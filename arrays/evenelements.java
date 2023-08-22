package arrays;

public class evenelements {

	public static void main(String[] args) {
		int a[]=new int[] {10,3,7,8,2};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
