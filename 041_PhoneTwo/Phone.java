public class Phone
{
    // Class level variables so they can be accessed throughout.
    String brandName;
    String modelName;
    int storageSpace;
    boolean lightningCharger;
    boolean facialRecognition;
    String setColor;
    
    //Base constructor that will have set values.
    public Phone()
    {
        brandName = "Apple";
        modelName = "Iphone eight";
        storageSpace = 64;
        lightningCharger = true;
    }
    //This constructor uses the same info from the base constructor, but it also allows the user to set the color.
    public Phone(String setColor)
    {
        brandName = "Apple";
        modelName = "Iphone eight";
        storageSpace = 64;
        lightningCharger = true;
        this.setColor = setColor;
    }

    //This method is the constructor and sets the parameters to build a phone object whem running using the phone.
    public Phone(String brandName, String modelName, int storageSpace, boolean lightningCharger, boolean facialRecognition)
    {
        this.brandName = brandName;
        this.modelName = modelName;
        this.storageSpace = storageSpace;
        this.lightningCharger = lightningCharger;
        this.facialRecognition = facialRecognition;
    }

    //This method gets and returns the brand name entered by the user whenever the method is called.
    public String getBrandName()
    {
        return brandName;
    }

    //This method gets and returns the method name entered by the user when the method is called.
    public String getModelName()
    {
        
        return modelName;
    }

    //This method gets and returns the storage space the phone will have based on the number entered by the user when ran.
    public int getStorageSpace()
    {
        return storageSpace;
    }

    //This method returns the boolean of if the phone has a lightning charger when it is called in UsingThePhone.
    public boolean getLightningCharger()
    {
        return lightningCharger;
    }

    //This method returns the boolean of if the phone has facial recognition when it is called.
    public boolean getFacialRecognition()
    {
        return facialRecognition;
    }

    //This method returns the color of the phone.
    public String getColor()
    {
        return setColor;
    }

    public static void main(String[] args)
    {}

}