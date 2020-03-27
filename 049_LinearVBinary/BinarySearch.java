public class BinarySearch
{
    //creating an object so I can acess the array in OneThousandSortedRandomNumbers
    OneThousandSortedRandomNumbers ot = new OneThousandSortedRandomNumbers();
    //Using the get method from the OneThousandSortedRandomNumbers class to create an array
    int[] x = ot.getSortedArray();
    //The counter variable will count the number of iterations it takes to find each number.
    int counter = 0;

    //This method will search for the target number
    //The method includes parameters to enter in the array, the first and last number of the array, and the number that is being searched for in the array.
    public int search(int[] arr, int first, int last, int target)
    {
        //mid is the number in the exact middle of the first and last number. It's value will change as the loop runs
        int mid = (first + last)/2;
        //This is a binary search, so I am using a while loop that will run as long as the last number is bigger than the first.
        while(first <= last)
        {
            //This search will start with the middle number to cut off half of the numbers in the array
            //If the number in the middle is less than the target, the first number will now be the middle value +1;
            if(arr[mid] < target)
            {
                first = mid + 1;
            }
            //If the array value at mid is equal to the target number, mid is the index of the target number, and the loop will end
            else if(arr[mid] == target)
            {
                //Printing out the location of the number, and the number of iterations it tool to find.
                System.out.println("The number " + target +  " is found at index "  + mid);
                System.out.println("it took " + counter + " iterations to find the number " + target);
                break;
            }
            //If neither of the above if statemets are true, the target number is at an index less than mid
            //The last number will now become mid -1, cutting off the back half of the array.
            else
            {
                last = mid -1;
            }
            //This is the new middle number to start the search when the while loop runs again
            mid = (first + last)/2;
            //adding 1 to the counter each time the loop runs to count the iterations
            counter++;
        }
        //If the number is not found in the array, -1 will be returned
        return -1;
    }

    public static void main(String [] args)
    {
        //Creating a class object to be able to acess the methods and class level variables in main
        BinarySearch bs = new BinarySearch();
        //Calling the search method for each number that is being searched for.
        bs.search(bs.x, bs.x[0], bs.x.length-1, 7250);
        bs.search(bs.x, bs.x[0], bs.x.length-1, 9463);
        bs.search(bs.x, bs.x[0], bs.x.length-1, 1137);
        bs.search(bs.x, bs.x[0], bs.x.length-1, 4837);

    }
}