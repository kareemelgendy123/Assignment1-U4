/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava.review;

/**
 *
 * @author Kareem
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assigning values to variables
        long population = 6000000000l;
        long maxPopulation = 10000000000l;
        int year = 1999;
        double increaseRate = 1.014;
        
        // For loop to calculate the population
        for (int i = 0; population <= maxPopulation; i++){
            // Increasing the population given the rate
            population = (long) (population * increaseRate);
            // Getting the year
            year += 1;
    }

        // Outputting the results
        System.out.println("The population in 1999 was 6 Billion.");
        System.out.println("If the population increases at a rate of 1.4% each year,");
        System.out.println("By the year, " + year + ", the population would have reached 10 billion.");
        
    }
    
}
