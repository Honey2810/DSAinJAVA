import java.util.Scanner;
public class one{
    public static void printMyName(String name){
        System.out.println(name);
        return ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name = ");
        String name = sc.nextLine();
        printMyName(name);
        sc.close();
    }
}