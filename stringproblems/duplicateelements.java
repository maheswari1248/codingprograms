package stringproblems;
import java.util.*;
public class duplicateelements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String("hello mahe How are yooouuu");
		char[] s2=s.toCharArray();
		int count=1,j,count1=sc.nextInt();
		boolean b[]=new boolean[s2.length];
		for(int i=0;i<s.length();i++) 
		{
			if(s2[i]!=' ') {
				count=1;
				if(b[i]==true)
					continue;
				for(j=i+1;j<s2.length;j++) {
					if(s2[i]==s2[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count==count1) {
					System.out.println(s2[i]+ "->"+count);
				}
			
		}
		}
		
	}

}
