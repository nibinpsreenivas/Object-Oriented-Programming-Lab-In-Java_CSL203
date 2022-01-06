import java.util.*;
class replaceele
{
 public static void main(String args[])
  {
     System.out.println("enter the string");
    Scanner obj = new Scanner(System.in);
    String n = obj.nextLine();
    int y = n.length();
   y--;
  
   char x[] = n.toCharArray();
  int flag =0,i;
  System.out.println("enter the character to be replaced");
  char s = obj.next().charAt(0);
  for(i=0;i<=y;i++)
     if(x[i] == s)
      { 
        System.out.println("enter the new character to be placed");
        char v = obj.next().charAt(0);
        x[i]=v;
      }
 for(i=0;i<=y;i++)
             System.out.print(x[i]);
  }
}
