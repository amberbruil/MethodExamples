/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodexamples;

/**
 *
 * @author Amber Bruil ST10114407
 */
public class MethodExamples 
{
    /**
     * @param args the command line arguments
     */
    // -------------------------- Main Method ------------------------------- //
    public static void main(String[] args) 
    {
        greetUser("Alice"); // Calls greetUser method
        // added comment
        System.out.println("hello world");
    }
    // ---------------------------------------------------------------------- //
    
    // ---------------------------------------------------------------------- //
    // Passing parameters with void return type
    public static void greetUser(String name) 
    {
        System.out.println("Hello, " + name + "! Welcome to Java.");
        
        // Call the addNumbers method
        int sum = addNumbers(5, 10);
        System.out.println("Sum of numbers: " + sum);
        
        // Call the getPiValue method
        double pi = getPiValue();
        System.out.println("The value of Pi is: " + pi);

        // Call the calculateArea method
        double area = calculateArea(4.5, 2.0);
        System.out.println("Rectangle area: " + area);

        // Call the displayFullName method
        displayFullName("Alice", "Johnson");
    }
    // ---------------------------------------------------------------------- //
    
    // ---------------------------------------------------------------------- //
    // Passing parameters with integer return type
    public static int addNumbers(int num1, int num2) 
    {
        int result = num1 + num2;
        
        return result;
    }
    // ---------------------------------------------------------------------- //

    // ---------------------------------------------------------------------- //
    // No parameters with double return type
    public static double getPiValue() 
    {
        // double num = 3.14;       
        // return num;
        
        return 3.14;
    }
    // ---------------------------------------------------------------------- //

    // ---------------------------------------------------------------------- //
    // Passing parameters with double return type
    public static double calculateArea(double length, double width) 
    {
        return length * width;
    }
    // ---------------------------------------------------------------------- //

    // ---------------------------------------------------------------------- //
    // Passing parameters with void return type
    public static void displayFullName(String firstName, String lastName) 
    {
        System.out.println("Full Name: " + firstName + " " + lastName);     
    }
    // ---------------------------------------------------------------------- //
    
// ------------------------ 00ooo0oo End of File oo0ooo00-------------------- //
}
