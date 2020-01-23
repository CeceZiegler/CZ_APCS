public class Phone
{
    String brandName;
    String modelName;
    int storageSpace;
    boolean lightningCharger;
    boolean facialRecognition;
    
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

    public static void main(String[] args)
    {}

}