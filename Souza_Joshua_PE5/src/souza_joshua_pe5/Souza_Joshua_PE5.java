
package souza_joshua_pe5;


public class Souza_Joshua_PE5 {

    
    public static void main(String[] args) {

        int line = 0;	// Count the number of characters

		// Print the ASCII characters from ! to ~
		for (int i = 33; i <= 126; i++) {
			line++;	// Increment count
			// Display 10 characters per line
			if (line % 10 == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");	
		}
		System.out.println();
	}
}