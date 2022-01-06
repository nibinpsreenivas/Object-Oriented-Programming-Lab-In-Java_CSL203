import java.util.*;
class sumofelearry
{
  public static void main(String args[])
  { 
     int sum=0;
     Scanner obj = new Scanner(System.in);
     System.out.println("how many elements");
     int n = obj.nextInt();
     int a[] = new int[10];
     System.out.println("enter the elements into the array");
      for(int i=0;i<n;i++)
      a[i] = obj.nextInt();

     for(int i=0;i<n;i++)
      sum= sum+a[i];
    System.out.println("sum of element is "+sum);
  }
}
