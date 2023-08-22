package rotation;
import java.util.*;
public class rightrotating{

	public static void main(String[] args)
	{  
	Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
		int a[]= new int[size];
		int r=2,i,j;
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		 for(i=0;i<r;i++) {
			 int temp=a[a.length-1];
			 for(j=a.length-1;j>0;j--)
			 {
				a[j]=a[j-1]; 
			 }
			 a[0]=temp;
		 }
		for(int var:a) {
			System.out.print(var);
		}
	}

}
