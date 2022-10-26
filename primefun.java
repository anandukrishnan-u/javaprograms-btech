import java.util.Scanner;
import java.io.*;
class primefun{
static void firstcase(int n){
 
        System.out.println("NOT PRIME"); 
    

}
static void secondcase(int n){
  int flag=0;
    for(int i=2;i<=(n/2);i++){
        if(n%i==0){
            flag=1;
            break;
        }

    }
    System.out.println("NOT PRIME"); 


}

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER THE NUMBERS TO CHECK WHETHER PRIME OR NOT");
   int n=sc.nextInt();
  if(n==1){
      firstcase(n);
  }

  check(n);

}
}
