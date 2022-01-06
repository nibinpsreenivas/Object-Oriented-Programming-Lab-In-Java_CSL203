import java.util.*;
class secondlarele
{
  public static void main(String args[])
  { 
     
     Scanner obj = new Scanner(System.in);
     System.out.println("how many elements");
     int n = obj.nextInt();
     int a[] = new int[10];
     System.out.println("enter the elements into the array");
      for(int i=0;i<n;i++)
      a[i] = obj.nextInt();
      
      int b=a[0];
     for(int i=1;i<n;i++)
      if(a[i]>b)
        b=a[i];
      int c =a[0];
      for(int i=0;i<n;i++)
         if(a[i]>c && a[i]!=b)
           c=a[i];
     System.out.println("the second largest elements is "+c);
  }
}
