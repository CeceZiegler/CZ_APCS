import java.util.*;
public class CleanTempSensorData
{
    //Creating an integer arraylist that will be able to be acesse throughout the class.
    public ArrayList<Integer> temps = new ArrayList<Integer>();

    //This method will sensor/clean the data in the array list by only accepting numbers less than 20 
    //This method will get rid of any out of place numbers in the data set.
    public ArrayList sensor(int[] x)
    {
        //Using an enhanced for loop to run through the whole arraylist.
        for(int y: x)
        {
            //using an if statement to only add numbers less than 20 to the arraylist.
            if(y < 20)
            {
                temps.add(y);
            }
        }
        return temps;
    }

    public static void main(String args[])
    {
        //Creating a sensor data to be able to acess the numbers to put into the arraylist.
        SensorData sd = new SensorData();
        //Creating a class object to be able to acess non static variables and methods in main.
        CleanTempSensorData ct = new CleanTempSensorData();
        //Creating a new array list variable and adding the proper data into the list by calling the methods on the variables.
        ArrayList<Integer> data = ct.sensor(sd.getTempSensorData());
        System.out.println(data);
    }
}