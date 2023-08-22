package oops;

public class racecondition 
{

	public static void main(String[] args)
	{
		race a=new race();
		Thread t1=new Thread(a,"thread1");
		t1.start();
		Thread t2=new Thread(a,"thread 2");
		t2.start();

	}

}
class race implements Runnable
{
  int x;
	@Override
	public void run()
	{
		for(int y=0;y<10;y++)
		System.out.println(Thread.currentThread().getName()+"===>"+(++x));
		
	}
	
}