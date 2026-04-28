import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n = ");
            int n = sc.nextInt();
            // upper half
            for (int i = 1; i <= n; i++) {
                // first half
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                // Spaces
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("   ");
                }
                // Second half
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            // lower half
            for (int i = n; i >= 1; i--) {
                // first half
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                // Spaces
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("   ");
                }
                // Second half
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
