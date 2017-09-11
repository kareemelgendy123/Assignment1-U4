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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assigning values to the variables
        boolean status = true;
        String words = "";
        int counter = -1;
        
        // While loop 
        while (status){
            // Getting the words
            System.out.print("Enter a word: ");
            Scanner in = new Scanner(System.in);
            
            // Scanning for the words
            words = in.nextLine();
                                    
            // If statement to see if the user enters 'exit'
            if (words.equals("exit")){
                status = false;
            }         
            
            // Counting how many words were entered
            counter ++;
            
            } 
        
        // Outputting the results
        System.out.print("You entered " + counter + " words.");
        }
        
        
    }
    

