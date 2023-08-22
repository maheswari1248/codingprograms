
public class condef {

	public static void main(String args[]) 
	{
		 Add a=new Add();
		 a.total();
		  System.out.println( a.totalnum());
		  Add b=new Add(20,20);
		  b.total();
		  System.out.println( b.totalnum());
	}
	

}
class Add
{
	int a,b,total;
	Add()
	{
		a=10;b=20;
			
	} 
	
	Add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void total() {
		total=a+b;
	}
	
	
	public String totalnum() 
	{
		return a+" "+b+" "+total;
	}
}
