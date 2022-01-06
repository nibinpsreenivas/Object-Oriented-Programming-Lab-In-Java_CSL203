import java.util.*;
class concatenate
{
  public static void main(String args[])
  { 
      Scanner ob = new Scanner(System.in);
      concatenate obj= new concatenate();
      System.out.println("enter the first number");
      int first = ob.nextInt();
      System.out.println("enter the second number");
      int second = ob.nextInt();
      
      System.out.println("enter the first string");
      String s= ob.next();

      System.out.println("enter the second string");
      String r= ob.next();

      obj.concat(first,second);
      obj.concat(s,r);
  }
 
  void concat(int f,int s)
   {
     System.out.println("concatenated numbers is = "+f+s);
   }
  void concat(String f,String s)
   {
     System.out.println("concatenated string is = "+f+s);
   }
}
