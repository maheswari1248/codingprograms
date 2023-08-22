package BasicPrograms;
import java.util.*;

public class grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter hardness");
		int hardness=sc.nextInt();
		System.out.println("please enter carbon");
		double carbon=sc.nextDouble();
		System.out.println("please enter tensile");
		int tensile=sc.nextInt();

		if(hardness>50 && carbon<0.7 && tensile>5600) {
			System.out.println(" grade is 10");
		}
		else if(hardness>50 && carbon<0.7 ) {
			System.out.println(" grade is 9");
		}
		else if( carbon<0.7 && tensile>5600) {
			System.out.println(" grade is 8");
		}
		else if( hardness>50 && tensile>5600) {
			System.out.println(" grade is 7");
		}
		else if(hardness>50 || carbon<0.7 || tensile>5600) {
			System.out.println(" grade is 6");
		}
		else if(hardness>50 && carbon<0.7 && tensile>5600) {
			System.out.println(" grade is 5");
		}
		else {
			System.out.println("Not a grade");
		}
		

	}

}
