package stringproblems;

public class a3b2c1 {
	public static void main(String args[]) {
		String s= new String("a13b12c11");
		char temp = '0';
		for(int x=0;x<s.length();x++)
		{
			int num=0;
			if(s.charAt(x)>='a' && s.charAt(x)<='z')
			{
				temp=s.charAt(x);
			}
			else if(s.charAt(x)>='0' && s.charAt(x)<='9')
			{
				num=Character.getNumericValue(s.charAt(x));
				num=num*10;
				if(s.charAt(x+1)>='0' && s.charAt(x+1)<='9')
				{
					int num1=Character.getNumericValue(s.charAt(x+1));
					num=num+num1;
					x++;
					for(int i=0;i<num;i++)
					{
						System.out.print(temp);
					}
				}
				
			}
			
		}
	}

}
