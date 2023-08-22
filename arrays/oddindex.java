package arrays;

public class oddindex {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6};
		int prod=1;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				prod=prod*a[i];
				
			}
			
		}
		System.out.println(prod);
	}

}
