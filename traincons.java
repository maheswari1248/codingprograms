import java.util.Scanner;

public class traincons {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter source");
		String source=sc.next();
		System.out.println("please enter destination");
		String destination=sc.next();
		System.out.println("please select coauch");
		String coauch=sc.next();
		System.out.println("enter no of persons");
		int persons=sc.nextInt();
		
	  station s=new station("mahe",1,source,destination,persons,coauch);
	  s.pricecal();
	  System.out.println(s.caltotaal());
	  
	 
     
	}

}
class station
{
	
	String name;
	int sno;
	String source;
	String destination;
	int price1;
	int persons;
	int total;
	String coauch;
     station(String name,int sno,String source,String destination,int persons,String coauch){
	  this.name=name;
	  this.sno=sno;
	  this.source=source;
	  this.destination=destination;
	  this.persons=persons;
	  this.coauch=coauch;
	 
	  	}
	
	public void pricecal() {
		
		if(destination.equals("ongole"))
		{
		if(coauch.equals("sleeper"))	
		price1=1260;
		else if(coauch.equals("ac"))
			price1=3500;
		}
		if(destination.equals("warangal")){
			if(coauch.equals("sleeper"))	
				price1=260;
				else if(coauch.equals("ac"))
					price1=750;
			}
		if(destination.equals("khammam")){
			if(coauch.equals("sleeper"))	
				price1=500;
				else if(coauch.equals("ac"))
					price1=1000;
			
			}
		if(destination.equals("chirala")){
			
			if(coauch.equals("sleeper"))	
				price1=1100;
				else if(coauch.equals("ac"))
					price1=3300;
			}
		
		
		total=price1 *persons;
	}
		
		
	public String caltotaal() 
	
	{
		
		return sno+" "+name+" "+source+" "+" " +destination+" "+persons+" "+" "+coauch+" " +price1+" "+total;
	}
}