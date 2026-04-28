import java.util.Scanner;
public class division{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Entger first number : ");
            int a = sc.nextInt();
            System.out.print("ednter second number : ");
            int b = sc.nextInt();
            int division = a/b;
            System.out.println("The division of these numbers is : " + division);
        }
    }
}
