package sorting;

public class traditionalsorting {

	public static void main(String[] args) {
		int a[]= {10,2,3,4,7,1},x,y,temp=0;
		for(x=0;x<a.length-1;x++) {
			for(y=x+1;y<a.length;y++) {
				if(a[x]>a[y]) {
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
			
		}
		for(int var:a) {
			System.out.println(var);
		}
	}

}
