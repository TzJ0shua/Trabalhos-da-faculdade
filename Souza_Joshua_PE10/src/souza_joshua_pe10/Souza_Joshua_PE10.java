// Joshua Teles de Souza
// Compute Science II
// 17/02/2022
// Program that prompts the user to enter a
// positive integer and displays all its smallest factors in decreasing order.
package souza_joshua_pe10;

import java.util.Scanner;
public class Souza_Joshua_PE10 {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         // Prompt the user to enter a positive integer.
         System.out.println("Enter the a positive Integer. ");
         int number = input.nextInt();
        
         //Creates a new stack.
         StackOfIntegers stack = new StackOfIntegers();
        
         System.out.println("The smallest factor of " + number + " are : ");
         
         //calls the method to found the factors
         smallest(number, stack);
         
         while (!stack.empty()){
             System.out.print(stack.pop() + " ");
            
         }
         System.out.println();
    }
   public static void smallest(int number, StackOfIntegers stack) {
       //First divisor we will be trying.
       int i = 2;
       while(number / i != 1){
           if (number% i == 0){
           stack.push(i);
           number /= i;
           }
       else i++;
           
       }
       
       stack.push(number);
   } 
}

