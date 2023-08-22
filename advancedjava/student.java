package advancedjava;

public class student {

	public static void main(String[] args) 
	{
		student1 s=new student1();
		stu s1=s.caldata();
		System.out.println(s1.getname()+ " "+s1.getroll());

	}

}
class stu
{
	private String name;
	private int roll;
	public void setname(String name) 
	{
		this.name=name;
	}
	public void setroll(int roll) 
	{
		this.roll=roll;
	}
	public String getname() {
		return name;
	}
	public int getroll() {
		return roll;
	}
}
class student1{
	stu s1=new stu();
	public stu caldata() {
		s1.setname("mahe");
		s1.setroll(1);
		return s1;
		
	}
}