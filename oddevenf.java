import java.util.Scanner;
import java.io.*;
class oddevenf{
static void check(int n){
  
    if(n%2!=0){
        System.out.println("The number is ODD");
    
      }
    else{
        System.out.println("The number is EVEN"); }
    



}

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER THE NUMBERS TO CHECK WHETHER ODD OR EVEN");
   int n=sc.nextInt();


  check(n);

}
}
