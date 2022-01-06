import java.util.*;
class factorial
{
  public static void main(String args[])
  {
    int n,i,fact=1;
    Scanner obj = new Scanner(System.in);
      System.out.println("enter the number");
      n = obj.nextInt();
     for(i=1;i<=n;i++)
      {
        fact = fact*i;
      }
     System.out.println(fact);
  }
   
}


