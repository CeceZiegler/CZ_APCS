import java.util.Scanner;

public class BasicNestedPractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String character;
        int collumn;
        int row;

        System.out.println("please enter a letter: ");
        character = scan.nextLine();
        System.out.println("please enter the number of collumns: ");
        collumn = scan.nextInt();
        System.out.println("please enter the number of rows: ");
        row = scan.nextInt();
        //In this program, I prompt the user to enter a letter, and how many rows and collumns they would like.

        if(collumn <= 20 && row <= 20)
        //I then use an if statement to check if the info they entered is valid. If the infor they entered is valid
        {
            for(int i = 1; i <= row; i++)
            //a for statement will run based on the values they entered for row and collumn
            {
                for(int j = 1; j <= collumn; j++)
                //I have a for statement nested inside of a for statement which allows the program to run and print in the sequence entered.
to print in both rows and collumns.
                {
                    System.out.print(character);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("The info you entered is not valid.");
        }
    }
}

