package practiceproblems;

public class intersection {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5};
		int b[]= {1,2,3,4,6,7,8};
		int i=0,j=0;
		while(i<a.length && j<b.length) {
			if(a[i]==b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			}
			else if( a[i]>b[j]) {
				j++;
			}
			else {
				i++;
			}
		}
	}

}
