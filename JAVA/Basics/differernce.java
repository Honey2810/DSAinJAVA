import java.util.Scanner;

public class differernce {
        public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int difference = a - b;
            System.out.println("The difference of these numbers is : " + difference);
         }
        }
}
