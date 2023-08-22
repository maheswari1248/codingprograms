package stringproblems;

public class a13b12c14 {

	public static void main(String[] args)
	{
		 String s1=new String("a12b10c13");
		 int x,num = 0,num1;
		 char temp='0';
		 for(x=0;x<s1.length();x++) {
			 if(s1.charAt(x)>='a' &&s1.charAt(x)<='z') {
				 temp=s1.charAt(x);
			 }
			 else if(s1.charAt(x)>='0' &&s1.charAt(x)<='9') {
				num=Character.getNumericValue(s1.charAt(x));
				num=num*10;
				if(s1.charAt(x)>='0' &&s1.charAt(x)<='9') {
					num1=Character.getNumericValue(s1.charAt(x));
					num=num+num1;
					x++;
					for(int i=0;i<num;i++) {
						System.out.print(temp);
					}
				}
				
			 }
			 
			 
		 }

	}
}
