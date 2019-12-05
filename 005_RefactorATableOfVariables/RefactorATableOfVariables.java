public class RefactorATableOfVariables 
{

public static void main(String [] args)
    {   /* This method uses variables multiplied together to create different numbers. This method then uses println and 
        concatenation to create the table of values.*/
        
    int rowTwoColOne = 1;
    int rowThreeColOne = 2;
    int rowFourColOne = 3;
    int rowFiveColOne = 4;
    int rowTwoColTwo = rowTwoColOne * rowTwoColOne;
    int rowTwoColThree = rowTwoColOne * rowTwoColOne * rowTwoColOne;
    int rowThreeColTwo = rowThreeColOne * rowThreeColOne;
    int rowThreeColThree = rowThreeColOne * rowThreeColOne * rowThreeColOne;
    int rowFourColTwo = rowFourColOne * rowFourColOne;
    int rowFourColThree = rowFourColOne * rowFourColOne * rowFourColOne;
    int rowFiveColTwo = rowFiveColOne * rowFiveColOne;
    int rowFiveColThree = rowFiveColOne * rowFiveColOne * rowFiveColOne;

    System.out.println("a" + " " + "a^2" + " " + "a^3");
    System.out.println(rowTwoColOne + " " + rowTwoColTwo + " " + rowTwoColThree);
    System.out.println(rowThreeColOne + " " + rowThreeColTwo + " " +  rowThreeColThree);
    System.out.println(rowFourColOne +" " + rowFourColTwo + " " + rowFourColThree);
    System.out.println(rowFiveColOne + " " + rowFiveColTwo +  " " +  rowFiveColThree);
    }
}