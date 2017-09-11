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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assigning values to the variables
        double amount = 0;
        double interest = 0;
        double doubleAmount = 0;
        int million = 1000000;
        int doubleYears = 0;
        int millionYears = 0;
        int years = 0;
        
        // Getting the amount from the user
        System.out.print("Enter the initial amount in the bank account: ");
        
        // Scanning for the expenses
        Scanner one = new Scanner(System.in);
        amount = one.nextDouble();
                
        // Getting the interest rate from the user
        System.out.print("Enter the interest rate: ");
        
        // Scanning for the expenses
        Scanner two = new Scanner(System.in);
        interest = two.nextDouble();
        
        // Calculating the interest and double amount of the bank account
        interest = (interest / 100) + 1;
        doubleAmount = amount *2;
        System.out.println("interest " + interest);
        System.out.println("double A " + doubleAmount);
                
        // For loop 
        for (int i = 0; amount <= million; i++){
            years ++;
            amount = amount * interest;
        
        // If statements to see if the amount reached the double and million dollar point    
        if (million >= amount){
            millionYears = years;    
        }else if (doubleAmount >= amount){
            doubleYears = years;
            }
        
        }
        
        // Outputting the results
        System.out.println("It will take " + doubleYears + " years for your savings to double.");
        System.out.println("It will take " + millionYears + " years for your savings to reach $1 million.");
        
    }
    
}
