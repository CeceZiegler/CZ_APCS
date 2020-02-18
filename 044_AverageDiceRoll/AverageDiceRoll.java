public class AverageDiceRoll
{
    //This method will get the average of all the dice rolls.
    public void getAverage()
    {
        OneThousandDiceRolls dr = new OneThousandDiceRolls();
        //creating an array x from the OneThousandDiceRolls class.
        int[] x = dr.getDiceRolls();
        int total = 0;
        //Using a for loop to get the total of all the dice rolls.
        for(int i = 0; i < x.length; i++)
        {
            total += x[i];
        }
        int avg = total/1000;
        System.out.println(avg);
    }

    public static void main(String[] args)
    {
        AverageDiceRoll ar = new AverageDiceRoll();
        //Calling the get average method to print out the average dice rolls.
        ar.getAverage();
    }
}