import java.util.*;
class particulreleinarry
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
      System.out.println("enter the particular element to be replaced");
       int p = obj.nextInt();
     for(int i=0;i<n;i++)
          if(p==a[i])
            { 
                System.out.println("enter new element to be placed");
                     int e = obj.nextInt();
                    a[i]=e;
             }
     for(int i=0;i<n;i++)
        System.out.print(" "+a[i]);
  } 
}
