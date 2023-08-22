package arrays;

public class secondlargest {

	public static void main(String[] args) {
		int a[]= {1800,260,70,8,900};
		int i,j,f=a[0],s=a[0];
		for(i=1;i<a.length;i++) {
			if(f<a[i]) {
				s=f;
				f=a[i];
				
			}
			else if(s<a[i] && f>a[i]) {
				s=a[i];
			}
			 if(s==f){
				s=a[i];
			}
		}
		System.out.println(s);
		
	}

}
