package arrays;

public class searchingmiddle {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,0};
		int element=10,j;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
			flag=true;
			}
		}
		if(flag==true) {
			System.out.println("element found");
		}
		else {
			for( j=a.length-1;j>(a.length-1)/2;j--) {
				a[j]=a[j-1];
			}
			a[j]=element;
			for(int var:a) {
				System.out.print(var+" ");
			}
		}
	}

}
