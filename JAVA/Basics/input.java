import java.util.Scanner; //importing Scanner class

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { //creating Scanner object
            System.out.print("Enter your age: ");
            int age = sc.nextInt(); //reading integer input
            System.out.println("Your age is: " + age); //age output
        }
    }
}
