/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava.review;

import java.util.Scanner;

/**
 *
 * @author Kareem
 */
public class JavaReview {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        // Initialize Variables
        // Type Name [ = value ];
        int age = 10;
        double length = 25.73;
        
        age = age + 10; // Adding 2 to the variable age
        length = length * 2; // 
        
        // Math Operators
        // + Addition
        // - Subtraction
        // * Multiplication
        // / Division
        // % Modulus (Remainder after Division)
        
        age ++; // Adding one to the varaiable using the ++ operator
        age --; // Subtracting one from the variable using the -- operator
        
        // Conditions
        if (length > 100){
            System.out.println("Length is greater than 100");
            
        }else if (length > 50){
            System.out.println("Length is between 50 and 100");
            
        }else{
            System.out.println("Length is less than 50");
        }
        
        // While Loops
        // && <- AND
        // || <- OR
 
        int count = 0;
        while (count < 10){
            // Increase count and print
            count ++;
            System.out.println(count);  
        }
        
        // For Loops
        for (int i = 0; i < 10; i++){
            System.out.println("i: " + i);
        }
        
        // Arrays
        String[] words = new String[5];
        words[0] = "Cat";

        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < words.length; i++){
            System.out.println("Enter a word:");
            words[i] = in.nextLine();
            
        }
        
    }
    
}
