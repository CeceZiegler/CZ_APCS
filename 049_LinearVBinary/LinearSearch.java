public class LinearSearch
{
    //Creating an object to be able to access the array in the OneThousandSortedRandomNumbers class.
    OneThousandSortedRandomNumbers ot = new OneThousandSortedRandomNumbers();
    //Entering the number values into array x by calling the getSortedArray method from the OneThousandSortedRandomNumbers class.
    int[] x = ot.getSortedArray();
    //declaring a variable that will be in the paramater of the method I create. It is the number to look for in the array.
    int find;
    //The counter variable will be used to count the number of iterations it takes to find each number in the array.
    int counter = 0;
    
    //Creating the method to find a number with paramaters to enter an array, and the number to look for.
    public int search(int[] x, int find)
    {
        //Using a for loop to search through the length of the array to look for the number.
        //It is a linear search, so it will one by one compare each number to the next one in order.
        for(int i = 0; i < x.length; i++)
        {
            //Using an if statement to compare the current number in the array to the target number that is being found. 
            //If they equal, the number, i, is the index location of the target number.
            if(x[i] == find)
            {
                //Printing out the location of the found number.
                System.out.println("The number " + find + " was found at index " + (i));
                //Printing out the number of iterations to find the target number.
                System.out.println("It took " + counter + " iterations to find the number " + find);
                break;
            }
            //The counter will add one each time the loop runs through.
           counter++; 
        }
        //If the number is not found in the array, -1 will be returned because that is not a possible index for the number.
        return -1;
        
    }

    public static void main(String[] args)
    {
        //Creating an object to be able to access the non-static methods and class level variables
        LinearSearch ln = new LinearSearch();
        //Calling the search method, and entering in the parameters of the array x, and each individual number to search for.
        ln.search(ln.x, 7250);
        ln.search(ln.x, 9463);
        ln.search(ln.x, 1137);
        ln.search(ln.x, 4837);

    }
}