
/**
1. Program to prompt and accept two numbers from user and find its sum
 */

import java.util.Scanner;

public class Numbers1
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner hero = new Scanner(System.in);
        int a, b, sum;
        
        //Input from the user
        System.out.println("Enter the first number : ");
        a = hero.nextInt();
        
        System.out.println("Enter the second number : ");
        b = hero.nextInt();
        
        //Compute
        sum = a + b;
        
        //Output
        System.out.println("The sum of " + a + " and " + b + 
            " is = " + sum);
    } 
}
