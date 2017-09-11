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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assigning a value to the variables
        int number = 0;
        boolean status = true;
        
        // While loop
        while (status){
            
            // Getting the number from the user
            System.out.print("Enter a number between 1 and 10: ");
        
            // Scanning for the expenses
            Scanner in = new Scanner(System.in);
            number = in.nextInt();
            
            // If statement to see if the number meets the requirements
            if (number >= 1 && number <= 10){
                break;
            }
        }
        
        // For loop to print the line of asterix
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        
        }
            
                
        }
        
