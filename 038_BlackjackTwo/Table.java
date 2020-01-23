import java.util.Scanner;
public class Table
{
    
    CardDispenser dealer = new CardDispenser();
    int cardOne;
    int cardTwo;
    int total;
    Scanner scan = new Scanner(System.in);
    int dealerTotal;
    String decision; 
    

    public static void main(String[] args)
    {
        Table t = new Table();

        t.cardOne = t.dealer.getCard();
        t.cardTwo = t.dealer.getCard(); 
        t.total = t.cardOne + t.cardTwo;
       
        System.out.println("You were dealt a " + t.cardOne + " and a " + t.cardTwo + " Your starting total is: " + (t.total));

        t.dealerTotal = t.dealer.getCard();
        t.dealerTotal +=  t.dealer.getCard(); 

        System.out.println("The dealers starting total is: " + t.dealerTotal);
       
        System.out.println("Would you like to hit or stay? ");
        t.decision = t.scan.nextLine();

        t.hitDealer();
       
        if(t.decision.equals("hit"))
        {
            t.hit();
           
        }
        
        if(t.decision.equals("stay"))
        {
            t.stay();
        }
    }
    public void hit()
    {
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
    public void hitDealer()
    {
        while(dealerTotal <= 16)
        {
            dealerTotal += dealer.getCard();
        }
        System.out.println("The dealers total is: " + dealerTotal);
    }
}