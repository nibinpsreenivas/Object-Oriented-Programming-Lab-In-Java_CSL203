import java.util.*;
class area
{
  public static void main(String args[])
  { 
     Scanner ob = new Scanner(System.in);
     area obj= new area();
      System.out.println("enter the length of rectangle");
      int l = ob.nextInt();
      System.out.println("enter the breath of rectangle");
      int b = ob.nextInt();
      System.out.println("enter the radius of circle");
      float r = ob.nextFloat();
      System.out.println("enter the height of triangle");
      float h = ob.nextFloat();
      System.out.println("enter the base of triangle");
      float ba = ob.nextFloat();     
      obj.areaofshape(l,b);
      obj.areaofshape(h,ba);
      obj.areaofshape(r);
  }
 
  void areaofshape(int l,int b)
   {
      int area = l*b;
       
     System.out.println("area of rectangle = "+area);
   }
  void areaofshape(float h,float ba)
   {
      float area = (h*ba)/2;
       
     System.out.println("area of triangle = "+area);
   }
    void areaofshape(float r)
   {
      double area = 3.14*r*r;
       
     System.out.println("area of circle = "+area);
   }
}
