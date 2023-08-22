package oops;

public class inheritance {

	public static void main(String[] args) {
		
     benz b=new benz();
     b.print();
     b.calling();
	}

}
class car
{
	String brands,color;
	car()
	{
		brands="benz";
		color="black";
	}
	public void calling() {
		System.out.println(brands+" "+color);
	}
}
class benz extends car
{
	String features;
	int cost;
	String brands;
	String color;
	benz()
	{ 
		super();
		features="ac";
		cost=100000000;
		brands="sports";
		color="blue";
	}
	public void print() 
	{
		System.out.println(brands+" "+color+" "+features+" "+cost);
	}
	
}

