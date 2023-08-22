package maheswari;

public class level {

		public static void main(String[] args) {
			city c=new city();
		    c.print();
		    c.travel();
		    barks b=new barks();
		    
		    b.barking();

		}

	}
	class dog
	{ 
		String name;
		String breed;
		int cost;
		int months;
		dog(){
			name="sunny";
			breed="german shepherd";
			cost=90000;
			months=6;
		}
		public void print()
		{
			System.out.println(name+" "+breed+" "+cost+" "+months);
		}
		
		
	}
	class barks extends dog
	{
		String sounds;
		barks(){
			super();
			sounds="bow bow";
		}
		public void barking() 
		{
		  System.out.println(sounds);	
		}
	}
	class city extends dog
	{
		String name;
		city()
		{
			super();
			name="ongole";
		}
		public void travel() { 
		System.out.println(name);
		}
	}
