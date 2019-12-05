public class BearCounter
{
    public static void main(String [] args)
    { /* This method uses one variable to count the number of bears entering and leaving the forest. I use the icrement 
        and decrement operator to add and subrtact the number of bears entering and leaving. */
        
        int bears = 0;

        System.out.println("There are" + " " + bears + " " + "bears in the forest.");
        bears++;
        System.out.println("There is" + " " + bears + " " + "bear in the forest.");
        bears++;
        System.out.println("There are" + " " + bears + " " + "bears in the forest.");
        bears++;
        System.out.println("There are" + " " + bears + " " + "bears in the forset.");
        bears--;
        System.out.println("There are" + " " + bears + " " + "bears in the forest.");
        bears--;
        System.out.println("There is" + " " + bears + " " + "bear in the forest.");
        bears--;
        System.out.println("There are" + " " + bears + " " + "bears in the forest.");
    }
}