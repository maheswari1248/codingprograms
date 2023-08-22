package stringproblems;

public class palindromesentence {
	

	public static void main(String[] args) {
		String s1=new String("madam arora teaches malayalam");
		String s2[]=s1.split(" ");
		int i,j,k;
		String temp="";
		String rev = "";
		/*for(i=0;i<s2.length;i++)
		{
			temp=s2[i];
			rev="";
			for(j=temp.length()-1;j>=0;j--) {
				rev=rev+temp.charAt(j);
			}
			if(rev.equals(temp)) {
				System.out.println(temp);
			}
			
		}*/
		for(k=0;k<s2.length;k++) {
			StringBuffer sb=new StringBuffer(s2[k]);
			sb.reverse();
			String s4=sb.toString();
			if(s4.equals(s2[k])) {
				System.out.println(s4);
			}
		}
		
		

	}

}
