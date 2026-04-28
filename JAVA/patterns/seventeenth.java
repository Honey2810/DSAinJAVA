import java.util.Scanner;

public class seventeenth {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter n = ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                // Spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                // Stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for (int i = n; i >= 1; i--) {
                // Spaces
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                // Stars
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}