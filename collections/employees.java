package collections;
import java.util.*;
public class employees {

	public static void main(String[] args) 
	{
			Employee e=new Employee("mahe",1);
			Employee e2=new Employee("bhanu",2);
			ArrayList <Employee> a=new ArrayList<>();
			a.add(e);
			a.add(e2);
			System.out.println(a);
			
			for(Object temp:a)
			{
				System.out.println(temp);
			}
			System.out.println("using iterator");
			
			Iterator i=a.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
			

	}

	

}
class Employee
{
	String name;int id;
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString() 
	{
		return name+" "+ id;
		
	}
}