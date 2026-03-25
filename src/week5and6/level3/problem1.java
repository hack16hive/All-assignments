package week5and6.level3;
import java.util.Scanner;

//
public class problem1
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            long number = sc.nextLong();
            long temp = Math.abs(number);
            long originalNumber = temp;
            
            // to Find the count of digits in the number
            int count = 0;
            if (temp == 0) {
                count = 1;
            } else {
                while (temp > 0) {
                    temp /= 10;
                    count++;
                }
            }
            
            // to Find the digits in the number and save them in an array
            int[] digits = new int[count];
            temp = originalNumber;
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = (int) (temp % 10);
                temp /= 10;
            }
            
            // to Find the frequency of each digit
            // Define a frequency array of size 10 (for digits 0-9)
            int[] frequency = new int[10];
            
            // Loop through the digits array and increase the frequency
            for (int digit : digits) {
                frequency[digit]++;
            }
            
            // to Display the frequency of each digit
            System.out.println("Digit Frequency:");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
                }
            }
        }
    }
}