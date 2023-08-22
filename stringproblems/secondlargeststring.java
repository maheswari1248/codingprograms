package stringproblems;

public class secondlargeststring {

	public static void main(String[] args) {
	  String  s=new String("helloa all goodn hmorning");
		String a[]=s.split(" ");
		String s3="";
		int max=0,smax=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(max<a[i].length())
			{
				max=a[i].length();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			
			if(smax<a[i].length()&&smax<max && a[i].length()!=max)
			{
				smax=a[i].length();
				s3=a[i];
			}
		}
		System.out.println(s3+" "+smax);
		
	}

}
