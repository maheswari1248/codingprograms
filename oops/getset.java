package oops;

public class getset {
	private int a,b;
	public void setters(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int getters() 
	{
		return a+b;
		
	}

	public static void main(String[] args) {
		
        getset g=new getset();
        g.setters(10,20);
        System.out.println(g.getters());
        
	}

}

