package stringproblems;

public class Ascendingorder_string {

	public static void main(String[] args) {
		String s1=new String("hello all good morning welcome ato ");
		String [] s2=s1.split(" ");//""
		for(int x=0;x<s2.length;x++) {
			for(int y=0;y<s2.length-x-1;y++) {
				if(s2[y].compareToIgnoreCase(s2[y+1])>0) {
					String temp=s2[y];
					s2[y]=s2[y+1];
					s2[y+1]=temp;
				}
			}
        }
		for(String var:s2) {
			System.out.println(var);
		}
	}

}
