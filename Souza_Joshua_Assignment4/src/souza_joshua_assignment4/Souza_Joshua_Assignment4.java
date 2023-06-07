// Souza, Joshua
// Computer Science II
// 01/18/2022
// A program that reads the following information(name, hours worked, 
// hourly pay rate and taxes and prints a payroll statement
package souza_joshua_assignment4;
import java.util.Scanner;
public class Souza_Joshua_Assignment4 {


    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     //Prompt the user for the employee's name
     System.out.println("Enter the employee's name: ");
     String name = input.next();
     //Prompt the user worked hours
     System.out.println("Enter number of hours worked in a week: ");
     Double hours = input.nextDouble();
     //Prompt the user hourly pay rate
     System.out.println("Enter hourly pay rate: ");
     Double payRate = input.nextDouble();
     //Prompt the user the federal tax rate
     System.out.println("Enter federal tax withholding rate: ");
     Double federalTaxRate = input.nextDouble();
     //Prompt the user the state tax rate
     System.out.println("Enter state tax withholding rate: ");
     Double statalTaxRate = input.nextDouble();
     
     
     
     double grossPay, federalWithholding, stateWithholding, totalDeduction, netPay;
     
     System.out.print(
             "Employee Name: " + name 
             + "\nHours Worked:" + hours 
             + "\nPay rate: " + payRate 
             + "\nGross pay: " + (grossPay = hours * payRate) + 
             "\nDeductions:\n    Federal Withholding (" + federalTaxRate + "%): $"
             + (federalWithholding = grossPay * federalTaxRate) 
             + "\n    State Withholding ("+ statalTaxRate + "%): $" + (stateWithholding = grossPay * statalTaxRate)
             + "\n    Total Deduction: " + (totalDeduction = federalWithholding + stateWithholding) 
             + "\nNet pay: " + (netPay = grossPay - totalDeduction)
             
             
     );
    }
    
}
