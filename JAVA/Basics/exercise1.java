import java.util.Scanner;
public class exercise1{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Your Name : ");
            String name = sc.nextLine();
            System.out.print("Enter your Age : ");
            int age = sc.nextInt();
            System.out.println("Hello I am " +name + " and my age is "  + age );
         }
    }
}