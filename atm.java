import java.util.Scanner;
import java.io.*;
class atm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("\n\n\t\tWELCOME TO THE _____ BANK\n\n\n");
        System.out.println("\t\tENJOY THE WORLD OF BANKING!!\n");
        System.out.println("PRESS 1 FOR CREATING NEW ACCOUNT,2 FOR CHECKING BALANCE,");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("You choosed to create a new account");
            break;
            case 2:
            System.out.println("You choosed to check the balance");
            break;
            default:
            System.out.println("ERROR");
            break;

        }


    }


}