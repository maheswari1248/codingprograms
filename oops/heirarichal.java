package oops;

public class heirarichal {

	public static void main(String[] args) {
		mahe m=new mahe();
		m.print();
		m.student();
		vasuda v=new vasuda();
		v.print();
		v.student1();

	}

}
class codinghub
{
	String name;
	String place;
	codinghub(){
		name="codinghub";
		place="hyd";
	}
	public void print() {
		System.out.println(name+" "+place);
	}
}
class mahe extends codinghub
{
	String name,branch,dept;
	int year_of_passing;
	mahe()
	{
		super();
		name="mahe";
		branch="cse";
		dept="btech";
		year_of_passing=2023;
	}
	public void student()
	{
		System.out.println(name+" "+branch+" "+dept+" "+year_of_passing);
	}
}
class vasuda extends codinghub
{
	String name,branch,dept;
	int year_of_passing;
	vasuda()
	{
		super();
		name="vasuda";
		branch="cse";
		dept="btech";
		year_of_passing=2022;
	}
	public void student1()
	{
		System.out.println(name+" "+branch+" "+dept+" "+year_of_passing);
	}
}
