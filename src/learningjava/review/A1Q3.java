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
public class A1Q3 {

    /**s
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assigning values to the variables
        int ticketCost = 35;
        double totalExpenses = 0;
        double expenses = 0;
        int numTickets = 0;

        // For Loop
        for (int i = 0; i < 6; i++){
            
        // Getting the number from the user
        System.out.print("Enter the expenses: ");
        
        // Scanning for the expenses
        Scanner in = new Scanner(System.in);
        expenses = in.nextDouble();  
        
        // Calculating the results
        totalExpenses = totalExpenses + expenses;
        numTickets = (int) Math.ceil((totalExpenses / ticketCost));
        
        }
        
        // Outputting the results
        System.out.println("The total expenses were $" + totalExpenses + ".");   
        System.out.println(numTickets + " tickets need to be sold in order to break even.");   
        
    
            

    }
    
}
