import java.util.*;
class squaresum
{
   public static void main(String args[])
  {
     int n,d,result=0,temp,i;
      Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
          n = obj.nextInt();
     temp=n;
     while(n!=0)
    {
       int square=1;
      d=n%10;
      for(i=0;i<2;i++)
       square = square*d;
       result = result + square;
     n=n/10;
    }
   System.out.println("the square of sum of digit of number "+temp+" is "+result);
 }
}
