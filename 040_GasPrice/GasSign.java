public class GasSign
{
    //I have created three gasPriceTracker objects of the three different types of gas that are available. They are class variables so they can be accessed throughout.
    GasPriceTracker unleaded = new GasPriceTracker("unleaded", 2.49);
    GasPriceTracker plus = new GasPriceTracker("plus", 2.79);
    GasPriceTracker premium = new GasPriceTracker("premium", 2.99);

    public static void main(String [] args)
    {
        //This object is created so I can access the class level variables and methods in main.
        GasSign gs = new GasSign();
        
        //Calling the makeSign method in main.
        gs.makeSign();
        
    }

    //This method will print out the type of gas and the price of gas when it is called in  main.
    public void makeSign()
    {
        System.out.println(unleaded.getGasType() + " " + unleaded.getGasPrice());
        System.out.println(plus.getGasType() + " " + plus.getGasPrice());
        System.out.println(premium.getGasType() + " " + premium.getGasPrice());
    }
}