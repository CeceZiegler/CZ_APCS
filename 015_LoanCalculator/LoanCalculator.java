import java.util.Scanner;

public class LoanCalculator
{
    public static void main(String[] args)
    {
        /* This method usese the scanner class and scanner object to prompt users to enter the information
        regarding their loan on their car. The scanner allows the user to enter their information, and then
        calculates the interest rate and payment based on the numbers they enter in.*/
        
        int principalBalance;
        int annualIntRate;
        int remainingMonths;
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Principal Balance: ");
        principalBalance = scan.nextInt();
        System.out.println("Now enter your annual interest rate: ");
        annualIntRate = scan.nextInt();
        System.out.println("Finally enter the remaining months on your loan: ");
        remainingMonths = scan.nextInt();

        double monthlyInterest = principalBalance * (annualIntRate/remainingMonths);
        System.out.println("Your monthly interest rate is" + " " + monthlyInterest);

        double monthlyPayment = (principalBalance/remainingMonths) + monthlyInterest;
        System.out.println("Your monthy payments are:" + " " + monthlyPayment);


    }
}