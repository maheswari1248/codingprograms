package arrays;

public class reversesquare {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int temp=0;
		int b[]=new int[a.length];
		for(int x=a.length-1;x>=0;x--) {
			b[temp]=a[x]*a[x];
			temp++;
		}
		for(int z=0;z<b.length;z++) {
			System.out.print(b[z]+" ");
		}

	}

}
