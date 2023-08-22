package sorting;

public class selectionsort {

	public static void main(String[] args) {
		int a[]= {1,2,4,2},i,x,y,temp=0;
		for(x=0;x<a.length;x++) {
			i=x;
			for( y=x+1;y<a.length;y++) {
				if(a[i]>a[y]) {
					i=y;
				}
			}
			temp=a[i];
			a[i]=a[x];
			a[x]=temp;
		}
		for(int var:a) {
			System.out.println(var);
		}
		

	}

}
