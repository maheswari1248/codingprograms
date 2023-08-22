package arrays;

public class maxmin {
	int max=0,i,min;
	public void maximum(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
		
	}
	public void minimum(int a[]) {
		for( i=0;i<a.length;i++) {
			if(a[i]<max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
		
		
	}

	public static void main(String[] args) {
		int a[]= {10,200,30,11,90};
        maxmin m=new maxmin();
        System.out.println("maximum");
        m.maximum(a);
        System.out.println("minimum");
        m.minimum(a);
	}

}
