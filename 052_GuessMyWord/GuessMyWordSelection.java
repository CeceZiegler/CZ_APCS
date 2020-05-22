import java.util.*;
public class GuessMyWordSelection
{
    ArrayList<String> start = new ArrayList<String>();
    ArrayList<String> after = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    String guess;

     //This method runs the whole game until the user has guessed the right word, and calls the other methods in the program.
    public void beginGame(String word)
    {
        //prompting the user to enter their guess of the target word.
        System.out.println("Enter your guess: ");
        //using a while loop to continue to run through until the user has guessed the correct word.
        while(guess != word)
        {
            guess = scan.nextLine();
            //This is compares the value of each word and it's place alphabetically
            //if guess is before the target word, it will be added to the top of the arraylist
            if(guess.compareTo(word) < 0)
            {
                start.add(guess);
            }
            //If guess is after the target word, it will be added to the end of arrayList
            else if(guess.compareTo(word) > 0)
            {
                after.add(guess);
            }
            else
            {
                System.out.println("Congrats, you guessed the word!");
                break;
            }


            //calling the selection method and inputing the start arrayList in the parameter
            selectionSort(start);
            //Calling the selectionsort method, but now entering the after arrayList as a parameter
            selectionSort(after);

            System.out.println();

            //Using an enhanced for loop to print out the users guess
            for(String y: start)
            {
                System.out.println(y + "");
            }
            
            //prompting user to enter another guess
            System.out.println(" guess: ");
            //for each loop to run through the whole after arrayList
            for(String y : after)
            {
                System.out.println(y + " ");
            }
        }
        //if the users guess equals the word, they win the game.
        if(guess == word)
        {
            System.out.print("Congrats, you guessed the word!");
        }
        scan.close();
    }

    //using the selection sorter method to properly sort the users guesses into alphabetic order
    public static void selectionSort(ArrayList<String> arr)
    {
        for(int i = 0; i < arr.size() - 1; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < arr.size(); j++)
            {
                String now = arr.get(j);
                if(now.compareTo(arr.get(minIndex)) < 0)
                {
                    minIndex = j;
                }
            }
            String temp = arr.get(minIndex); 
            arr.set(minIndex, arr.get(i)); 
            arr.set(i, temp); 
            
        }
    }

    public static void main(String args [])
    {
        GuessMyWordInsertion gw = new GuessMyWordInsertion();
        gw.beginGame("hockey");
    }
}