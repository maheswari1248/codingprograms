package sorting;

public class commandline {
	public void linearsearch(int a[],int search) {
		int x;
		boolean status=false;
		for(x=0;x<a.length;x++) {
			if(a[x]==search) {
			status =true;
			}
			
		}
		if(status==true) {
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		}
	}
	
	public static void main(String[] args) {
	  int a[]= {10,30,20,45,67};
		int search=Integer.parseInt(args[0]);
		commandline l=new commandline();
		l.linearsearch(a, search);
		
	}

	

}

