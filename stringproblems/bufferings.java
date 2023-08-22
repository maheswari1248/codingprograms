package stringproblems;

public class bufferings {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.append("mahe"));
		String s=new String("maheswari");
		String s1=new StringBuffer(s).reverse().toString();
		
		System.out.println(s1);
	}

}
