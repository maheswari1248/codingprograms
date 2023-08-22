package stringproblems;

public class highestlength {

	public static void main(String[] args) {
		String s=new String("hello maheswari how are you");
		String[] a=s.split(" ");
		int max=a[0].length();
		int x=0,i,index = 0;
		for(i=0;i<a.length;i++) {
			if(max<a[i].length()) {
			index=i;
			max=a[i].length();
			}
			
			
		}
		System.out.println(a[index]+"  "+max);

	}

}
