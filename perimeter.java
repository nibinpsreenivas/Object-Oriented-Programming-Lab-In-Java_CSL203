import java.util.*;
class perimeter
{
  public static void main(String args[])
  { 
     Scanner ob = new Scanner(System.in);
    
      System.out.println("enter the length of rectangle");
      float l = ob.nextInt();
      System.out.println("enter the breath of rectangle");
      float b = ob.nextInt();
      System.out.println("enter the radius of circle");
      float r = ob.nextFloat();
      perimeter obj= new perimeter(l,b);
           obj= new perimeter(r);   
  }
 
  perimeter(float l,float b)
   {
      double p = 2*(l+b);
       
     System.out.println("perimeter of rectangle = "+p);
   }
  perimeter(float r)
   {
      double p = 2*3.14*r;
       
     System.out.println("perimeter of circle = "+p);
   }
}
