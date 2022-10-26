import java.io.*;
import java.util.Scanner;
class yt1{
    public void sname(String a){
        System.out.println("NAME IS "+ a);
    }
public void sage(int b){

    System.out.println("age: "+b);
}
public void sclass(int c){
    System.out.println("Class: "+c);
}

public static void main(String[] args){
    
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    String a=sc.nextLine();
    System.out.println("Enter your age");
    int b=sc.nextInt();
    System.out.println("Enter your class");
    int c=sc.nextInt();

    yt1 s1=new yt1();
    s1.sname(a);
    s1.sage(b);
    s1.sclass(c);

}

}
