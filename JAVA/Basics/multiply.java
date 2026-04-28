import java.util.Scanner;
public class multiply{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter First number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
            int multiply = a*b;
            System.out.println("the multiplication of these numbers is :" + multiply);
        }
    }
}
