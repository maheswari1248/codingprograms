package oops;

public class employees {

	public static void main(String[] args) 
	{
		System.out.println("parttime");
		 parttime t=new parttime();
		 t.calsalary();
		 System.out.println("fulltime");
		fulltime f=new fulltime();
		f.calsalary();

	}

}
abstract class employee{
	public abstract void calsalary();
}
class parttime extends employee{
  int salary,wage=6000,hours_per_day=12;
	@Override
	public void calsalary() 
	{
		salary=(wage)*(hours_per_day);
		System.out.println(salary);
	}
	
}
class fulltime extends employee{
	int salary,wage=60998,total_no_of_days=30;
	@Override
	public void calsalary() {
		salary=(wage)*( total_no_of_days);
		System.out.println(salary);
		
	}
	
}