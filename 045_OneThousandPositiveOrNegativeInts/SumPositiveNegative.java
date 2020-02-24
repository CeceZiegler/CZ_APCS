public class SumPositiveNegative
{
    public void getSum()
    {
        OneThousandPositiveOrNegativeInts ot = new OneThousandPositiveOrNegativeInts();
        int[] x = ot.getOneThousandPositiveOrNegativeInts();
        int posTotal = 0;
        int negTotal = 0;

        for(int i = 0; i < x.length; i++)
        {
            if(x[i] > 0)
            {
                posTotal += x[i];
            }

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
        pn.getSum();
    }
}