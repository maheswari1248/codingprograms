package polymorphism;

public class stringto {
	String name;
	int section,marks,percentage;
	double totalmarks;
	stringto()
	{
		name="maheswari";
		section=1;
		marks=45;
		totalmarks=100;
		percentage=0;
	}
	public String to() 
	{
		percentage=(int) ((marks/100)* totalmarks);
		return percentage+" "+name;
	}
	
	
	/*public String toString() {
		return name+" "+section+" "+marks+" " +percentage;
		
	}*/

	public static void main(String[] args) {
		stringto s=new stringto();
		System.out.println(s.to());
		
	}                

}
