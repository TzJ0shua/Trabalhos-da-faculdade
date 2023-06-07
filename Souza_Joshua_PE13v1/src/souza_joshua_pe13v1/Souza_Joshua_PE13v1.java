// Souza, Joshua
// Computer Science II
// 03/11/2022
//a test program that creates an array of four objects (two circles and two
//rectangles) and computes their total area using the sumArea method.
package souza_joshua_pe13v1;

import java.util.Scanner;
public class Souza_Joshua_PE13v1 {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //Prompt the user to enter the width and height of rectangle
       System.out.println("Please enter the width and the height of the first rectangle.");
       
       Double height1 = input.nextDouble();
       Double width1 = input.nextDouble();
       
       //Prompt the user to enter the width and height of another rectangle
       System.out.println("Please enter the width and the height of the second rectangle.");
       
       Double height2 = input.nextDouble();
       Double width2 = input.nextDouble();
       
       //Prompt the user to enter the width and height of two circles
       System.out.println("Please enter the radius of two circles.");
       
       Double radius1 = input.nextDouble();
       Double radius2 = input.nextDouble();
       
       //Creates the array with the info
       GeometricObject[] array = {new Rectangle2D(height1, width1), new Rectangle2D(height2, width2), new Circle2D(radius1), new Circle2D(radius2)};
       
       //Display the result
       System.out.println("Total area of elements in array:");
       System.out.printf("%3.5f", sumArea(array));
  }
    
    //Method required
    public static double sumArea(GeometricObject[] a){
        double sum = 0; 
        for (GeometricObject a1 : a) {
            sum += a1.getArea();
        }
        return sum;
    }
}