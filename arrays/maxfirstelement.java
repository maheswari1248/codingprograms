package arrays;

public class maxfirstelement {

	public static void main(String[] args) {
		
		int a[]= {10,200,3000,40,50};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) 
				max=a[i];
				
			
			
		}
		System.out.println(max);
		
	}

}
