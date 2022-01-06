import java.util.*;
class freqandrev
{
  public static void main(String args[])
  { 
     freqandrev obj= new freqandrev();
     System.out.println("enter the string");
     Scanner ob = new Scanner(System.in);
     String s = ob.nextLine();
      int z = s.length();
     char x[]=s.toCharArray();
     System.out.println("enter the character to find the frequency of time it repeat");
     char y = ob.next().charAt(0);
       obj.frequency(x,y,z);
       obj.rev(x,z);
   
  }
 
  void frequency(char x[],char y,int z)
   {
      int count=0,i;
    for(i=0;i<z;i++)
       if(y==x[i])
         count++;
    if(count==0)
         System.out.println("entered the character is not in the string");
       else
              System.out.println("enter the character repeat "+count+"times");
    }
 void rev(char x[],int z)
   {
      int i,j;
      char r[]= new char[20]; 
      for(i=0,j=z-1;i<z;i++,j--)
         r[j]=x[i];
      System.out.println("the string in rev form is");
      for(i=0;i<z;i++)
         System.out.print(r[i]);
    }
}
        


