public class InsertionSorter
{
    //creating an object from the unsortedArrays class to be able to acess the array
    UnsortedArrays ua = new UnsortedArrays();
    //Creating an array variable by calling the method to get the numbers from the UnsortedArray class.
    int[] x = ua.getArrOne();

    //This method will using an insertion sort to porperly sort the array into numerical order.
    public void sorting(int arr[])
    {
        //using a for loop to run through the whole array to make sure it is sorted.
        for(int i = 1; i < arr.length; i++)
        {
            // spot is the value of the number we are comparing that is at location i in the array
            int spot = arr[i];
            //variable j is at an index value one less than the variable i.
            int j = i-1;
            //using a while loop to run the comparison in this sort.
            //two condition must be met for the while loop to run. The value of j has to be greater than -1 and the number value of the array at location j has to be greater than at locatiosn i.
            //as long as these two conditions are met, the while loop will run the comparison.
            while((j > -1) && (arr[j] > spot))
            {
                // the number at index j + 1 is now the number at index j.
                arr[j+1] = arr[j];
                //subtract one from the number j to have a new number to compare to.
                j--;
            }
            //The number at index j+ 1 is equal to spot, the new value to compare to to find the correct location for each number.
            arr[j+1]= spot;
        }

        
    }

    public static void main(String args[])
    {
        InsertionSorter is = new InsertionSorter();
        System.out.println("After the insertion sort, the array is in order: ");
        
        is.sorting(is.x);

        for(int w: is.x)
        {
            System.out.print(w + " ");

            
        }
       
        
    }
}