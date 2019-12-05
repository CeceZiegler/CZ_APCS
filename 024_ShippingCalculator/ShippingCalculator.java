import java.util.Scanner;
public class ShippingCalculator
{
    public static void main(String [] args)
    {
        double weight;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the weight of your package: ");
        weight = scan.nextDouble();

        /*This method imports the scanner class to allow the user to enter the weight of their package. I then used
        a series of if statements to determine the range that the weight of the package falls into, so I can determine
        the cost to ship the package. I use the if and else if methods.*/
        
        if(weight > 0 && weight <= 1)
        {
            System.out.println("your package costs $3.50.");
        }

        else if(weight > 1 && weight <= 3)
        {
            System.out.println("Your package costs $5.50.");    
        }

        else if(weight > 3 && weight <= 10)
        {
            System.out.println("Your package costs $8.50.");
        }

        else if(weight > 10 && weight <= 20)
        {
            System.out.println("Your package costs $10.50.");
        }

        else if(weight <= 0)
        {
            System.out.println("Invalid input.");
        }

        else if(weight > 20)
        {
            System.out.println("This package cannot be shipped.");
        }
    }
}