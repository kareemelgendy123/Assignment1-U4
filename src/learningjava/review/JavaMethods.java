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
public class JavaMethods {
    
    // Creating methods
    // public is how you declare one 
    // void is the value we would like to return
    // cannot be named main, numbers or expressions
    // parameters are added inside the round brackets
    
    // Method that prints Hello World
    public void helloWorld(){
        System.out.println("Hello World");
    } 
    
    // Method that prints Hello + name
    public void helloWorld(String name){
        System.out.println("Hello " + name);
    }

    // Method that adds up numbers in a sequence
    public int sumRange(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++){
            sum += i;
    }
        return sum;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating an object to run methods
        JavaMethods test = new JavaMethods();
        
        // Running the method
        test.helloWorld();
        test.helloWorld("Steve");
        
        int total = test.sumRange(5, 10);
        System.out.println(total);
        
    
    }
    
}
