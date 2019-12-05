public class SweetGarage
{
    public static void main(String[] args)
    {

    Car carOne = new Car();
    Car carTwo = new Car(2010, 126000, "Dodge", "Caravan");
    Car carThree = new Car(2014, 87598, "Ford", "Escape", true);
    Car carFour = new Car(2019, 800, "Tesla", "Model X", true);
    Car carFive = new Car(2018, 2000, "Jeep", "Wrangler", false);

    /* carOne is a default car that is a 2015 Honda CRV that has 132_000 miles on it,
    and it does not have turbo*/

    System.out.println("I have a" + " " + carOne.year + " " + carOne.manufacturerName);
    System.out.println(carOne.modelName);
    System.out.println("It has" + " " + carOne.milesDriven + " " + "miles.");
    System.out.println("Turbo engine?" + " " + carOne.hasTurbo);
   
    /* carTwo is a car I built using parameters. carTwo uses one line of println to 
    display the year, model, and millage of the car, and also staes if the car has a turbo engine.*/

    System.out.println("I have a" + " " + carTwo.year + " " + carTwo.manufacturerName + " " + carTwo.modelName + " " + "it has" + " " + carTwo.milesDriven + " " + "miles." + " "+ "Turbo Engine?"+ " " + carTwo.hasTurbo);
   
    /* carThree is a car I built using parameters. carThree uses one line of println to 
    display the year, model, and millage of the car, and also staes if the car has a turbo engine.*/

    System.out.println("I have a" + " " + carThree.year + " " + carThree.manufacturerName + " " + carThree.modelName + " " + "it has" + " " + carThree.milesDriven + " " + "miles" + " " + "Turbo engine?" + " " + carThree.hasTurbo);
    
    /* carFour is a car a built using parameters. carFour using one line of println to 
    display the year, model, and millage of the car, and also staes if the car has a turbo engine.
    carFour is going out for a drive today, and it revs its engine and uses the turbo engine while driving*/

    System.out.println("I have a" + " " + carFour.year + " " + carFour.manufacturerName + " " + carFour.modelName + " " + "it has" + " " + carFour.milesDriven + " " + "miles" + " " + "Turbo engine?" + " " + carFour.hasTurbo);
    carFour.revEngine();
    carFour.engageTurbo();
    
    /* carFive is a car a built using parameters. carFive using one line of println to 
    display the year, model, and millage of the car, and also staes if the car has a turbo engine.
    carFive is going out for a drive today, and it revs its engine.*/
    
    System.out.println("I have a" + " " + carFive.year + " " + carFive.manufacturerName + " " + carFive.modelName + " " + "it has" + " " + carFive.milesDriven + " " + "miles" + " " + "Turbo engine?" + " " + carFive.hasTurbo);
    carFive.revEngine();
    
    }

}