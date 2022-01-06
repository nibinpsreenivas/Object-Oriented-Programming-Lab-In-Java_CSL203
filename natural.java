import java.util.*;
class natural
{
  public static void main(String args[])
  {
    int n,sum=0,i;
      Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
          n = obj.nextInt();
     for(i=2;i<n;i++)
      {
         sum = sum +i;
       }
   System.out.println("the sum is "+sum);
}

}
