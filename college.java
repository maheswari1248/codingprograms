import java.util.Scanner;

public class college {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter name");
		String name1=sc.next();
		System.out.println("please enter mobile number");
		String mobilenumber1=sc.next();
		System.out.println("please enter degree");
		System.out.println("pg"+" ug");
		String degree=sc.next();
		switch(degree) {
		case  "pg":
			System.out.println("please enter pgbranch");
			System.out.println("Mtech"+" Mcom");
			String pgbranch=sc.next();
			System.out.println("please enter streams");
			System.out.println("Mtech==>cse,ece"+" Mcom==>computers,general");
			String streams1=sc.next();
			pg g=new pg(name1,mobilenumber1,pgbranch,streams1);
			System.out.println(g.display());
			System.out.println(g.print1());
			g.branch_details1();
			g.streams1();
			g.fees_details1();
			break;
		case  "ug":
			System.out.println("please enter ugbranch");
			System.out.println("btech"+" bcom");
			String ugbranch=sc.next();
			System.out.println("please enter streams");
			System.out.println("btech==>cse,ece"+" || " +" bcom==>computers,general");
			String streams=sc.next();
			ug p=new ug(name1,mobilenumber1,ugbranch,streams);
			System.out.println(p.display());
			System.out.println(p.print());
			p.branch_details();
			p.streams();
			p.fees_details();
			break;
			default:
				System.out.println("not a degree");
			
		}
		
		
		
		
		
		
	}

	

}
class colleges
{
	String collegename;
 int collegecode;
	
	colleges()
	{
	  collegename="codinghub";
	  collegecode=123456;
	}
	public String display() {
		
		return "welcome to the "+collegename+" "+collegecode;
	}
	
}
class ug extends colleges
{  
	int fees;
	String name;
	String mobilenumber;
	String ugbranch;
	String streams;
	ug(String name,String mobilenumber,String ugbranch,String streams)
	{
		super();
		this.name=name;
		this.mobilenumber=mobilenumber;
		this.ugbranch=ugbranch;
		this.streams=streams;
		
	  
	}
	public String print() {
		return name+" "+mobilenumber;
	}
	public void branch_details() 
	{
		switch(ugbranch) 
		{
		case "btech":
			System.out.println("btech");
			break;
		case "bcom":
			System.out.println("bcom");
			break;
		
		}
	}
	
	public void streams() 
	{
		
		if(ugbranch.equals("btech"))
		{
			
			if(streams.equals("cse")) {
				System.out.println("cse");
			}
			else if(streams.equals("ece")) {
				System.out.println("ece");
			}
			
		}
		else if(ugbranch.equals("bcom"))
		{
			//System.out.println("computers"+ " general");
			if(streams.equals("computers")) {
				System.out.println("computers");
			}
			else if(streams.equals("general")) {
				System.out.println("general");
			}
			
		}
		
	}
	public void fees_details() 
	{
		if(ugbranch.equals("btech") && streams.equals("cse")) {
			fees=500000;
		}
		else if(ugbranch.equals("btech") && streams.equals("ece")) {
			fees=400000;
		}
		else if(ugbranch.equals("bcom") && streams.equals("computers")) {
			fees=200000;
		}
		else if(ugbranch.equals("bcom") && streams.equals("general")) {
			fees=400000;
		}
		System.out.println(fees);
			
	}
	
}