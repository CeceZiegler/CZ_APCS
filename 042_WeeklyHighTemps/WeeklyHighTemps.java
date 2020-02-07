public class WeeklyHighTemps
{
    //Creating an array of integers so they can be accessed throughout the program.
    int[] temp = {29, 19, 24, 28, 26};

    public static void main(String [] args)
    {
        //Creating a WeeklyHighTemps object so I can acess the temps in main.
        WeeklyHighTemps wt = new WeeklyHighTemps();

        //Printing out the temperature for each day by calling the array.
        System.out.println(wt.temp[0]);
        System.out.println(wt.temp[1]);
        System.out.println(wt.temp[2]);
        System.out.println(wt.temp[3]);
        System.out.println(wt.temp[4]);

    }
}