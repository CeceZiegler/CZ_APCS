public class InsertionSorter
{
    //creating an object from the unsortedArrays class to be able to acess the array
    UnsortedArrays ua = new UnsortedArrays();
    //Creating an array variable by calling the method to get the numbers from the UnsortedArray class.
    int[] x = ua.getArrOne();

    public void sorting(int arr[])
    {
        int y = arr.length;
        for(int i = 1; i < y; i++)
        {
            int spot = arr[i];
            int j = i-1;
            while((j > -1) && (arr[j] > spot))
            {
                arr[j+1] = arr[j];
                j--;
            }
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