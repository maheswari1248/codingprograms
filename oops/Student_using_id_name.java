package oops;

import java.util.*;

public class Student_using_id_name
{
class id implements  Comparator<Student>
{

	/*@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.id, o2.id);
	}*/
	public int compare(Student o1,Student o2) {
		return o1.name.compareTo(o2.name);
		
	}
	
}


	public static void main(String[] args)
	{
		Student s=new Student(2,"mahe");
		Student s1=new Student(1,"Bhanu");
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s);
		System.out.println(al);

	}

}
class Student
{
	String name;
	int id;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public String toString()
	{
		return id+" "+name;
	}
	
}

