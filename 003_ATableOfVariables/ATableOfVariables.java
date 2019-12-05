public class ATableOfVariables
{
  
     public static void main(String [] args)
        {   /* This method uses eight variables to create a table of numbers. I used println and concatenations to combine text within one line.*/

            int rowTwoColTwo = 1;
            int rowTwoColThree = 1;
            int rowThreeColTwo = 4;
            int rowThreeColThree = 8;
            int rowFourColTwo = 9;
            int rowFourColThree = 27;
            int rowFiveColTwo = 16;
            int rowFiveColThree = 64;

            System.out.println("a" + " " + "a^2" + " " + "a^3");
            System.out.println("1" + " " + rowTwoColTwo + " " + rowTwoColThree);
            System.out.println("2" + " " + rowThreeColTwo + " " +  rowThreeColThree);
            System.out.println("3" +" " + rowFourColTwo + " " + rowFourColThree);
            System.out.println("4" + " " + rowFiveColTwo +  " " +  rowFiveColThree);
        }
}