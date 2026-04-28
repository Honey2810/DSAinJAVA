package Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter integer : ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is Odd");
            }
        }
    }

}