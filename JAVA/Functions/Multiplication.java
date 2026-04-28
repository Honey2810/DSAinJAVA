import java.util.Scanner;
public class Multiplication {
    public static int Multiply(int a , int b){
        int Multiplication = a * b;
        return Multiplication;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Multiply(a , b);
        System.out.println("The Multiplication of two numbers is = " + result);
        sc.close();
    }
}
