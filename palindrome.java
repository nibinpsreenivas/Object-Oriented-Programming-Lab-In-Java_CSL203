import java.util.*;
class palindrome
{
 public static void main(String args[])
  {
     System.out.println("enter the string");
    Scanner obj = new Scanner(System.in);
    String n = obj.nextLine();
    int y = n.length();
   y--;
  int j;
   char x[] = n.toCharArray();
  int flag =0,i;
  for(i=0,j=y;i<=y/2;i++,j--);
     if(x[i]!=x[j]) 
        flag=1;
       
 
 if(flag==0)
    System.out.println("string is palindrome");
   else
     System.out.println("string is not palindrome");
  }
 }
   
