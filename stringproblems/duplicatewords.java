package stringproblems;

public class duplicatewords {

	public static void main(String[] args) {
		String s=new String("Hello all good morning Hello morning good mahe");
		String a[]=s.split(" ");
		int count=1;
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			  count=1;
			  if(b[i]==true)
				  continue;
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equalsIgnoreCase(a[j])) {
					
					count++;
					b[j]=true;
					
				}
				
				
				
			}
			  if(count>1)
				System.out.println(a[i] + " ->"+count);
			
			
		}

	}

}
