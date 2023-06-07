// Joshua Teles de Souza
// Science Compute II
// 08/02/2022
// program that randomly fills in 0s and 1s into
//a 5-by-5 matrix, prints the matrix, and finds the first row and column with the
//most 1s. Here is a sample run of the program:
package souza_joshua_pe7;


public class Souza_Joshua_PE7 {


    public static void main(String[] args) {
       double[] numbers = {12.3, 52.1, 63.0, 42.0, 95.1, 78.2, 12.4, 7.0, 12.5, 10.8}; 
       boolean movement;
       double temp;
       do{
           movement = false;
           for(int i = 0; i < numbers.length - 1; i++){
               if(numbers[i] > numbers[i+1]){
               temp = numbers[i];
               numbers[i] = numbers[i+1];
               numbers[i+1] = temp; 
               movement = true;
               }
           }
           
       }while(movement);
       
       for (double e: numbers){ 
                  System.out.print(e + " ");
       }
    
    }
    
}
