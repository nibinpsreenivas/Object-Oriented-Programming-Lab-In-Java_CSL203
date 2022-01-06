import java.util.*;
class larnxn
{
  public static void main(String args[])
  { 
     
     Scanner obj = new Scanner(System.in);
     System.out.println("how many row");
     int r = obj.nextInt();
     System.out.println("how many coln");
     int c = obj.nextInt();
     int a[][] = new int[10][10];
     System.out.println("enter the elements into the array");
     for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
      a[i][j] = obj.nextInt();
     
     for(int i=0;i<r;i++)
    {
       System.out.println();  
       for(int j=0;j<c;j++)
       System.out.print(a[i][j]+" ");
    }
    int l=0;
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
      if(a[i][i]>l)
        l= a[i][j];

     System.out.println("the largest element is "+l);
  }
}
