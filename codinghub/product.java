package codinghub;
import java.util.*;

public class product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the item");
		String item=sc.next();
		System.out.println("please enter brand");
		String brand=sc.next();
		switch(item) {
		case "fan":
			
			System.out.println(brand);
			if(brand.equals("crompton")) {
				int price=10000;
				System.out.println("the price is"+price);
				char code='A';
				System.out.println("the code is:"+code);
				System.out.println("please enter the quantity");
				int quantity=sc.nextInt();
				int total=price*quantity;
				System.out.println("the total is:"+total);
			}
			
			else if(brand.equals("Bajaj")) {
				int price=20000;
				System.out.println("the price is"+price);
				char code='B';
				System.out.println("the code is:"+code);
				System.out.println("please enter the quantity");
				int quantity=sc.nextInt();
				int total=price*quantity;
				System.out.println("the total is:"+total);
			}
			break;
            case "Ac":
			
			System.out.println(brand);
			if(brand.equals("Samsung")) {
				int price=100000;
				System.out.println("the price is"+price);
				char code='C';
				System.out.println("the code is:"+code);
				System.out.println("please enter the quantity");
				int quantity=sc.nextInt();
				int total=price*quantity;
				System.out.println("the total is:"+total);
			}
			
			else if(brand.equals("Lg")) {
				int price=200000;
				System.out.println("the price is"+price);
				char code='D';
				System.out.println("the code is:"+code);
				System.out.println("please enter the quantity");
				int quantity=sc.nextInt();
				int total=price*quantity;
				System.out.println("the total is:"+total);
			}
			break;
            case "Light":
    			
    			System.out.println(brand);
    			if(brand.equals("Wipro")) {
    				int price=100;
    				System.out.println("the price is"+price);
    				char code='E';
    				System.out.println("the code is:"+code);
    				System.out.println("please enter the quantity");
    				int quantity=sc.nextInt();
    				int total=price*quantity;
    				System.out.println("the total is:"+total);
    			}
    			
    			else if(brand.equals("Philips")) {
    				int price=200000;
    				System.out.println("the price is"+price);
    				char code='F';
    				System.out.println("the code is:"+code);
    				System.out.println("please enter the quantity");
    				int quantity=sc.nextInt();
    				int total=price*quantity;
    				System.out.println("the total is:"+total);
    			}
    			break;
            case "Invertor":
    			
    			System.out.println(brand);
    			if(brand.equals("SolarEdge")) {
    				int price=10000;
    				System.out.println("the price is"+price);
    				char code='G';
    				System.out.println("the code is:"+code);
    				System.out.println("please enter the quantity");
    				int quantity=sc.nextInt();
    				int total=price*quantity;
    				System.out.println("the total is:"+total);
    			}
    			
    			else if(brand.equals("Abb")) {
    				int price=20000;
    				System.out.println("the price is"+price);
    				char code='H';
    				System.out.println("the code is"+code);
    				System.out.println("please enter the quantity");
    				int quantity=sc.nextInt();
    				int total=price*quantity;
    				System.out.println("the total is:"+total);
    			}
    			break;
                case "Fridge":
    			
    			System.out.println(brand);
    			if(brand.equals("Haier")) {
    				int price=100000;
    				System.out.println("the price is"+price);
    				char code='I';
    				System.out.println("the code is "+code);
    				System.out.println("please enter the quantity");
    				int quantity=sc.nextInt();
    				int total=price*quantity;
    				System.out.println("the total is:"+total);
    			}
    			
    			else if(brand.equals("Whirlpool")) {
    				int price=200000;
    				System.out.println("the price is"+price);
    				char code='H';
    				System.out.println("the code is"+code);
    				System.out.println("please enter the quantity");
    				int quantity=sc.nextInt();
    				int total=price*quantity;
    				System.out.println("the total is:"+total);
    			}
    			break;
		
		
		default:
			System.out.println("nothing will be printed");
		
		}
		
		
		
		

	}

}
