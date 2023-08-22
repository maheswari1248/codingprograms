import java.util.Scanner;

public class Member_employee_manager {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter name:");
		String name=sc.next();
		System.out.println("please enter age:");
	    int age=sc.nextInt();
	    System.out.println("please enter phonenumber:");
	    int phonenumber=sc.nextInt();
	    System.out.println("please enter address:");
	    String address=sc.next();
		String department="doctor";
		String specialization="bipc";
		String department1="Manager";
		String specialization1="hr";	
		employee e=new employee(name,age,phonenumber,address,24000,department,specialization);
	      e.print();
	      e.salary();
      
      System.out.println("please enter name:");
		 name=sc.next();
		 System.out.println("please enter age:");
	    age=sc.nextInt();
	    System.out.println("please enter phonenumber:");
	    phonenumber=sc.nextInt();
	    System.out.println("please enter address:");
	     address=sc.next();
	     
      manager m=new manager(name,age,phonenumber,address,50000,department1,specialization1);
      m.print1();
      m.salary();
	}

}
class Member
{
	String name;
	int age;
	int phonenumber;
	String address;
	int salary;
	Member(String name,int age,int phonenumber,String address,int salary)
	
	{
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
	}
	public void salary(){
		System.out.println(salary);
		
	}
	
}
class employee extends Member{
	String department;
	String specialization;

	employee(String name,int age,int phonenumber,String address,int salary,String department, String specialization)
	{
		super(name, age, phonenumber,address,salary);
		this.department=department;
		this.specialization=specialization;
		
	}
	public void print()
	{
		System.out.println(name+" "+age+" "+address+" "+phonenumber+" "+" "+department+" "+specialization);
	}
}
class manager extends Member{
	String department1;
	String specialization1;
	manager(String name, int age, int phonenumber, String address, int salary,String department1,String specialization1) {
		super(name, age,phonenumber, address,salary);
		this.department1=department1;
		this.specialization1=specialization1;
	}
	public void print1()
	{
		System.out.println(name+" "+age+" "+address+" "+phonenumber+" "+" "+department1+" "+specialization1);
	}
}