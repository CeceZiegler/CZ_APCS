public class PowerAttack
{
    public static void main(String[] args)
    {
        int strength = 3;
        int num = 0;
        int total = 0;
        
        /* I am using the whiile loop to compare the total strength of my character to the power of the monster.
        As long as the total strength is less than 11, the monster power, the while loop will continue to run.
        I have inserted an if statement within the while loop, so when the total is greater than or equal to 
        11, the while loop will end and the character will hit the monster.*/

        while(total < 11)
        {
            System.out.println(total);
            num = (int) (Math.random()* 10 + 1);
            total = (strength + num);
            
            if(total >= 11)
            {
                System.out.println(total + " You hit the monster!");
            }
        }
    }
}