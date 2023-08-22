package stringproblems;

public class oddindexreverse {

	public static void main(String[] args) {
		String s1=new String("hello all good morning whatsapp") ;
		String s2[]=s1.split(" ");
		 String s3="";
		for(int i=0;i<s2.length;i++) {
			if(i%2!=0) {
				String s4=s2[i];
				for(int j=s4.length()-1;j>=0;j--) {
					System.out.print(s4.charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(s2[i]);
			}
			System.out.print(" ");
			
		}
		
		
	}

}
