// Souza, Joshua
// Computer Science II
// 04/08/2022
// program that stores an array of the six
// int values 1, 2, 3, 4,5, and 6, a Date object for the current time, and the double
// value 10.5 into the file named Exercise17_05.dat.

package souza_joshuape17;
import java.io.*;
import java.util.Date;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class Souza_JoshuaPE17 {


    public static void main(String[] args) throws IOException {
        //Creates the array containing the required numbers
        int numbers[] = {1,2,3,4,5,6};
       
        //Create the output stream
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"));
                ){
            //Write the required information in the file
            output.writeObject(numbers); 
            output.writeDouble(10.5);
            output.writeObject(new Date());
        }
    }   
}
