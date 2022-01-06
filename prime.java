import java.util.*;
class prime
{
  public static void main(String args[])
  {
    int n,i,flag=0;
    Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
          n = obj.nextInt();

     for(i=2;i<=n/2;i++)
      {
         if(n%i==0)
             flag =1;
       }
    if(flag==1)
    System.out.println("THE NUMBER "+n+ " IS NOT PRIME");
    else
   System.out.println("THE NUMBER "+n+ " IS PRIME");
   }
}

