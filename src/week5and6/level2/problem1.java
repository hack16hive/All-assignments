package week5and6.level2;
import java.util.Scanner;

// Zara Payroll System which calculates bonuses based on years of service and outputs total old salary, total bonus payout, and total new salary for 10 employees.

public class problem1
{
        public static void main(String[] args)
        {
            try (Scanner input = new Scanner(System.in)) {
                int numEmployees = 10;
                // Array to store [0] Salary and [1] Years of Service
                double[][] employeeData = new double[numEmployees][2];
                // Array to store [0] New Salary and [1] Bonus Amount
                double[][] bonusResults = new double[numEmployees][2];
                double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

                //  Data Input with Validation
                System.out.println("Enter details for 10 employees:");
                for (int i = 0; i < numEmployees; i++) {
                    System.out.print("Employee " + (i + 1) + " Salary: ");
                    double salary = input.nextDouble();
                    
                    System.out.print("Employee " + (i + 1) + " Years of Service: ");
                    double years = input.nextDouble();
                    
                    // Validation: check for negative numbers
                    if (salary < 0 || years < 0) {
                        System.out.println("Invalid input. Salary and years must be positive. Please re-enter.");
                        i--; // Decrement index to repeat this employee
                        continue;
                    }
                    
                    employeeData[i][0] = salary;
                    employeeData[i][1] = years;
                }

                for (int i = 0; i < numEmployees; i++) {
                    double currentSalary = employeeData[i][0];
                    double yearsOfService = employeeData[i][1];
                    double bonusPercentage;
                    
                    // 5% for > 5 years, otherwise 2%
                    if (yearsOfService > 5) {
                        bonusPercentage = 0.05;
                    } else {
                        bonusPercentage = 0.02;
                    }
                    
                    double bonusAmount = currentSalary * bonusPercentage;
                    double newSalary = currentSalary + bonusAmount;
                    
                    // Save to second array
                    bonusResults[i][0] = newSalary;
                    bonusResults[i][1] = bonusAmount;
                    
                    // Accumulate totals
                    totalOldSalary += currentSalary;
                    totalBonus += bonusAmount;
                    totalNewSalary += newSalary;
                }       // Output Results
                System.out.println("\n--- Zara Payroll Summary ---");
                System.out.printf("Total Old Salary:   $%.2f%n", totalOldSalary);
                System.out.printf("Total Bonus Payout: $%.2f%n", totalBonus);
                System.out.printf("Total New Salary:   $%.2f%n", totalNewSalary);
            }
    }
}