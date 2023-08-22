package loops;


public class numberrepetition {

	public static void main(String[] args) 
	{
		int a=193,sum=0,rem=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
		int b=a*2;
		int c=a*3;
         a=a*1000+b;
         a=a*1000+c;
         System.out.println(a);
         int temp=a;
         while(a>0) {
        	 rem=a%10;
        	 switch(rem) {
        	 case 1:
        		 count1++;
        		 if(count1==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 
        		 break;
        		
        	 case 2:  
        		 count2++;
        		 if(count2==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 
        		 break;
        	 case 3:
        		 count3++;
        		 if(count3==1) {
        			 System.out.println(rem);
        			
        		 }
        		 break;
        	 case 4:
        		 count4++;
        		 if(count4==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 break;
        	 case 5:
        		 count5++;
        		 if(count5==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 break;
        	 case 6:
        		 count6++;
        		 if(count6==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 break;
        	 case 7:
        		 count7++;
        		 if(count7==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 break;
        	 case 8:
        		 count8++;
        		 if(count8==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 break;
        	 case 9:
        		 count9++;
        		 if(count9==1) {
        			 System.out.println(rem);
        			 
        		 }
        		 break;
        		 
        	 }
        	 
        	 a=a/10;
         }
         if(count1==1 &&count2==1 &&count3==1 &&count4==1 &&count5==1 &&count6==1 &&count7==1 &&count8==1 && count9==1) {
    		 System.out.println("lappy number");
    	 }
    	 else {
    		 System.out.println("Not a lappy number");
    	 }
         
         
         
        	     
        	       
        	   
        	   
           }


		
		
		   
			
		
		

	}


