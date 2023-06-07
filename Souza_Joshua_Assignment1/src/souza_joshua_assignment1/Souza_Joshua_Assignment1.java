// Souza, Joshua
// Computer Science II
// 01/11/2022
// Calculates the change (increase or dicrease) of the US population over five years.
package souza_joshua_assignment1;

/**
 *
 * @author joshu
 */
public class Souza_Joshua_Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double inicialPopulation = 312032486;
        
        double secondsInAYear = 31536000;
        
        double birthsInAYear = secondsInAYear / 7;
        
        double deathsInAYear = secondsInAYear / 13;
        
        double immigrationsInAYear = secondsInAYear / 45;
        
        double changePerYear = birthsInAYear + immigrationsInAYear  - deathsInAYear;
        
        System.out.println("Population after one year: " + (inicialPopulation + (1* changePerYear)));
        System.out.println("Population after one year: " + (inicialPopulation + (2* changePerYear)));
        System.out.println("Population after one year: " + (inicialPopulation + (3* changePerYear)));
        System.out.println("Population after one year: " + (inicialPopulation + (4* changePerYear)));
        System.out.println("Population after one year: " + (inicialPopulation + (5* changePerYear)));
        
       
  String s = "Welcome to Java";
s.replaceAll("a", "BB");
System.out.println(s);
  }
        
  
      
    
    
}
