package rotation;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int count=4,i,temp;
		for( i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[count];
			a[count]=temp;
			count--;
		}
		for(int var:a) {
			System.out.println(var);
		}
		
		
		
		
		


	}

}
