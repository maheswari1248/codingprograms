package model3method;

public class arraysum {
	int sum=0,prod=1;
	public int arr(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		return sum;
	}
	public int oddindex(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				prod=prod*a[i];
			}
		}
		return prod;
	}
	

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4};
		arraysum b=new arraysum();
		System.out.println("sum of numbers:"+b.arr(a));
		
		System.out.println("product of a numbers : " +b.oddindex(a));
		
	}

}
