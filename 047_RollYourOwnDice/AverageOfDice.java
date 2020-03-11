import java.util.*;

public class AverageOfDice
{
    // Creating an arraylist that can be accessed throughout the class
    ArrayList<Integer> diceRoll = new ArrayList<Integer>();
    int dice;

    //This method will roll a random number between 1 and 100
    public int Roll()
    {
        //dice variable generates a random number
        dice = (int) (Math.random()*100 +1);
        return dice;
    }

    //This method returns the most recent dice roll.
    public ArrayList latestDiceRoll(int dice)
    {
        this.dice = dice;
        //Adding each new dice roll to the array list
        diceRoll.add(dice); 
        return diceRoll;
    }

    //This method will print out the average of all of the dice rolls in the array list.
    public double averageDiceRoll(ArrayList<Integer> diceRoll)
    {
        this.diceRoll = diceRoll;
        int total = 0;
        //using a for loop to run through the whole array list to get the total of all the numbers that have been rolled
        for(Integer x : diceRoll)
        {
            total += x;
        }
        //Getting the average by dividing the total by the size of the array list.
        double avg = total/diceRoll.size();
        return (double) avg;

    }

    public static void main(String[] args)
    {
        //Creating an object so I can acess everything from the class in main.
        AverageOfDice ad = new AverageOfDice();
        Scanner scan = new Scanner(System.in);
        System.out.println(ad.averageDiceRoll(ad.latestDiceRoll(ad.Roll())));

        //Using this boolean to run a while loop
        boolean myRoll = true;

        //This while loop will run as long as the user continues to roll the die.
        while(myRoll == true)
        {
            System.out.println("Would you like to roll the dice again?");
            String choice = scan.nextLine();
                //Using an if statement to determine what to do if the user chooses to continue rolling or stop. if it is yes, it will print out a new average.
                if(choice.equals("yes"))
                {
                    System.out.println(ad.averageDiceRoll(ad.latestDiceRoll(ad.Roll())));
                    myRoll = true;
                }
                else
                {
                    myRoll = false;
                }
        }
        System.out.println(ad.averageDiceRoll(ad.latestDiceRoll(ad.Roll())));
    }
}