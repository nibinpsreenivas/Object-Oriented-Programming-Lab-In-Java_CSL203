import java.util.*;
class student
{
  public static void main(String args[])
  { 
    student obj= new student();
     obj.read();
   
  }
 
  void read()
   {
     Scanner ob = new Scanner(System.in);
     int m[] = new int[5];
     System.out.println("enter the roll number");
      int r = ob.nextInt();
     for(int i = 0;i<5;i++)
       {
         System.out.println("enter the mark of subject "+(i+1));
            m[i] = ob.nextInt();
        }
      display(m,r);
    }
   void display(int m[],int r)
   {
   
     System.out.println("roll number"+r);
     
     for(int i = 0;i<5;i++)
       {
         System.out.println("mark of subject "+(i+1)+"is"+m[i]);
            
        }
    }
}
