// Souza, Joshua
// Computer Science II
// 01/12/2022
// Calculates the future value of a investment based on the investment amount
//the interest rate and time(years).
package souza_joshua_assignment2;

import java.util.Scanner;

public class Souza_Joshua_Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter investiment amount: ");
        double amount = input.nextDouble();
        
        System.out.println("Enter annual interest rate in percentage: ");
        double rate = input.nextDouble();
        rate /= 1200;
        
        System.out.println("Enter number of years: ");
        double years = input.nextDouble();
        
        
        double futureInvestmentValue = 
                amount * Math.pow(1 + rate, years * 12);
        
        
        System.out.println("Future Value is $" + futureInvestmentValue);
    }
    
}
