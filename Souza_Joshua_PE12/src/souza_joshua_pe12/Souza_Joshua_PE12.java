
package souza_joshua_pe12;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Souza_Joshua_PE12 {


    public static void main(String[] args) throws FileNotFoundException {
        if(args.length < 1){
            System.out.println("Use: java exercise_12_13 Loan.java");
            System.exit(1);
        }
        
        File file = new File(args[0]);
        if(!file.exists()){
            System.out.println("Please include the source file");
            System.exit(2);
        }
        Scanner in = new Scanner(file);
        long charCount = 0L; 
        int lines = 0;
        int words = 0; 
        
        while(in.hasNext()){
            String line = in.nextLine();
            
            String[] wordArray = line.split(" ");
            
            charCount += line.length();
            lines += 1;
            words += wordArray.length; 
        }
        System.out.printf("File %s has%n" + "%d characters%n" + "%dwords%n" + "%d lines%n%n", args[0], charCount, words, lines);
    }
    
}
