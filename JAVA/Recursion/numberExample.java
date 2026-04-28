package Recursion;

public class numberExample {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it.
        // Print first 5 numbers using recursion
        print(1);
    }
    static void print(int n){
        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        //we are calling the same function with a different argument
        //this is the tail recursion because the recursive call is the last thing that happens in the function
        print(n+1);
    }
}
