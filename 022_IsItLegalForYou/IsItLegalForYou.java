import java.util.Scanner;

public class IsItLegalForYou
{
    public static void main(String[] args)
    {
        /* This method imports the scanner class, and uses it to prompt the user to enter their age. I created 
        four if statements of what the user could be elligable to do depending on their age. I also created an
        else statement in case the user is too young to be elligable.*/

        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        age = scan.nextInt();

        if(age >= 16)
        {
            System.out.println("You are old enough to get a drivers licence.");
            
        }
         if(age >= 18)
        {
            System.out.println("You are old enough to buy cigarettes and go to the casino.");
        }
         if(age >=21)
        {
            System.out.println("You are old enough to buy alcohol.");
        }
        if(age >= 25)
        {
            System.out.println("You are old enough to rent a car.");
        }
        else
        {
            System.out.println("Sorry you are not old enough.");
        }

    }
}