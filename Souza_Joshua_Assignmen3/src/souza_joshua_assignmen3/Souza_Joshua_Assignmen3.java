// Souza, Joshua
// Computer Science II
// 01/18/2022
//that program use the exchange rate from currency in U.S. dollars to Chinese RMB. 
//And exchange U.S. dollars to Chinese RMB or vice versa.
package souza_joshua_assignmen3;
import java.util.Scanner;

public class Souza_Joshua_Assignmen3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter the exchange rate 
        System.out.println("Enter the exchange rate from dollars to RMB.");
        double exchangeRate = input.nextDouble();
        
        
        //Prompt the user the case of conversion
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa.");
        int cases = input.nextInt();
        
        
        //Prompt the user the amount and convert it.
        double amount; 
        switch(cases)
        {
            case 0 -> {
                System.out.println("Enter the dollar amount.");
                amount = input.nextDouble();
                System.out.println("$" + amount + " is " + (amount * exchangeRate) + " yuan.");
                break;
            }
            
            
            case 1 -> {
                System.out.println("Enter the RMB amount.");
                amount = input.nextDouble();
                System.out.println(amount + " yuan is $" + (amount/exchangeRate));
                break;
            }
        }
        
        
    }
    
}
