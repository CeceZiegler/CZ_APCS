import java.util.Scanner;
public class Table
{
    //I created these variables in the class so they can be accessed throughout the whole program.
    CardDispenser dealer = new CardDispenser();
    int cardOne;
    int cardTwo;
    int total;
    Scanner scan = new Scanner(System.in);
    int dealerTotal;
    String decision; 
    

    public static void main(String[] args)
    {
        //I created a table object so I can access my class variables in main.
        Table t = new Table();

        //The game starts by calling the card dispenser class and getCard method. Two cards dealt to both the dealer and user.
        t.cardOne = t.dealer.getCard();
        t.cardTwo = t.dealer.getCard(); 
        t.total = t.cardOne + t.cardTwo;
       
        System.out.println("You were dealt a " + t.cardOne + " and a " + t.cardTwo + " Your starting total is: " + (t.total));

        t.dealerTotal = t.dealer.getCard();
        t.dealerTotal +=  t.dealer.getCard(); 

        System.out.println("The dealers starting total is: " + t.dealerTotal);
       
        //Based on the starting total of the user and the dealer, I use the scanner to promt the user if they want to hit or stay.
        System.out.println("Would you like to hit or stay? ");
        t.decision = t.scan.nextLine();

        //If the dealers total is less than 16, they will be dealt another card.
        t.hitDealer();

        //As long as the users total is less than 21, they will have the option to stay or continue to hit, and based on their decision, those methods will be called.
         while(t.total < 21)
        {
             if(t.decision.equals("hit"))
            {
                   t.hit();
           
            }
             if(t.decision.equals("stay"))
             {
                   t.stay();
                   break;
             }
        }
        
    }
    //This method deals the user another card, and then compares the users total to 21 to see if they have busted.
    public void hit()
    {
        //I am calling the getCard method from the card dispenser class to deal another card.
        total += dealer.getCard();
        System.out.println("your new total is " + total);
        if(total <= 21)
        {
            System.out.println("Would you like to hit or stay? ");
            decision = scan.nextLine();
        }
        else
        {
            System.out.println("Sorry, you busted, your total is over 21.");
        }

    }
    //If the user is happy with their total. they can call the stay method. This method will compare the users total to the dealers total to determine who won.
    public void stay()
    {
        if(total > dealerTotal)
                {
                    System.out.println("Congrats, you beat the dealer.");
                }
        if(total <= dealerTotal)
                {
                    System.out.println("Sorry, you lost. Your total is less than the dealer.");
                }
    }

    //This method will run as long as the dealers total is less than or equal to 16. It will call the getCard method in the card dispenser class to deal the dealer another card.
    public void hitDealer()
    {
        while(dealerTotal <= 16)
        {
            dealerTotal += dealer.getCard();
            if(dealerTotal > 21)
            {
                System.out.println("The dealer busted");
            }
        }
        System.out.println("The dealers new total is: " + dealerTotal);
    }
}