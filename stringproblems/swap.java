package stringproblems;

public class swap 
{

	public static void main(String[] args) 
	{
        String s1=new String("1100010001");
        char a[]=s1.toCharArray();
        for(int i=0;i<a.length;i++) {
        	if(a[i]=='1') {
        		System.out.print('0');
        	}
        	else {
        		System.out.print('1');
        	}
        }
       
	}
	
	}


