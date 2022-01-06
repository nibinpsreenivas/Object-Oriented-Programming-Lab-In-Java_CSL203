import java.util.*;
class frequency
{
 public static void main(String args[])
  {
     System.out.println("enter the string");
    Scanner obj = new Scanner(System.in);
    String n = obj.nextLine();
    int y = n.length();
   y--;
   int count = 0;
   char x[] = n.toCharArray();
  int i,flag=0;
  System.out.println("enter the character to count the frequecy count");
  char s = obj.next().charAt(0);
  for(i=0;i<=y;i++)
     if(x[i] == s)
      { 
        flag=1;
        count = count+1;
      }
  if(flag==1)
  System.out.println("the frequency of time the character repeat is "+count);
   else 
    System.out.println("entered the character to count the frequecy count is not in the string");
  }
}
