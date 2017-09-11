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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Getting the user's name
        System.out.println("Enter your name: ");
        
        // Scanning for the user's name
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        
        // Outputting the user's name
        System.out.println("Hello " + userName + "!");
        
    }
    
}
