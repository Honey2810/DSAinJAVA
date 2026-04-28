import java.util.Scanner;

public class MultipleInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.next(); // one word only
            System.out.print("Enter your marks: ");
            float marks = sc.nextFloat();
            System.out.println(name + " got " + marks + " marks.");
        }
    }
}
