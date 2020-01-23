import java.util.Scanner;

public class UsingThePhone
{
    public static void main(String[] args)
    {
        //I have declared these variables, but didn't give them an initial value, because the value of each will be entered by the user.
        String brandName;
        String modelName;
        int storageSpace;
        boolean lightningCharger;
        boolean facialRecognition;

        Scanner scan = new Scanner(System.in);

        //I have prompted the user to enter the information of the kind of phone they want, and the features the phone will have.
        System.out.println("Enter the brand of the phone you want: ");
        brandName = scan.nextLine();
        System.out.println("Now enter the model of the phone you want: ");
        modelName = scan.nextLine();
        System.out.println("Please enter the number of gigabytes you want on your phone: ");
        storageSpace = scan.nextInt();
        scan.nextLine();
        System.out.println("True or false: you want your phone to have lightning charging? ");
        lightningCharger = scan.nextBoolean();
        System.out.println("True or false: you want your phone to have facial recognition?");
        facialRecognition = scan.nextBoolean();

        //I created a phone object using the constructor that was created in the phone class. In the parameters, I set them to be the values entered by the user for each variable.
        Phone myPhone = new Phone(brandName, modelName, storageSpace, lightningCharger, facialRecognition);
        
        //I print out the phone the user wants by calling the get methods created in the phone class.
        System.out.println("The phone I want is " + myPhone.getBrandName() + " " + myPhone.getModelName() + " with " + myPhone.getStorageSpace() + " gigabytes. Does it have a lightning charger? " + myPhone.getLightningCharger() + " Does it have facial recognition? " + myPhone.getFacialRecognition());
    }
}