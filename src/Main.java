import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0;
        double celsius;
        System.out.println("Temperature in celsius?");
        if (in.hasNextDouble())
        {
            celsius = in.nextDouble();
            fahrenheit = celsius * 9/5 + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        else
        {
            System.out.println("invalid entry");
        }
    }
}