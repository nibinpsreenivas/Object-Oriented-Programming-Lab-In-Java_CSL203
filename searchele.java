import java.util.*;
class searchele
{
 public static void main(String args[])
  {
     System.out.println("enter the string");
    Scanner obj = new Scanner(System.in);
    String n = obj.nextLine();
    int y = n.length();
   y--;
  int index=0;
   char x[] = n.toCharArray();
  int flag =0,i;
  System.out.println("enter the character to search");
  char s = obj.next().charAt(0);
  for(i=0;i<=y;i++)
     if(x[i]==s)
      { 
        flag=1;
        index=i;
      }
 
 if(flag==0)
    System.out.println("character not in the string");
   else
     System.out.println("character in the string at index "+(index+1));
  }
 }
   
