import java.util.*;
class transpose
{
  public static void main(String args[])
  { 
     
     Scanner obj = new Scanner(System.in);
     System.out.println("how many row");
     int r = obj.nextInt();
     System.out.println("how many coln");
     int c = obj.nextInt();
     int a[][] = new int[10][10];
     int t[][] = new int[10][10]; 
     System.out.println("enter the elements into the array");
     for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
      a[i][j] = obj.nextInt();
     System.out.println("matrix a");
     for(int i=0;i<r;i++)
    {
       System.out.println();  
       for(int j=0;j<c;j++)
       System.out.print(a[i][j]+" ");
    }
    
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
      t[j][i]=a[i][j];

  
     System.out.println("transpose of matrix a is");
    for(int i=0;i<r;i++)
    {
       System.out.println();  
       for(int j=0;j<c;j++)
       System.out.print(t[i][j]+" ");
    }
  }
}
