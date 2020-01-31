public class FoodItem
{
    //I have declared these variables in class as private, so they can be accessed and mutated in the program.
    private String typeOfFood;
    private int ammountofFood;

    //This is the constructor method that will all us to create food item objects.
    public FoodItem(String typeOfFood, int ammountofFood)
    {
        this.typeOfFood = typeOfFood;
        this.ammountofFood = ammountofFood;
    }

    //This is a getter method that allows us to get the name of the food item.
    public String getType()
    {
        return typeOfFood;
    }

    //This is a getter method that will allow us to get back how much of the food item is left.
    public int getAmmount()
    {
        return ammountofFood;
    }

    //This is a setter method that allows us to set the number of food remanining after the user eats their snack.
    public void setAmmount(int grabAmmount)
    {
        ammountofFood -= grabAmmount;
        
    }

    public static void main(String [] args)
    {}
} 