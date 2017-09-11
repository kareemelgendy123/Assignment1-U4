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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assigning values to the variables
        int number = 0;
        int counter = 100;
        boolean status = true;
   
        // While loop to get the number
        while (status){
        // Getting the number from the user
        System.out.print("Enter a number between 100 and 50 to stop at: ");
        
        // Scanning for the expenses
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        
        // If statement to see if the number is between 50 and 100
        if (number >= 50 && number <= 100){
            break;
        }
        
        }
        
        // For loop to count down
        for (int i = 0; number <= counter; i++){
            System.out.println(counter);
            counter -= 5;
            
        }
        
    }
    
}
