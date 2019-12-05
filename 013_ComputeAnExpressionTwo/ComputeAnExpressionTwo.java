public class ComputeAnExpressionTwo
{
    public static void main(String [] args)
    { /* This method uses variables to establish numbers, and I created a calculator object to use the 
        ReturningCalculator class to compute a final number. I used the 
        double variable because the numbers I am working with are decimals, not integers.*/
        
        ReturningCalculator myCalc2 = new ReturningCalculator();

        double numOne = 9.5;
        double numTwo = 4.5;
        double numThree = 2.5;
        double numFour = 3.0;
        double numFive = myCalc2.doubleMultiplier(numOne, numTwo);
        double numSix = myCalc2.doubleMultiplier(numThree, numFour);
        double numSeven = myCalc2.doubleSubtractor(numFive, numSix);
        double numEight = 45.5;
        double numNine = 3.5;
        double numTen = myCalc2.doubleSubtractor(numEight, numNine);
        double finalNum = myCalc2.divider(numSeven, numTen);

        System.out.println(finalNum);

      

    }
}


