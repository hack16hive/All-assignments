package week5and6.level1;
import java.util.Scanner;
// program to take user input up to 10 positive numbers until user enters 0 or negative number, store in array and calculate total

public class problem2
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in)) {
            double[] numbers = new double[10];
            double total = 0.0;
            int index = 0;
            
            System.out.println("Enter up to 10 positive numbers (Enter 0 or a negative number to stop):");
            
            while (true) 
            {
                if (index == 10) {
                    System.out.println("Array is full.");
                    break;
                }
                
                System.out.print("Enter value for index " + index + ": ");
                double entry = input.nextDouble();
                
                // Check for 0 or negative number to break the loop
                if (entry <= 0) {
                    break;
                }
                
                //  Assign entry to array and increment index
                numbers[index] = entry;
                index++;
            }
            
            // to calculate the total and display numbers
            System.out.println("\n--- Results ---");
            System.out.print("Numbers entered: ");
            for (int i = 0; i < index; i++) {
                System.out.print(numbers[i] + " ");
                total += numbers[i];
            }
            System.out.println("\nTotal Sum: " + total);
        }
    }
}