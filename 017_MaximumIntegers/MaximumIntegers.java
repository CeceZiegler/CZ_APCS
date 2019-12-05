public class MaximumIntegers
{
    public static void main(String [] args)
    { 
        /* This program uses the Integer wrapper class. From that class we can obtain the min and max values
        of the integer class. By using the overflow and underflow of the min and max values, we can print 
        out numbers that we want.*/
        
        Integer max = new Integer(0);
        Integer min = new Integer(0);
        max = max.MAX_VALUE;
        min = min.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);
        System.out.println(max + 2147483647 + 2 + 1000000);
        System.out.println(min - 2147483647 + 744 );


    }
}
