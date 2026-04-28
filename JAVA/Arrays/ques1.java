//Take an array as input from the user and search for a given number x and print the index at which it occurs.
package Arrays;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int numbers[] = new int[size]; 
        System.out.println("Enter the elements of the array:");              // Declaration of array
        // Input
        for(int i = 0 ; i<size ; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the element for which u want index number : ");
        //to find number x
        int x = sc.nextInt();
        for(int i = 0; i<size; i++){
            if(numbers [i] ==  x){
                System.out.println("Number x found at index : " +i);
            }
            sc.close();
        }
    }
}
