package week5and6.level1;
import java.util.Scanner;

// program to analyze 5 integers and determine their properties whether they are positive, negative, or zero, and compare the first and last element of the array

public class problem1 
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[5];
            
            System.out.println("Please enter 5 integers:");
            for (int i = 0; i < numbers.length; i++)
            {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }
            
            System.out.println("\n--- Analysis of Numbers ---");
            for (int i = 0; i < numbers.length; i++) {
                int current = numbers[i];
                
                if (current > 0) {
                    // Positive: Check if even or odd
                    if (current % 2 == 0) {
                        System.out.println(current + " is Positive and Even");
                    } else {
                        System.out.println(current + " is Positive and Odd");
                    }
                } else if (current < 0) {
                    // Negative
                    System.out.println(current + " is Negative");
                } else {
                    // Zero
                    System.out.println(current + " is Zero");
                }
            }
            
            // 4. Compare the first and last element
            System.out.println("\n--- Comparison ---");
            int first = numbers[0];
            int last = numbers[numbers.length - 1];
            
            if (first == last) {
                System.out.println("The first element (" + first + ") and last element (" + last + ") are equal.");
            } else if (first > last) {
                System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
            } else {
                System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
            }
        }
    }
}