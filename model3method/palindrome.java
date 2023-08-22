package model3method;
class test{
	
	public int method1(int num) {
		int rem=0,rev=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	 
	 public void ispalindrome(int result,int number) {
		 if(result==number)
			 System.out.println("palindrome");
		 else
			 System.out.println("not a palindrome");
	 }
	 
}
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
        test t=new test();
        
        
        int result=t.method1(number);
       
       System.out.println(result);
       
       t.ispalindrome(result,number);
       
       
       
	}

}
