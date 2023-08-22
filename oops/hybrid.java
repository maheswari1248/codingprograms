package oops;

public class hybrid {

	public static void main(String[] args) {
		result r=new result();
		r.print();
		r.results();

	}

}
class Animal{
	String name;
	int rollno;
	Animal(){
		name="mahe";
		rollno=21;
	}
	
}
class Dog extends Animal
{
	String name;
	int months;
	Dog(){
		super();
		name="sunny";
		months=12;
	}
	public void print() {
		System.out.println(name+" "+months);
	}
}
class cat extends Animal
{
	String name1;
	int month;
      cat(){
    	  super();
		name1="snowbell";
		month=1;
	}
	public void print() {
		System.out.println(name1+" "+month);
	}
}
class result extends Dog,cat
{
	String name2;
	int age;
	result(){
		super();
		name2="mahe";
		age=3;
	}
	public void results() {
		System.out.println(name2+" "+age);
	}
}
 
