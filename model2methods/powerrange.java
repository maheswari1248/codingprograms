package model2methods;

public class powerrange {
	int x=1,y=10,res=2;
	public int range() {
		while(x<=y) {
			res=res*x;
			x++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerrange p=new powerrange();
	
   int result= p.range();
   System.out.println(result);

	}

}
