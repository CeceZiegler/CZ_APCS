import java.util.Scanner;

public class FizzBuzzWhileLoop
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int userNum;
        int num = 1;
        
        // The user will be prompted to enter a number using the scanner method.

        System.out.println("Please enter a whole number: ");
        userNum = scan.nextInt();
        
        /* I am using a while loop to count up by one while comparing the number to the user entered number.
        Inside the while statement is a series of if and else if statements which determine if certain numbers
        are divisible by 3 and 5. If so, the designated word will be printed out, if not, just the number
        will be printed. The program will end when the number equals the number the user entered.*/

        while(num <= userNum)
        {
            if(num % 3 == 0 && num % 5 == 0)
            {
                System.out.println("FizzBuzz");
                num++;
            }

            else if(num % 3 == 0)
            {
                System.out.println("Fizz");
                num++;
            }

            else if(num % 5 == 0)
            {
                System.out.println("Buzz");
                num++;
            }

            else
            {
                System.out.println(num);
                num++;
            }
        }
    }
}