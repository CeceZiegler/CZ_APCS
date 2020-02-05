public class GasPriceTracker
{
    //These are class variables which can be accessed throughout the class.
    private String gasType;
    private double gasPrice;

    //This is the constructor which will allow me to make objects in the GasSign class.
    public GasPriceTracker(String gasType, double gasPrice)
    {
    this.gasType = gasType;
    this.gasPrice = gasPrice;
    }

    //This is a getter method which will return the gas type entered when the object is created.
    public String getGasType()
    {
        return gasType;
    }

    //This is a getter method which will return the gas price.
    public double getGasPrice()
    {
        return gasPrice;
    }

    //This is a setter method that will allow us to change the value of the private variable gasPrice.
    public void setPrice(double newPrice)
    {
        gasPrice = newPrice;
    }

    public static void main(String[] args)
    {}
}

