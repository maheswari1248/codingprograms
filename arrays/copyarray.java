package arrays;

public class copyarray {
	public  void copy(int a[],int b[]) {
		System.out.println("copying");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
	}
	public void problem2(int a[],int b[]) {
		System.out.println("first reverse");
		for(int i=(a.length-1)/2;i>=0;i--) {
			b[i]=a[i];
		}
		for(int i=(a.length-1)/2;i>=0;i--) {
			System.out.println(b[i]);
		}
		for(int i=((a.length-1)/2)+1;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=((a.length-1)/2)+1;i<a.length;i++) {
			System.out.println(b[i]);
		}
	}
	public void problem3(int a[],int b[]) {
		System.out.println("second reverse");
		for(int i=0;i<=(a.length-1)/2;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<=(a.length-1)/2;i++) {
			System.out.println(b[i]);
		}
		for(int i=a.length-1;i>=((a.length-1)/2)+1;i--) {
			b[i]=a[i];
		}
		for(int i=a.length-1;i>=((a.length-1)/2)+1;i--) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		int b[]=new int[a.length];
		copyarray c=new copyarray();
		c.copy(a, b);
		c.problem2(a, b);
		c.problem3(a,b);

	}

}
