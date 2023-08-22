package arrays;

public class addsamenumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,-1,0};
		int flag=5;
		boolean b=false;
		for(int i=0;i<a.length-1;i++) {
			
				for(int j=i+1;j<a.length;j++) {
					if(a[i]+a[j]==flag) {
						System.out.println(a[i]+ " "+a[j]);
					
				}
			}
			
			}
		
		
		}

}
