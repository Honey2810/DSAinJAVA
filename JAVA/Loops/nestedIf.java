package Loops;
import java.util.Scanner;
public class nestedIf {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            if(age >= 18){
                System.out.print("Do you have a driving license? (true/false): ");
                boolean hasLicense = sc.nextBoolean();
                if(hasLicense){
                    System.out.print("you can Drive");
                } else {
                    System.out.print("you need a license");
                }
            } else {
                System.out.print("you are not eligible to drive");
            }
        }
    }
}
    

