public class FlipACoin
{
    public static void main(String[] args)
    {
        /*This method creates a variable, num that will generate a random integer between 1 and 2. It also creates
        a variable heads = to 1, and tails = to 2. The method then uses an if staement to check the number generated
        by Math.random, and if it is 1 it will print heads, and if it is 2 it will print tails.*/
        
        int num = (int) (Math.random()*2 +1);
        int heads = 1;
        int tails = 2;

        if(num == 1)
        {
            System.out.println("You flipped a heads");
        }
        if(num == 2)
        {
            System.out.println("You flipped a tails");
        }
    }
}