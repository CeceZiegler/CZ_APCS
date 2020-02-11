public class FavoriteTVShows
{
    //Creating an array using an initializer list.
    String[] favTVShows = {"Survivor", "This is us", "Americas Got Talent"};

    public static void main(String[] args)
    {
        //I made a favorite show object so I can acess the array list in main.
        FavoriteTVShows ft = new FavoriteTVShows();
        
        System.out.println("My favorite tv shows are: ");

        //I used a for loop to run through the whole array and print out each string.
        for(int i = 0; i < ft.favTVShows.length; i++)
        {
            System.out.println(ft.favTVShows[i]);
        }
    }
}