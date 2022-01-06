import java.util.*;
class factor
 {
   public static void main(String args[])
   {
     int n,i;
     Scanner obj = new Scanner(System.in);
    System.out.println("enter the number");
      n = obj.nextInt();
    for(i=1;i<n;i++)
    {
      if(n%i==0)
        System.out.println(i);
     }
  }
}
   
