import java.util.*;
interface Sports
{
 int marks=25;
 void main();
}
class Student
{
 String name;
 int rno,s1,s2,s3;
 Scanner s=new Scanner(System.in);
 void get()
 {
  System.out.println("enter roll no. and name");
  rno=s.nextInt();
  name=s.next();
  System.out.println("Enter marks of three subject");
  s1=s.nextInt();
  s2=s.nextInt();
  s3=s.nextInt();
 }
}
class Result extends students implement Sports
{
 int total;
 public void show()
 {
  total=S1+S2+S3+mark;
  System.out.println("Total mark is" +total);
 }
}
class InterfaceDemo
{
 public static void main(String args[])
 {
  Result r1=new Result();
  r1.get();
  r1.show();
 }
}