
public class shapes 
{

	public static void main(String[] args) 
	{
		System.out.println("rectangle");
		rectangle r=new rectangle("red",10,20);
		r.area();
		r.setcolor();
		r.getcolor();
		System.out.println("square");
		square s=new square("red",10);
		s.area();
		s.setcolor();
		s.getcolor();
		System.out.println("circle");
		circles c=new circles("white", 5);
		c.area();
		c.setcolor();
		c.getcolor();
		
	}

}
class shap
{
	String color;
	int area;
    shap(String color)
	{
	 this.color=color;
	 this.area=area;
	}
	public String setcolor() {
		return color;
	}
	public void getcolor() {
		System.out.println(setcolor());
	}
	public void area() {
		System.out.println(area);
	}
	
}

	
class square extends shap{
	
    
    int a;
	square(String color,int a)
	{
		super(color);
		area=a*a;
		
		}
	public void area()
	{
		System.out.println(area);
	}
		
	}
class circles extends shap{
	
    
    int a;
    double area;
	circles(String color,int a)
	{
		super(color);
		area=(int)(3.14*Math.pow(a,2));
		
		}
	public void area()
	{
		System.out.println(area);
	}
		
	}
class rectangle extends shap{
	
    
    int area,length,breadth;
	rectangle(String color,int length,int breadth)
	{
		super(color);
		area=length*breadth;
		
		}
	public void area()
	{
		System.out.println(area);
	}
		
	}
	

	
