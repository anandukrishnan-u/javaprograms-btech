import java.io.*;
import java.util.Scanner;
class yt2{
    public String sname(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name: ");
        String a=sc.nextLine();
        return a;
    }
public int sage(){
    Scanner sc=new Scanner(System.in);

    System.out.println("AGE");
    int b=sc.nextInt();
    return b;
}
public int sclass(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Cls");
    int c=sc.nextInt();
    return c;
}

public static void main(String[] args){
    
	
    yt2 s1=new yt2();
    String x=s1.sname();
    int y=s1.sage();
    int z=s1.sclass();
    System.out.println("Name is "+x);
    System.out.println("Age is "+y);
    System.out.println("class is "+z);

}

}
