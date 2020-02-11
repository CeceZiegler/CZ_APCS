public class FavoriteMovies
{
    //I have created an array but haven't loaded in any values.
    String[] favMovies = new String[5];
   
    public static void main (String[] args)
    {
        //I created a favoirte movie object so I can acess the array in main.
        FavoriteMovies fm = new FavoriteMovies();
        //I am setting the value for each place in the array.
        fm.favMovies[0] = "Remember the Titans";
        fm.favMovies[1] = "The Hunger Games";
        fm.favMovies[2] = "Secratariat";
        fm.favMovies[3] = "Good Will Hunting";
        fm.favMovies[4] = "The Blind Side";

        System.out.println("My favorite movies are: ");
        
        //using a for loop to print out all of the values in the array.
        for(int i = 0; i < fm.favMovies.length; i++)
        {
             System.out.println(fm.favMovies[i]);
        }
    }
}