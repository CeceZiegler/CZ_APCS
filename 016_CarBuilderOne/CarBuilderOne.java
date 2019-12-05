import java.util.Scanner;

public class CarBuilderOne
{
    public static void main(String[] args)
    {
        /* This program uses the scanner method to prompt users to enter the information of the type
        of car they are looking for. After they enter the information of what they are looking for, 
        the program will print out a line that states that I found the car they want and the 
        features it has.*/

        String carMake;
        String carModel;
        int carYear;
        int carMileage;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the make of the car you want: ");
        carMake = scan.nextLine();
        System.out.println("Now enter the model of the car you want: ");
        carModel = scan.nextLine();
        System.out.println("Please enter the year of the car you are looking for: ");
        carYear = scan.nextInt();
        System.out.println("Enter how many miles you want on your car: ");
        carMileage = scan.nextInt();

        Car myCar = new Car(carYear, carMileage, carMake, carModel);

        System.out.println("I found the car:" + " " + myCar.manufacturerName + " " + myCar.modelName + " " + myCar.year + " " + "with"+ " " +  myCar.milesDriven+ " miles driven, that you were looking for.");
    }
}