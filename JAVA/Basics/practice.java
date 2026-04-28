import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            System.out.print("Enter your age :");
            int age = sc.nextInt();
            System.out.print("Enter your CGPA :");
            Double CGPA = sc.nextDouble();
            System.out.print("You are a student (True/False) : ");
            Boolean isStudent = sc.nextBoolean();
            System.out.println("Hello I am " + name);
            System.out.println("My age is " + age);
            System.out.println("My CGPA is " + CGPA);
            if (isStudent) {
                System.out.println("I am a student.");
            } else {
                System.out.println("I am not a student.");
            }

        }
    }
}
