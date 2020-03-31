public class SelectionSorter
{
    //creating an object from the unsortedArrays class to be able to acess the array
    UnsortedArrays ua = new UnsortedArrays();
    //Creating an array variable by calling the method to get the numbers from the UnsortedArray class.
    int[] x = ua.getArrOne();

    //This method will sort the array into the proper order from smallest to biggest.
    public void sort(int[] arr)
    {
        //Using a for loop to run through the array.
        for(int i = 0; i < arr.length - 1; i++)
        {
            //the index variable will compare the current number to the one after it to check if it is in the right location.
            int index = i;
            //This for loop does the comparison by using the number i from the previous for loop, and adding one to that indext to compare their values.
            for(int j = i + 1; j < arr.length; j++)
            {
                //If the number at index j is less than the number at index i, than the number belongs at index j.
                if(arr[j] < arr[index])
                {
                    index = j;
                }
            }
            //The current lowest number is stored in the array at location index.
            int lowNum = arr[index];
            //location of array at index = number at array location i.
            arr[index] = arr[i];
            //the number in array at location i is now the new low number, and it will be the next number that gets compared in the arrray.
            arr[i]= lowNum;
        }
    }
    public static void main(String[] args)
    {
        //Creating a class object to be able to acess all variables and methods in the class.
        SelectionSorter ss = new SelectionSorter();


        System.out.println("The new list after the sort is: ");

        //Calling the sort method to get the new array.
        ss.sort(ss.x);
        
        //Using an enhanced for loop to run through and print out every number in the array that is now in proper order  
        for(int j: ss.x) 
        {
            System.out.print(j + " ");
        }
    }
}