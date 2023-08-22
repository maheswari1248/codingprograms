
class pg extends colleges{
int fees;
String name1;
String mobilenumber1;
String pgbranch;
String streams1;
pg(String name1,String mobilenumber1,String pgbranch,String streams1)
{
	super();
	this.name1=name1;
	this.mobilenumber1=mobilenumber1;
	this.pgbranch=pgbranch;
	this.streams1=streams1;
	
  
}
public String print1() {
	return name1+" "+mobilenumber1;
}
public void branch_details1() 
{
	switch(pgbranch) 
	{
	case "Mtech":
		System.out.println("Mtech");
		break;
	case "Mcom":
		System.out.println("Mcom");
		break;
	
	}
}

public void streams1() 
{
	if(pgbranch.equals("Mtech"))
	{
		if(streams1.equals("cse")) {
			System.out.println("cse");
		}
		else if(streams1.equals("ece")) {
			System.out.println("ece");
		}
		
	}
	else if(pgbranch.equals("Mcom"))
	{
		if(streams1.equals("computers")) {
			System.out.println("computers");
		}
		else if(streams1.equals("general")) {
			System.out.println("general");
		}
		
	}
	
}
public void fees_details1() 
{
	if(pgbranch.equals("Mtech") && streams1.equals("cse")) {
		fees=1000000;
	}
	else if(pgbranch.equals("Mtech") && streams1.equals("ece")) {
		fees=800000;
	}
	else if(pgbranch.equals("Mcom") && streams1.equals("computers")) {
		fees=500000;
	}
	else if(pgbranch.equals("Mcom") && streams1.equals("general")) {
		fees=400000;
	}
	System.out.println(fees);
		
}
}







