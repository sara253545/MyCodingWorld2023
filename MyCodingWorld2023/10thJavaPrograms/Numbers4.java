
/**
4. Program to prompt and accept two integers from user and
find sum, difference, product, questiont and remainder
 */
import java.util.Scanner;
public class Numbers4
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner sc = new Scanner(System.in);
        int a, b, sum, difference, product, quotient, remainder;
        
        //Input from the user
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();
        
        //Computation
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;
        remainder = a % b;
        
        //Output
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
        System.out.println(a + " % " + b + " = " + remainder);
    }
}
