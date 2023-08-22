package model3method;

class Armstrong
{
 public static void main(String ars[])
 {
  int start=1,end=100000,x,y,digits=0,rem=0;
  int sum=0;
  User u=new User();
  for(x=start;x<=end;x++)
  {
   y=x;digits=0;sum=0;
   int result=u.calDigits(x,digits);
   sum=u.calArm(x,result);
   u.checkArm(sum, x);
  }
 }
}
class User
{
 public int calDigits(int x,int digits)
 {
  int y=x;
  for(;y>0;y/=10)
  {
   digits++;
  }//y=0
  return digits;
 }
 public int calArm(int x,int result)
 {
  int y=x,sum=0,rem=0;
  for(;y>0;y/=10)
  {
   rem=y%10;
   sum=(int)(sum+Math.pow(rem, result));
  }
  return sum;
 }
 public void checkArm(int sum,int x)
 {
  if(sum==x)
  System.out.print(sum+" ");
  
 }
}