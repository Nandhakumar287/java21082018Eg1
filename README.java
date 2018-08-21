import java.io.*;
import java.util.*;

  public class Interval_Even
  {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Value1=");
    int value1=sc.nextInt();
    System.out.println("Enter value2=");
    int value2=sc.nextInt();
    System.out.println("----------");
    for(int i=value1;i<=value2;i++)
    {
      if(i==value2)
      {
        System.out.println("-----(End/No) Interval------");
      }
      else if(i%2==0)
      {
        System.out.println("->"+i);
      }
      else
      {
        System.out.println(" ");
      }
    }
   }
  } 
        
       
