package package1;

public class privateA {
	private int a;
	
	privateA(){
		setA(1000);
	}
	private void main() {
		System.out.println(getA());
	}

	public static void main(String[] args) {
		privateA p=new privateA();
		p.main();

	}
	public int getA() {
		return a;
	}
	public void setA(int a)
	{
		this.a = a;
	}

}
