package sorting;

public class bubblesort {
	

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,6,1,2};
		int i,j,temp;
		for(j=0;j<a.length;j++) {
			for(i=0;i<a.length-1;i++) 
			{
				if(a[i]>a[i+1]) 
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;				}
			    }
		}
		for(int var:a) {
			System.out.println(var);
		
		}

	}

}
