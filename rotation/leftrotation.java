package rotation;

public class leftrotation {
	public void left(int a[],int r) {
		for(int i=r;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<r;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public void right(int a[],int r) {
		for(int i=a.length-r;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		for(int i=0;i<a.length-r;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int r=1;
		leftrotation l=new leftrotation();
		System.out.println("left rotation");
		l.left(a,r);
		//System.out.println("rightrotation");
		//l.right(a, r);

	}

}
