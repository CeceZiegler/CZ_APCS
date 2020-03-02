public class AHerdOfCats
{
    // I am creating an array of cats by creating a cat object from the cat class.
    Cat[] cats = {new Cat("Henry", 15), new Cat("Vivian", 25), new Cat("George", 30)};
    

    //This method will use a for loop to state information about each cat.
   public void feedCats()
   {
        //I used an enhanced for loop to run throught the array of cats.
        for(Cat x: cats)
        {
            System.out.println(x.getName()+ " is " + x.getWeight() + " pounds.");
            System.out.println("I am feeding " + x.getName() + " 1 pound of fish.");
            //I am calling the setter method from the cats class to set the new weight of each cat after eating a pound of fish.
            x.setWeight(1);
            System.out.println(x.getName() + " now weighs " + x.getWeight()  + " pounds.");
        }
   }

   public static void main(String[] args)
   {   
       //Creating a heard of cats object to be able to call the feedCats method.
       AHerdOfCats hc = new AHerdOfCats();
       //Calling the feedCats method.
       hc.feedCats();
   }
}
