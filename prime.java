import java.util.Scanner;
import java.io.*;
class prime{
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER THE NUMBER TO BE CHECKED WHETHER ODD OR EVEN: ");
   int n=sc.nextInt();
int flag=0;
  for(int i=2;i<=(n/2);i++){
    if(n%i==0){
        flag=1;
        break;
    }

  }
if(flag==1){
    System.out.println("not PRIME");

}
else if(n==1){
    System.out.println("not PRIME");

}
else{
    System.out.println(" PRIME");

}

}
}
