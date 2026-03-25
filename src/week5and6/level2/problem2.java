package week5and6.level2;
import java.util.Scanner;

// Reverse a number using arrays. The program should take a number as input, find the count of digits, store the digits in an array, and then display the digits in reverse order.

public class problem2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int originalNumber = input.nextInt();
        
        // Handle negative numbers for digit counting
        int tempNumber = Math.abs(originalNumber);
        
        int count = 0;
        if (tempNumber == 0) {
            count = 1;
        } else {
            int digitCounter = tempNumber;
            while (digitCounter > 0) {
                digitCounter /= 10;
                count++;
            }
        }

        int[] digits = new int[count];
        tempNumber = Math.abs(originalNumber);
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Create an array to store elements in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            // Because digits[i] already pulled the last digit first, 
            // the 'digits' array is effectively already reversed.
            // We map them to the new array to follow the hint's structure.
            reversedDigits[i] = digits[i];
        }

        System.out.print("Reversed Number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();

        input.close();
    }
} 