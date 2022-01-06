import java.util.*;
class amstrong
{
  public static void main(String args[])
  {
    int a,temp,count=0,result=0,d,i;
   Scanner obj = new Scanner(System.in);
    System.out.println("enter the number");
    a = obj.nextInt();
    temp=a;
  while(a!=0)
   {
    a=a/10;
    count++;
   }
  a=temp;
 while(a!=0)
   { int multi=1;
     d=a%10;
      for(i=0;i<count;i++)
       multi =multi*d  ;
    a=a/10;
    result = result+multi;
   }
   a=temp;
   if(result==temp)
    System.out.println("the number "+a+" is amstrong");
   else
     System.out.println("the number "+a+" is not amstrong");
    } 
}

