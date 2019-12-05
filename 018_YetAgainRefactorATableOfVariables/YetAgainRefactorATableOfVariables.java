import java.util.Scanner;

public class YetAgainRefactorATableOfVariables
{
    public static void main(String [] args)
    {   /* This method uses the Math.pow method from the math class to create different numbers. This method then uses println and 
        concatenation to create the table of values.*/
        
    int rowTwoColOne = 1;
    int rowThreeColOne = 2;
    int rowFourColOne = 3;
    int rowFiveColOne = 4;
    double rowTwoColTwo = Math.pow(1.0, 2.0);
    double rowTwoColThree = Math.pow(1.0, 3.0);
    double rowThreeColTwo = Math.pow(2, 2);
    double rowThreeColThree = Math.pow(2, 3);
    double rowFourColTwo = Math.pow(3, 2);
    double rowFourColThree = Math.pow(3, 3);
    double rowFiveColTwo = Math.pow(4, 2);
    double rowFiveColThree = Math.pow(4, 3);

    double rowNum;
    Scanner scan = new Scanner(System.in);

    System.out.println("a" + " " + "a^2" + " " + "a^3");
    System.out.println(rowTwoColOne + " " + rowTwoColTwo + " " + rowTwoColThree);
    System.out.println(rowThreeColOne + " " + rowThreeColTwo + " " +  rowThreeColThree);
    System.out.println(rowFourColOne +" " + rowFourColTwo + " " + rowFourColThree);
    System.out.println(rowFiveColOne + " " + rowFiveColTwo +  " " +  rowFiveColThree);
//I am now going to use the scanner method so the user can see the value of the number they want to see.
    System.out.println("Enter the row you would like to see: ");
    rowNum = scan.nextInt();
    double numSqrd = Math.pow(rowNum, 2);
    double numCube = Math.pow(rowNum, 3);
    System.out.println(numSqrd);
    System.out.println(numCube);

    }
}