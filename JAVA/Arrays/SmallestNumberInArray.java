package Arrays;

import java.util.Scanner;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int SmallestNumber = arr[0]; // let the smallest number will be in first position of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] < SmallestNumber) {
                SmallestNumber = arr[i];
            }
        }
        System.out.println("Smallest Number in this Array is : " + SmallestNumber);
        sc.close();
    }
}
