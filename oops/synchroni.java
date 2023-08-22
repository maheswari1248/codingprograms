package oops;

public class synchroni 
{

	public static void main(String[] args)
	{
		synch s=new synch();
		Thread t1=new Thread(s,"Thread1");
		t1.start();
		Thread t2=new Thread(s,"Thread2");
		t2.start();

	}

}
class synch implements Runnable
{
	int x;
	public void run() {
		method1();
	}
	public synchronized void method1() {
		for(int y=0;y<10;y++)
		System.out.println(Thread.currentThread().getName()+"====>"+(++x));
	}
}
