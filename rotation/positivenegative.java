package rotation;

public class positivenegative {

	public static void main(String[] args) {
		int a[]= {-1,5,-8,-2,7,-3,6};
		int b[]=new int[a.length];
		int x=0,y=0;
		for(int i=0;i<b.length;i++) {
			if(a[i]<0) {
				b[x]=a[i];
				x++;
			}
			
		}
		 y=x;
		for(int j=0;j<b.length;j++) {
			if(a[j]>0) {
				b[y]=a[j];
				y++;
				
			}
			
			
		}
		for(int k=0;k<b.length;k++) {
			System.out.print(b[k]);
		}

	}
}


