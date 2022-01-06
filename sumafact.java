import java.util.*;
class sumafact
{
  public static void main(String args[])
  { 
    sumafact obj= new sumafact();
     System.out.println("enter the number to perfom sum of digit and factorial");
     Scanner ob = new Scanner(System.in);
      int n = ob.nextInt();
     obj.sumofdigit(n);
     obj.fact(n);
   
  }
 
  void sumofdigit(int n)
   {
      int sum=0;
    while(n!=0)
     {
       sum= sum+ (n%10);
      n=n/10;
     }
     System.out.println("sum of digit is "+sum);
   }
   void fact(int n)
   {
     int i,fact=1;
     for(i=1;i<=n;i++)
      {
        fact = fact*i;
      }
     System.out.println("factorial of the digit is "+fact);
   }
}
