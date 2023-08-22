
public class interfacing {

	public static void main(String[] args) 
	{
		ximpl x=new ximpl();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
		
	}

}
 interface X{
	 public void m1();
	 
	public void m2();
 }
 interface Y{
	 public void m3();
	 public void m4();
 }
 class ximpl implements X,Y
 {

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m4() {
		System.out.println("m4");
		
	}

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	
   }
	 
 
