// Joshua Teles de Souza
// Compute Science II
// 22/02/2022
// removes the duplicate elements from an array list of integers
package souza_joshua_pe11;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;
public class Souza_Joshua_PE11 {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       ArrayList<Integer> list = new ArrayList<>();
       
       System.out.println("Enter 10 integers. ");
       for (int i = 0; i < 10; i++) {
           list.add(input.nextInt());
       }
       
       removeDuplicate(list);
       
       Collections.sort(list);
       
       System.out.println("The distinct integers are: ");
       for (int i = 0; i < list.size(); i++){
         System.out.print(list.get(i)+ " ");  
           
       }
       System.out.println();
    }
    
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if (Objects.equals(list.get(i), list.get(j))){
                    list.remove(j);
                }
            }
        }
    }
 }
