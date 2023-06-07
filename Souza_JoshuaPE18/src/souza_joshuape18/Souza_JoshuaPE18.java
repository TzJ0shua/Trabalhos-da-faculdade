// Souza, Joshua
// Computer Science II
// 15/08/2022
// A test program that prompts the user to enter a decimal number and displays
// its binary equivalent.
package souza_joshuape18;

import java.util.Scanner;

public class Souza_JoshuaPE18 {

    public static void main(String[] args) {  
      // Create a new input scan
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter a decimal and stores it
      System.out.println("Enter a decimal number.");
      int value = input.nextInt();
      
      // Print to the user the result
      System.out.println("The binary of " + value + " is " + dec2Bin(value));
    }
    
    public static String dec2Bin(int value){
        String result = ""; 
        return dec2Bin(value, result);
    }
    
    // Recursive helper method
    public static String dec2Bin(int value, String result){
        if (value / 2 == 0)
            return (value % 2) + result;
        else 
            return dec2Bin(value / 2, (value % 2) + result);
    }
}
