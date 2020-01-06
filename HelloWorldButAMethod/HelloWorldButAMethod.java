public class HelloWorldButAMethod
{
    public static void sayHello(String x)
    {
        System.out.println("Hello " + x);
        // I have created a method that wiill print out hello followed by the word entered by the user when calling the method.

    }

    public static void main(String[] args)
    {
        sayHello("Wold");
        //I am calling the method in main and set it to say "hello world."
    }
}