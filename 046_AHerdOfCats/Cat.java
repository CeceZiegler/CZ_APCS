public class Cat 
{
    // Creating class level variables so they can be accessed throughout.
    private String name;
    private int weight;

    //This is the constructor that will allow us to create cat objects.
    public Cat(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    
    //This method returns the name of each cat.
    public String getName()
    {
        return name;
    }
    
    //This method returns the weight of each cat.
    public int getWeight()
    {
        return weight;
    }

    //This method sets the weight of each cat.
    public void setWeight(int x)
    {
        weight = weight + x;
    }
    
    public static void main(String[] args)
    {}
}