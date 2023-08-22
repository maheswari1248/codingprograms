
public class arrrays {

	public static void main(String[] args) {
		int a[]=new int[] {10,20,30,40,50};
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
		System.out.println("Rverse order");
		for(int x=a.length-1;x>=0;x--) {
			System.out.println(a[x]);
		}
	}

}
