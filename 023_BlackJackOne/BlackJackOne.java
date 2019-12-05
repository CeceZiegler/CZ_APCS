import java.util.Scanner;

public class BlackJackOne
{
    public static void main(String[] args)
    {
        /* I have created variables that will print out random numbers as the card values for both the user and the dealer.
        I have also created a String variable that will allow the user to enter their decision of if they want to hit or stay,
        and they can do this by using the scan object I imported and created.*/
        
        int cardOne = (int) (Math.random()*10 +1); 
        int cardTwo = (int) (Math.random()*10 +1);
        int nextCard = (int) (Math.random()*10 + 1);
        int total = cardOne + cardTwo;
        int dealerCardOne = (int) (Math.random()*10 +1);
        int dealerCardTwo = (int) (Math.random()* 10 + 1);
        int dealerTotal = (dealerCardOne + dealerCardTwo);
        String decision; 
        int totalValueOne = (cardOne + cardTwo + nextCard);
        Scanner scan = new Scanner(System.in);

        System.out.println("You were dealt a " + cardOne + " and a " + cardTwo + " The value of your cards is " + total);
        System.out.println("Would you like to hit or stay? ");
        decision = scan.nextLine();
       
        /* I use a series of if statements to determine if the user is going to hit or stay, and based on their decision, and
        value of their cards compared to the dealer, I use if statements to determine if the user won, busted, or lost 
        to the dealer. */

        if(decision.equals("hit"))
        {
            System.out.println("Your next card is a " + nextCard );
            System.out.println("Your new total value is " + (totalValueOne));
            if(totalValueOne <= 21)
            {
                System.out.println("The dealer was dealt a " + dealerCardOne + " and a " + dealerCardTwo + " the value of the dealers cards is " + dealerTotal);
                if(totalValueOne > dealerTotal)
                {
                    System.out.println("Congrats, you beat the dealer.");
                }
                if(totalValueOne <= dealerTotal)
                {
                    System.out.println("Sorry, you lost. Your total is less than the dealer.");
                }
            }
            if(totalValueOne > 21)
            {
                System.out.println("Bust! Your total is greater than 21.");
            }
            

        }
        if(decision.equals("stay"))
        {
            System.out.println("The dealer was dealt a " + dealerCardOne + " and a " + dealerCardTwo + " the value of the dealers cards is " + dealerTotal);
                if(total > dealerTotal)
                {
                    System.out.println("Congrats, you beat the dealer.");
                }
                if(total <= dealerTotal)
                {
                    System.out.println("Sorry, you lost. Your total is less than the dealer.");
                }
        }

    }
}