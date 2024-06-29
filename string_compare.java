import java.util.*;
class demo
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter First string:");
  String s1=sc.next();
  System.out.println("Enter second string:");
  String s2=sc.next();
  int k=(s1.compareTo(s2));
   System.out.println("value="+k);
  if(k==0)
   System.out.println("Both are same..");
 if(k<0)
   System.out.println("Second string Greater..");
  if(k>0)
   System.out.println("First string Greater..");
 }
}