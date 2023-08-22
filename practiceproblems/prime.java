package practiceproblems;

public class prime {
    public static void main(String args[]) {
    	int a=6,i=1,j=1,count=0;
    	while(a>=i) {
    		if(a%2==0) {
    			while(i>=j) {
    				if(i%j==0) {
    					count++;
    				
    			}
    				j++;
    				if(count==2) {
    					System.out.println(i);
    				}
    				
    		}
    		i++;
    	}
    }
    }
}



