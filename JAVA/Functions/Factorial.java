import java.util.Scanner;

public class Factorial {
    public static void calculateFactorial(int n) {
        if (n < 0) {
            System.out.print("Factorial is not defined for negative numbers");
            return;
        }
        // loop
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.print("The Factorial of " + n + " is = " + factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
        sc.close();
    }
}