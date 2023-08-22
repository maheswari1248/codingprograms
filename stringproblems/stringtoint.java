package stringproblems;


public class stringtoint {
	public void character_tO_int(String s,int sum) {
		
		
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='0' && s.charAt(x)<='9') {
				sum=sum+Character.getNumericValue(s.charAt(x));
			}
			
		}
		System.out.println(sum);
		
	}
	public void character_to_int_product(String s,int product ) {
		for(int x=0;x<s.length();x++) {
			if(s.charAt(x)>='0' && s.charAt(x)<='9') {
				product=product*Character.getNumericValue(s.charAt(x));
			}
		}
		System.out.println(product);
		
	}
	public void character_to_string(String s) {
		char c[]={'a','b','c','d'};
		String s1="";
		for(int x=0;x<c.length;x++) {
			s1=s1+c[x];
		}
		System.out.println(s1);
	}
	public void  a3b2c1(String s) {
		int x,num=0;
		char temp=' ';
		for(x=0;x<s.length();x++) {
			if(s.charAt(x)>='a' && s.charAt(x)<='z') {
				temp=s.charAt(x);
			}
			else if(s.charAt(x)>='0' && s.charAt(x)<='9') 
			{
				num=Character.getNumericValue(s.charAt(x));
				for(int i=0;i<num;i++) {
					System.out.print(temp);
				}
			}
		}
	}
	public static void main(String args[]) {
		String s=new String("a1b2c9");
		int  sum=0,product=1;
		stringtoint  s1=new stringtoint ();
		s1.character_tO_int(s,sum);
		s1.character_to_int_product(s, product);
		s1.character_to_string(s);
		s1.a3b2c1(s);
	}

}
