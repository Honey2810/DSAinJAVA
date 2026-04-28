package Loops;

import java.util.Scanner;

public class Grade{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your Marks : ");
            int marks = sc.nextInt();
            if (marks>=90){
                System.out.print("Grade A");
            } else if(marks>=80){
                System.out.print("Grade B");
            } else if(marks>=70){
                System.out.print("Grade C");
            } else if(marks>=60){
                System.out.print("Grade D");
            } else if(marks>=50){
                System.out.print("Grade E");
            } else{
                System.out.println("Grade F");
                System.out.println("You are Fail");

            }

        }

    }
}