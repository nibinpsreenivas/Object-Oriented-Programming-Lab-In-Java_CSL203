import java.util.*;
class sumofdigit
{
  public static void main(String args[])
  {
    int n,sum=0;
   Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
          n = obj.nextInt();
    while(n!=0)
     {
       sum= sum+ (n%10);
      n=n/10;
     }
     System.out.println("sum of digit is "+sum);
  }
}
