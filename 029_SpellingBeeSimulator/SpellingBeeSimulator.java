import java.util.Scanner;

public class SpellingBeeSimulator
{
    public static void main(String[] args)
    {
        String word;
        Scanner scan = new Scanner(System.in);
        // I have imported the scanner to prompt the user to enter a word.
       System.out.println("Please enter a word: ");
        word = scan.nextLine();
        System.out.println(word);
       
        /* I am using a for statement to set the paramenters of how many times the method should repeat, based 
        on how long the word is that the user entered. The for statement will end when the integer variable in the for
        statement is bigger than the length of the word. I put an if statement inside the for statement to run until
        the last letter in of the word entered, inserting dashes after each letter. I then used an else statement to 
        print out the last letter of the word to make sure it doesn't have a dash after it.*/

        for(int i = 0; i < word.length(); i++)
        {
            if(i < word.length()-1)
            {
                System.out.print(word.substring(i, i+1) + " - ");
            }
            
            else
            {
                System.out.println(word.substring(word.length() - 1));
            }
        }
    }
}