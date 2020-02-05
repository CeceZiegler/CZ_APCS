public class UsingThePhoneTwo
{
    // I created three phone objects based off of the three different constructors I created in phone.
    Phone pOne = new Phone();
    Phone pTwo = new Phone("rose gold");
    Phone pThree = new Phone("Apple", "Iphone eleven", 64, true, true);


    public static void main(String [] args)
    {
        // I created a using the phone object so I can access the class level variables and objects in main.
        UsingThePhoneTwo uP = new UsingThePhoneTwo();
        
        // Calling the printPhone method.
        uP.printPhone();
    }

    public void printPhone()
    {
        //This method calls the methods in the phone class to print out all of the brand names, models, ect entered in the constructor.
        System.out.println(pOne.getBrandName() + " " + pOne.getModelName() + " " + pOne.getStorageSpace() + " lightning charger? " + pOne.getLightningCharger());
        System.out.println(pTwo.getBrandName() + " " + pTwo.getModelName() + " " + pTwo.getStorageSpace() + " lightning charger? " + pTwo.getLightningCharger() + " " + pTwo.getColor());
        System.out.println(pThree.getBrandName() + " " + pThree.getModelName() + " " + pThree.getStorageSpace() + " lightning charger? " + pThree.getLightningCharger() + " facial recognition? " + pThree.getFacialRecognition());
    }
}