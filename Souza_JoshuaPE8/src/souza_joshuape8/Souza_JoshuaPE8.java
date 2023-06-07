// Joshua Teles de Souza
// Science Compute II
// 08/02/2022
// program that randomly fills in 0s and 1s into
// a 5-by-5 matrix, prints the matrix, and finds the first row and column with the
// most 1s. Here is a sample run of the program:
package souza_joshuape8;


public class Souza_JoshuaPE8 {

    
    public static void main(String[] args) {
        //Create a 5 by 5 matrix
        int[][] matrix = new int[5][5];
        
        //Fills the matrix 0s and 1s
        for (int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = (int)(Math.random()*2);
            }
        }
               //Display matrix 
               for (int x = 0; x < matrix.length; x++){
                   for(int y = 0; y < matrix[x].length; y++){
                      System.out.print(matrix[x][y]);
            }
                   System.out.println();
        }
                   System.out.println("The largest row index: " + mostOnesRow(matrix));
                   System.out.println("The largestr column index: " + mostOnesColumn(matrix));
    } 
    
    public static int mostOnesRow(int[][] m){
        int mostOnesRow = 0; 
        int max = 0; 
        for (int x = 0; x < m.length; x++){
            int count = 0; 
            for (int y = 0; y < m[x].length; y++){
                if (m[x][y] == 1)
                    count++;
            }
            if (count > max){
                max = count; 
                mostOnesRow = x;
            }
        }
        return mostOnesRow;
    }
    public static int mostOnesColumn(int[][] m){
        int mostOnesColumn = 0;
        int max = 0;
        for (int a = 0; a < m[0].length; a++){
            int count = 0;
            for (int b = 0; b < m.length; b++){
                if (m[b][a] == 1)
                    count++;
            }
            if (count > max){
                max = count; 
                mostOnesColumn = a;
            }
        }  
        return mostOnesColumn;
    } 
}
