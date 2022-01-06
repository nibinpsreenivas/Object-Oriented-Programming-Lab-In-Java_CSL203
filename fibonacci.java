import java.util.*;
class fibonacci
{
  public static void main(String args[])
  {
    int n,first=0,second=1,third,i;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the number");
    n = obj.nextInt();
   for(i=0;i<n;i++)
   {
      System.out.println(first);
      third = first + second;
      first = second;
      second = third;
   }
 }
}


