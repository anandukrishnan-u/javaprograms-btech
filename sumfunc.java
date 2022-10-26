import java.util.Scanner;
import java.io.*;
class sumfunc{
static void add(int x,int y){
  
int sum=x+y;
System.out.println("Sum= " +sum);



}

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER THE NUMBERS TO FIND THE SUM");
   int a=sc.nextInt();
   int b=sc.nextInt();


  add(a, b);

}
}
