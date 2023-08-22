package sorting;

public class uniqueduplicate {
    
       
	public static void main(String[] args) {
		int a[]= {10,20,30,30,40,50,60,70,80,70,30,20};
		int i,j,count;
		boolean b[]=new boolean[a.length];
		for(i=0;i<a.length;i++) {
			count=1;
			if(b[i]==true)
				continue;
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
			}
			if(count==1) {
				System.out.println(a[i]+ "->"+count);
			}
		}
	}

}
