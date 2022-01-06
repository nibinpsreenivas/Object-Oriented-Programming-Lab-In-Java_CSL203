import java.util.*;
class addmat
{
  public static void main(String args[])
  { 
      int a[][] = new int[10][10];
      int b[][] = new int[10][10];
      int c[][] = new int[10][10];
     Scanner obj = new Scanner(System.in);
     System.out.println("how many row in martix a");
     int r1 = obj.nextInt();
     System.out.println("how many coln in matrix a");
     int c1 = obj.nextInt();

     System.out.println("how many row in ");
     int r2 = obj.nextInt();
     System.out.println("how many coln");
     int c2 = obj.nextInt();
  if(r1==c2)
  {   
    
     System.out.println("enter the elements into the array a");
     for(int i=0;i<r1;i++)
      for(int j=0;j<c1;j++)
      a[i][j] = obj.nextInt();
      
      System.out.println("enter the elements into the array b");
     for(int i=0;i<r1;i++)
      for(int j=0;j<c1;j++)
      b[i][j] = obj.nextInt();
      
   System.out.println("matrix a");
     for(int i=0;i<r1;i++)
    {
       System.out.println();  
       for(int j=0;j<c1;j++)
       System.out.print(a[i][j]+" ");
    }

   System.out.println("matrix b");
     for(int i=0;i<r1;i++)
    {
       System.out.println();  
       for(int j=0;j<c1;j++)
       System.out.print(b[i][j]+" ");
    }
   
      for(int i=0;i<r1;i++)
        for(int j=0;j<c1;j++)
             c[i][j] =a[i][j]+b[i][j];
     System.out.println("matrix a+b");
     for(int i=0;i<r1;i++)
    {
       System.out.println();  
       for(int j=0;j<c1;j++)
       System.out.print(c[i][j]+" ");
    }
  }
  else
     System.out.println("add is not possible"); 
  }
}
