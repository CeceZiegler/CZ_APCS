import java.util.Scanner;

public class RPSOne
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String userChoice;
        double num = Math.random(); 
        String computerChoice = "";
       
        /* I am using the if statements below to set the computers choice to either rock, paper, or scissors based on the
        random number generated, however I am not yet printing anything out.*/

        System.out.println(num);

        if(num <= .3333)
        {
            computerChoice = "rock";
        }

        if(num > .333 && num <= .666)
        {
            computerChoice = "paper";
        }

        if(num > .666 && num <= 1)
        {
            computerChoice = "scissors";
        }
        
        /* I am prompting the user below to enter either rock, paper, or scissors.*/

        System.out.println("Pick rock, paper, or scissors: ");
        userChoice = scan.nextLine();
        
        /* I am using a series of if and else if statements to compare the users choice and the computers choice
        and based on the results of the comparison, the program will print out who won the game.*/

        if(userChoice.equals("rock") && computerChoice.equals("scissors"))
        {
            System.out.println("User: rock  Computer: scissors");
            System.out.println("Congrats, you won!");
        }

        else if(userChoice.equals("rock") && computerChoice.equals("paper"))
        {
            System.out.println("User: rock  Computer: paper");
            System.out.println("Sorry, you lost to the computer.");
        }

        else if(userChoice.equals("rock") && computerChoice.equals("rock"))
        {
            System.out.println("User: rock  Computer: rock");
            System.out.println("It's a tie!");
        }

        else if(userChoice.equals("paper") && computerChoice.equals("scissors"))
        {
            System.out.println("User: paper  Computer: scissors");
            System.out.println("Sorry, you lost to the computer");
        }

        else if(userChoice.equals("paper") && computerChoice.equals("paper"))
        {
            System.out.println("User: paper  Computer: paper");
            System.out.println("It's a tie!");
        }

        else if(userChoice.equals("paper") && computerChoice.equals("rock"))
        {
            System.out.println("User: paper  Computer: rock");
            System.out.println("Congrats, you won!");
        }

        else if(userChoice.equals("scissors") && computerChoice.equals("scissors"))
        {
            System.out.println("User: scissors  Computer: scissors");
            System.out.println("Congrats, you won!");
        }

        else if(userChoice.equals("scissors") && computerChoice.equals("paper"))
        {
            System.out.println("User: scissors  Computer: paper");
            System.out.println("Congrats, you won!");
        }

        else if(userChoice.equals("scissors") && computerChoice.equals("rock"))
        {
            System.out.println("User: scissors  Computer: rock");
            System.out.println("Sorry, you lost to the computer.");
        }
        else
        {
            System.out.println("Invalid input, you have exited the program.");
        }
    }
}