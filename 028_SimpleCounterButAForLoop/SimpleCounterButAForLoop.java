public class SimpleCounterButAForLoop
{
    public static void main(String[] args)
    {
        /*This method uses for statements to set specific parameters for counting up and counting down,
        so I don't have to worry about an infinite loop. I initialized, set the parameters, and how much 
        it counts up and down by within the for loop.*/
         
        for(int i = 0; i <= 300; i++)
        {
            System.out.println(i);
        }

        for(int j = 300; j >= 0; j--)
        {
            System.out.println(j);
        }

        for(int c = 4798; c <= 5324; c++)
        {
            System.out.println(c);
        }

        for(int z = 5324; z >= 4798; z--)
        {
            System.out.println(z);
        }
    }
}