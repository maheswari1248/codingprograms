package BasicPrograms;

import java.time.LocalDateTime;
import java.util.Scanner;

public class railway {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cost = 0,number_of_persons = 0;
		System.out.println("please enter your name:");
		String name=sc.nextLine();
		System.out.println("please enter your phone number");
		long phno=sc.nextLong();
		System.out.println("succesfully loggined:");
		System.out.println("todays date");
		LocalDateTime date=LocalDateTime.now();
		System.out.println("todays date"+date);
		System.out.println("please enter the starting point");
	     String start=sc.next();
		System.out.println("please enter the destination point");
		String destination=sc.next();
		switch(destination) {
		case "Nalgonda":
			System.out.println("please enter which coauch you want");
			String coauch=sc.next();
			
			
			if(coauch.equals("sleeper")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=150;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else {
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is confirmed");
				
				
				
				
				
				
				
				
				 break;
				
				
				
				
			}
			if(coauch.equals("2tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=300;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else {
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is confirmed");
				
				
				
				
				
				break;
				
				
				 
				
				
				
				
			}
			if(coauch.equals("3tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=450;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 && age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 && age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else if(age<=30 && Gender.equals("female")){
					
					System.out.println("upper");
					
				}
               else {
					
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
				
				
				
				
				
				
				
				
				
				 
				
				
				
				break;
			}
		case "Guntur":
			System.out.println("please enter which coauch you want");
			String coauch1=sc.next();
			
			
			if(coauch1.equals("sleeper")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=250;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else {
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
				
				
				break;		
			}
			if(coauch1.equals("2tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=600;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else {
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
				
				
			 break;	
			}
			if(coauch1.equals("3tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=950;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 && age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 && age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				 
               else {
					
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
				
				
			
				 
				break;
				
				
				
			}
		case "Chirala":
			System.out.println("please enter which coauch you want");
			String coauch2=sc.next();
			
			
			if(coauch2.equals("sleeper")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=350;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else {
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is confirmed");
				break;
			
			}
			if(coauch2.equals("2tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=900;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else {
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
				
			break;
			}
			if(coauch2.equals("3tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=1450;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 && age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 && age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else if(age<=30 && Gender.equals("female")){
					
					System.out.println("upper");
					
				}
               else {
					
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
				
		      	break;
				
				
			}
		case "Ongole":
			System.out.println("please enter which coauch you want");
			String coauch3=sc.next();
			
			
			if(coauch3.equals("sleeper")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=550;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else {
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
			   break;	
			}
			if(coauch3.equals("2tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=1300;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 || age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 || age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else if(age<=30 && Gender.equals("female")||age<=30 && Gender.equals("male")){
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
                System.out.println("The seat is conformed");
                break;
		
			}
			if(coauch3.equals("3tier")) {
				
				String berth;
				String name1 = null;
				System.out.println("please enter number_of_persons");
				 number_of_persons=sc.nextInt();
				int i=1;
				while(number_of_persons >=i) {
				 cost=2450;
				int seats_availability=30;
				System.out.println("seats avaliability:"+seats_availability);
				System.out.println("please enter name");
				name1=sc.next();
				System.out.println("please enter Gender");
				String Gender=sc.next();
				System.out.println("please enter age:");
				int age=sc.nextInt();
				System.out.println("please enter berth:");
				 berth=sc.next();
				if(age>=45 && Gender.equals("female")|| age>=45 && Gender.equals("male")) {
					berth="lower";
					System.out.println(berth);
				}
				else if((age<=45 && age>=30) && Gender.equals("female") ) {

					berth="middle";
					System.out.println(berth);
				}
				
					else if((age<=45 && age>=30) && Gender.equals("male") ) {
						berth="middle";
						System.out.println(berth);
					
				}
				else if(age<=30 && Gender.equals("female")){
					
					System.out.println("upper");
					
				}
               else if(age<=30 && Gender.equals("male")){
					
					System.out.println("upper");
					
				}
				
				
				
				
				i++;
				}
				break;
				
				
			}
		default:
			System.out.println("you are selected destination is not available");
			
			
		}
		int total=cost*number_of_persons;
		System.out.println(total);
		System.out.println("in case if you want to cancel the ticket");
	  
		
		
		

	}

}
