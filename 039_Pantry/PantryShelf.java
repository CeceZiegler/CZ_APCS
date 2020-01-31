import java.util.Scanner;

public class PantryShelf
{
    //I have declared these objects and variables in the class so they can be accessed throughout the program.
    FoodItem loafOfBread = new FoodItem("loaf of bread",  8);
    FoodItem cookies = new FoodItem("cookies", 15);
    FoodItem soup = new FoodItem("soup", 4);
    FoodItem gronolaBars = new FoodItem("gronola bars", 10);
    int total;
    String snack;

    public static void main(String[] args)
    {
        //I have created a pantry shelf object so I can use the class variables in main.
        PantryShelf p = new PantryShelf();
        Scanner scan = new Scanner(System.in);
        
        //I am prompting the user to enter what type of snack they want to eat.
        System.out.println("What do you want for a snack? ");
        p.snack = scan.nextLine();

        //I am calling the grabItem method to run in main.
        p.grabItem();
    
        
    }

    //This method will tell the user how much of the snack they choose to eat is left, and then will tell them how much is remaining after they eat it.
    public void grabItem()
    {
        Scanner scan = new Scanner(System.in);

        //I use if statements to compare the snack the user entered to the items in the pantry.
        //This if statement is for if the user chooses bread as their snack.
        if(snack.equals(loafOfBread.getType()))
        {
            System.out.println("There are " + loafOfBread.getAmmount() + " slices of bread left. How many would you like to eat? ");
            total = scan.nextInt();
            loafOfBread.setAmmount(total);
            System.out.println("You ate " + total + " slices of bread. There are " + loafOfBread.getAmmount() + " slices of bread left.");
        }

        //This if statement is for if they choose cookies as their snack.
        if(snack.equals(cookies.getType()))
        {
            System.out.println("There are " + cookies.getAmmount() + " cookies left. How many would you like to eat? ");
            total = scan.nextInt();
            cookies.setAmmount(total);
            System.out.println("You ate " + total + " cookies. There are " + cookies.getAmmount() + " cookies left.");
        }

        //This if statement is for if the user chooses to eat soup.
        if(snack.equals(soup.getType()))
        {
            System.out.println("There are " + soup.getAmmount() + " cans of soup left. How many would you like to eat? ");
            total = scan.nextInt();
            soup.setAmmount(total);
            System.out.println("You ate " + total + " cans of soup. There are " + soup.getAmmount() + " cans of soup left.");
        }
        
        //This if statement is for if the user wants to eat gronola bars.
        if(snack.equals(gronolaBars.getType()))
        {
            System.out.println("There are " + gronolaBars.getAmmount() + " gronola bars left. How many would you like to eat? ");
            total = scan.nextInt();
            gronolaBars.setAmmount(total);
            System.out.println("You ate " + total + " gronola bars. There are " + gronolaBars.getAmmount() + " gronola bars left.");
        }
    }
}