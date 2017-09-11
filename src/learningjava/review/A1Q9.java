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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assigning a value to the variables
        int totalLetters = 0;
        
        // For loop that gets the 10 words from the user
        for (int i = 0; i < 10 ;i++){
        // Getting the words
        System.out.print("Enter your a word: ");
        
        // Scanning for the user's name
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        // Getting the length of the word
        int length = word.length();
        
        // Adding up the letters
        totalLetters += length;
        }
        
        // Calculating the average number of letters
        int average = (int) Math.ceil(totalLetters / 10);
        
        // Outputting the average
        System.out.println("The average number of letters was " + average + ".");
        
    }
    
}
