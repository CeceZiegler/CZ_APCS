public class CarAge
{
    public static void main(String[] args)
    {
    //These are the cars I created in my SweetGarage. I will be determining the age of each car.
    
    Car carOne = new Car();
    Car carTwo = new Car(2010, 126000, "Dodge", "Caravan");
    Car carThree = new Car(2014, 87598, "Ford", "Escape", true);
    Car carFour = new Car(2019, 800, "Tesla", "Model X", true);
    Car carFive = new Car(2018, 2000, "Jeep", "Wrangler", false);
    
    // I am using the Returning claculator class to create a new calculator object named myCalc.

    ReturningCalculator myCalc = new ReturningCalculator();
    int currentYear = 2019;
    /*I use the integerSubractor method from the ReturningCalculator class to determine the age of my cars
    by subtracting the current year from the year my cars were made.*/

    System.out.println("Car one is" + " " + myCalc.integerSubtractor(currentYear, carOne.year) + " " + "years old");
    System.out.println("Car two is" + " " + myCalc.integerSubtractor(currentYear, carTwo.year)+ " " + "years old.");
    System.out.println("Car three is" + " " + myCalc.integerSubtractor(currentYear,carThree.year)+ " " + "years old.");
    System.out.println("Car four is" + " " + myCalc.integerSubtractor(currentYear, carFour.year)+ " " + "years old.");
    System.out.println("Car five is" + " " + myCalc.integerSubtractor(currentYear,carFive.year)+ " " + "years old.");



  
    }

}