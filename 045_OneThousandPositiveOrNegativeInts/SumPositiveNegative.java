public class SumPositiveNegative
{
    //This method will get the sum of the positive and negative integers by using a for loop and if statements.
    public void getSum()
    {
        OneThousandPositiveOrNegativeInts ot = new OneThousandPositiveOrNegativeInts();
        //This is the array that holds the positive and negative integers from the OneThousandPositiveOrNegativeInts class.
        int[] x = ot.getOneThousandPositiveOrNegativeInts();
        int posTotal = 0;
        int negTotal = 0;

        //This for loop will run the length of the array
        for(int i = 0; i < x.length; i++)
        {
            //If the number in the array is greater than zero, it will add to the positive total.
            if(x[i] > 0)
            {
                posTotal += x[i];
            }
            
            //If the number in the array is less than zero, it will add to the negative total.
            if(x[i] < 0)
            {
                negTotal += x[i];
            }
        }

        System.out.println("The total of positve integers = " + posTotal);
        System.out.println("The total of the negative integers = " + negTotal);
    }

    public static void main(String[] args)
    {
        SumPositiveNegative pn = new SumPositiveNegative();
        // Calling the get sum method to print out the final sum of the positive and negative ints.
        pn.getSum();
    }
}