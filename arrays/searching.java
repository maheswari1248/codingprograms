package arrays;

public class searching {//linear search

	public static void main(String[] args) {
		int a[]= {1,2,3,10,9,8,7,6,5,4};
		int flag=10;
		boolean b=false;
		for(int x=0;x<a.length;x++) {
			if(a[x]==flag) {
				
				b=true;
				
			}
			
			
			
		}
		if(b==true) {
			System.out.println("element found");
		}
		else {
			System.out.println("not found");
		}

	}

}
