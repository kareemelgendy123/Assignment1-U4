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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variables
        int product = 1;
        int squareRoot = 0;
        
        // Creating an array
        int[] numbers = new int[3];
        
        // Creating a for loop
        for(int i = 0; i < 3; i++){
            // Getting the number from the user
            System.out.print("Enter a number: ");
         
                    
            // Scanning for the numbers
            Scanner in = new Scanner(System.in);
            // Adding the numbers to an array
            numbers[i] = in.nextInt();
            
            // Calculating the product and square root
            product = product * numbers[i];
            squareRoot = (int) Math.sqrt(product);
             
        }
           
        // Printing the results
        System.out.println("The product of the 3 numbers is " + product + ".");  
        System.out.println("The square root of the product is " + squareRoot + ".");
        }
    }
    
