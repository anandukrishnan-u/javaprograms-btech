import java.util.Scanner;
import java.io.*;
class oddoreven{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER THE NUMBER TO BE CHECKED WHETHER ODD OR EVEN: ");
   int n=sc.nextInt();

  if(n%2!=0){
    System.out.println("The number is ODD");

  }
else{
    System.out.println("The number is EVEN");


}
}
}
