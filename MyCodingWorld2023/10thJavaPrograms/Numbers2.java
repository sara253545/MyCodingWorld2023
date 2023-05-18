
/**
2. Program to prompt and accept two numbers from user and
find its difference
 */
import java.util.Scanner;
public class Numbers2
{
    public static void main(String[] args)
    {
        //Declaration
        Scanner sc = new Scanner(System.in);
        int a, b, difference;
        
        //Input from the user
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        
        System.out.println("Enter the second number : ");
        b = sc.nextInt();
        
        //Computation
        difference = a - b;
        
        //Output
        System.out.println("The difference of " + a + " and " +
            b + " is = " + difference);
    }
}
