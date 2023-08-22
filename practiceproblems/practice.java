package practiceproblems;
import java.util.*;

import javax.naming.InsufficientResourcesException;

import javax.naming.InsufficientBalanceException;
public class practice
{
public static void withdraw(int currentbalance,int requiredbalance)throws InsufficientResourcesException{
	
	if(currentbalance>=requiredbalance)
	{
		System.out.println(currentbalance);
	}
	else 
	{
		throw new InsufficientResourcesException("Exception occurs");
	}
	}


	public static void main(String[] args) throws InsufficientResourcesException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter currentbalance");
	   int currentbalance=sc.nextInt();
	   int requiredbalanace=10000;
		
		
		
		

	}
	public	class InsufficientResources extends RuntimeException
	{
	     public InsufficientResources(String str) 
		{
			super(str);
		}
		
	}




}
