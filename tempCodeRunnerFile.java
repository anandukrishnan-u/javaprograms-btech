import java.util.Scanner;
import java.io.*;
class hello{
static void bla(String name){
  
System.out.print("hello " + name);


}

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your name");
   String a=sc.nextLine();

  bla(a);

}
}
