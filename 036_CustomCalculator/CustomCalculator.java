public class CustomCalculator
{
    public static void main(String[] args)
    {
        CustomCalculator cc = new CustomCalculator();
        
        cc.add(5,6);
    }
    //This method will add two integers entered by the user when called.
    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
    //This method will subtract two integers entered by the user when called.
    public void subtract(int c, int d)
    {
        System.out.println(c - d);
    }
    // This method will multiply two integers entered by the user when called.
    public void multiply(int e, int f)
    {
        System.out.println(e * f);
    }
    //This method will divide two integers entered by the user when called.
    public void divide(int g, int h)
    {
        System.out.println(h / g);
    }
    //This method will square the integer entered by the user when called.
    public void square(int i)
    {
        System.out.println(i *  i);
    }
    //This method will square the number the user entered and multiply it by pi when called.
    public void areaOfCircle(int r)
    {
        System.out.println((3.1415 * (r * r)));
    }
    //This method will find the volume by cubing an integer entered by the user when called.
    public void volumeOfACube(int w)
    {
        System.out.println(w * w * w);
    }
    //This method will find the perimeter of a square by multipling the integer entered when called.
    public void perimeterOfSquare(int x)
    {
        System.out.println(x * 4);
    }

}