public class CustomCalculatorRun
{
    public static void main (String[] args)
    {
        //I am creating an object cc from the custom calculator class so i can call the methods from the customCalculator class.
        CustomCalculator cc = new CustomCalculator();

        //I am calling each method from the CustomCalculator class, and I picked random numbers to enter into each mehtod.
        cc.add(2,3);
        cc.subtract(500,65);
        cc.divide(36, 6);
        cc.multiply(74, 26);
        cc.areaOfCircle(9);
        cc.perimeterOfSquare(5);
        cc.square(10);
        cc.volumeOfACube(7);
    }
}