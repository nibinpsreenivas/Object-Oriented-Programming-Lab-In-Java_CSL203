import java.util.*;
class odd
{
  public static void main(String args[])
 {
    int n;
      Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
          n = obj.nextInt();

   if(n%2==0)
   System.out.println("the number "+n+" is even");
   else 
    System.out.println("the number "+n+" is odd");
  }
}
