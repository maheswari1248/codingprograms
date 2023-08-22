package exam;

public class virus 
{
public static void main(String args[])
{
	String s1=new String("Vital Information Resource Under Size");
	String s2[]=s1.split(" ");
	String s="";
	for(int i=0;i<s2.length;i++) {
	    s=s2[i];
	    for(int j=0;j<s.length();j++) {
			System.out.print(s.charAt(0));
			break;
		}
		
	}
	
}
}
