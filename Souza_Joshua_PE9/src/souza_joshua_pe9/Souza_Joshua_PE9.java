// Joshua Teles de Souza
// Science Compute II
// 17/02/2022
// Uses a class named Location for locating a maximal
// value and its location in a two-dimensional array. 
package souza_joshua_pe9;

import java.util.Scanner;
public class Souza_Joshua_PE9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter the number of rows and columns.
        System.out.println("Enter the number of rows and columns. ");

        int row = input.nextInt();
        int column = input.nextInt();

        //Declares a (m) array and prompt the user to enter the array.
        System.out.println("Enter the array.");
        double[][] m = new double[row][column];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        // Calls Location class and locate largest method. 
        //Pass the array.
        Location location = Location.locateLargest(m);
        
        //Print out the results.
        System.out.println("The largest element in the the array " + location.maxValue);
        System.out.println("The location of the largest element is: " + location.row + ", " + location.column);

    }
}
    
   

