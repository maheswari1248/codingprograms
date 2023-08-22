package stringproblems;

public class reverese {

	public static void main(String[] args) {
		String s=new String("i.like.this.program.very.much");
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
        	s1=s1+s.charAt(i);
          }
		System.out.println(s1);
		mahe a=new mahe();
		a.reverse2(s);
		
	}

}
class mahe{
	public void reverse2(String s)
	{
		String s2[]=s.split(" ");
		String rev="";
		for(int i=s2.length-1;i>=0;i--) 
		{
			if(i==s2.length-1)
			rev=rev+s2[i];
			System.out.println(rev);
		}
		
	}
}