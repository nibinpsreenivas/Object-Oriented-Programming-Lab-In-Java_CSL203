import java.util.*;
class pallindrome
{
  public static void main(String args[])
  {
    int n,rev=0,temp;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the number");
    n = obj.nextInt();
    
    temp=n;
  while(n!=0)
   {
    rev = rev*10 + (n%10);
    n=n/10;
   }
   if(temp==rev)
    System.out.println("the number "+n+" is palindrome");
   else
     System.out.println("the number "+n+" is not palindrome");
    } 
}


