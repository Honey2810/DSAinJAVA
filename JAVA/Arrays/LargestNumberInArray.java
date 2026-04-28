package Arrays;
import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the Elements of the Array : ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int LargestNumber = arr[0]; // let the largest number in array is at 0th index
        for(int i = 0; i < n; i++){
            if(arr[i] > LargestNumber){
                LargestNumber = arr[i];
            }
        }
        System.out.print("Largest Number in this Array is " +LargestNumber);
        sc.close();
    }
}