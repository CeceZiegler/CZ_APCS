public class ComputeAnExpression
{
    public static void main(String [] args)
    { /* This method uses variables to establish numbers, and uses mathematical equations to compute a final number. I used the 
        double variable because the numbers I am working with are decimals, not integers.*/
        
        double numOne = 9.5 * 4.5;
        double numTwo = 2.5 * 3.0;
        double numThree = numOne - numTwo;
        double numFour = 45.5 - 3.5;
        double finalNum = numThree / numFour;
        
        System.out.println(finalNum);

    }
}