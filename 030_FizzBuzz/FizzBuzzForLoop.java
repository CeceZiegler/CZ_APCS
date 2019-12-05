import java.util.Scanner;

public class FizzBuzzForLoop
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int userNum;
        
        // The user will be prompted to enter a number using the scanner method.

        System.out.println("Please enter a whole number: ");
        userNum = scan.nextInt();
        
        /* I used a for statement to initialize a variable, and set it to compare to the number the user entered. It
        will count up by one, and will continue to count up and run the for statement until the variable is equal
        to the number the user entered. As the number is counting up, I use if statements within the for statement to
        see if the number is divisible by 3 and 5. if it is, certain words will be printed.*/
        
        for(int num = 1; num <= userNum; num++)
        {
            if( num % 3 == 0 && num % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }

            else if(num % 3 == 0)
            {
                System.out.println("Fizz");
                
            }

            else if(num % 5 == 0)
            {
                System.out.println("Buzz");
                
            }

            else
            {
                System.out.println(num);
               
            }
        }
    }
}