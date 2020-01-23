public class CardDispenser
{
    int card;

    public int getCard()
    {
        card = (int) (Math.random()*10 +1);
        return card;
    }

   
    
    public static void main(String[] args)
    {}
}