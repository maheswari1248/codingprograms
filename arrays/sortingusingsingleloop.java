package arrays;

public class sortingusingsingleloop {

	public static void main(String[] args) {
		int a[]= {10,20,30,5,6,7,1};
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
				i=-1;
			}
		}
		for(int var:a) {
			System.out.println(var);
		}

	}

}
