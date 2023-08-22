package patterns;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0,sp=0,rows=8;
		for(x=1;x<=rows;x++) 
		{
			for(sp=rows-1;sp>x;sp--) 
			{
				System.out.print(" ");
			}
			for(y=1;y<=x;y++) {
				if(y==1|| x==y)
				System.out.print("1 ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		for(x=rows;x>=1;x--) 
		{
			for(sp=rows-1;sp>x;sp--) {
			
				System.out.print(" ");
			}
			for(y=1;y<=x;y++) {
				if(y==1|| x==y)
					System.out.print("1 ");
					else
						System.out.print("  ");
			}
			System.out.println();
			
		}
		
		
		}
	}
