

//3. Program to prompt and accept numbers from user and 
//find their product.

import java.util.Scanner;
public class Numbers3
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner sc = new Scanner(System.in);
        int a, b, c, product;
        
        //Input from the user
        System.out.println("Enter 3 numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        //Computation
        product = a * b * c;
        
        //Output
        System.out.println("The product of " + a + ", " + b + 
            " and " + c + " is = " + product);
    }
}
