package advancedjava;

public class class_return
{

	
	public static void main(String[] args)
	{
		Add a=new Add();
	  int a1[]=	a.method1();
	  for(int temp:a1) {
		  System.out.println(temp);
	  }
		

	}

}
class Add
{
	int a[]=new int[] {10,20,40};
	public int[] method1() 
	{
		for(int i=0;i<a.length;i++) 
			a[i]=a[i]*a[i];
		return a;
		
	}
	
}
