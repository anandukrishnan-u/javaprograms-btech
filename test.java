import java.util.Scanner;
import java.io.*;
public class test {

 static int ssum(int a,int b){
   return a+b;
 }
 static int ssum(int x,int y,int z){
 return x+y+z;
 }
 static double ssum(double c,double d){
   return c+d;
 }
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("  enter the numbers for sum1");
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("  enter the numbers for sum2");
  int x=sc.nextInt();
  int y=sc.nextInt();
  int z=sc.nextInt();
  System.out.println("  enter the numbers for sum3");
  int c=sc.nextInt();
  int d=sc.nextInt();
  
  int sum1 = ssum(a, b);
  int sum2 = ssum(x, y, z);
  double sum3 = ssum(c, d);
  System.out.println(sum1);
  System.out.println(sum3);

  System.out.println(sum3);

}
}