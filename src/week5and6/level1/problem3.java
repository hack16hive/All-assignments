package week5and6.level1;
import java.util.Scanner;

// program for FizzBuzz numbers from 0 to a user-entered positive integer, storing results in an array and displaying them
public class problem3
{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int maxNumber = input.nextInt();
            
            String[] results = new String[maxNumber + 1];
            
            for (int i = 0; i <= maxNumber; i++) {
                if (i == 0) {
                    results[i] = "0"; // Special case for 0
                } else if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }
            
            //  to show the results of the array
            System.out.println("\n--- FizzBuzz Results ---");
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }
    }
}