import java.util.Scanner;

public class DateTranslator
{
    //I am creating these variables in the class so that they can be used in the main, and used without changing the method variables
    String month;
    int day;
    int year;
    String format;
   

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        DateTranslator dt = new DateTranslator();
        //the dt object is created so I can access and use things that aren't created as static inside of main.
        
        System.out.println("Please enter a month: ");
        dt.month = scan.nextLine();
        System.out.println("Now enter the day: ");
        dt.day = scan.nextInt();
        System.out.println("Finally, enter the year: ");
        dt.year = scan.nextInt();
        scan.nextLine();
        System.out.println("Would you like to use the American or European format?: ");
        dt.format = scan.nextLine();
        //I prompted the user to enter a month, day, and year and then choose whether they watned their info presented to them in American or European style.

        if(dt.format.equalsIgnoreCase("american"))
        {
            dt.printAmerican(dt.month, dt.day, dt.year);
        }
        //This first if statement compares the format chosen to the word American. if the user entered american, it will run the printAmerican method,
        if(dt.format.equalsIgnoreCase("european"))
        {
            dt.printEuropean(dt.day, dt.month, dt.year);
        }
        //The second if statement compares the format to word European. if it is european, it will run the printEuropean method.
    }
    public void printAmerican(String w, int x, int y)
    {
        System.out.println(w+ "/" + x + "/" + y);
    }
    //printAmerican will print out the variables entered in the parameters when called in the American date format.
    public void printEuropean(int a, String b, int c)
    {
        System.out.println(a + "/" + b + "/" + c);
    }
    //Print European will print out the variables in the parameters in the european format when called.
}