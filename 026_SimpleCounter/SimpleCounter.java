import java.util.Scanner;

public class SimpleCounter
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int userNum;
        int num = 0;
       
        //The user will be prompted to enter an integer using the scanner class.
       
        System.out.println("Please enter a whole number: ");
        userNum = scan.nextInt();
       
        /* After the user enters a number, I will use a while loop to compare an integer to the user number, and
        I will use the ++ method to count up to the number the user entered. Once the number is equal to the number entered by the 
        user, the while loop will stop. */

        while(num <= userNum)
        {
            System.out.println(num);
            num++;
        }
    }
}