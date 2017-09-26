import java.util.*;

public class HelloLab {
    public static void main (String [] args) {
        System.out.println("Hello, Lab!");
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please input a float:");
        float x = in.nextFloat();
        System.out.println("Please input a double:");
        double f = in.nextDouble();
        System.out.println("Please input an integer:");
        int g = in.nextInt();

        double average = (x + f + g)/3;

        System.out.println("The average of " + x + ", " + f + ", " + g + " is equal to " + average);

        System.out.println("the double input casted as an int is " + (int)f);

        System.out.println(x >= g ? "The float is greater than or equal to the integer" : "The float is less than the integer");
    }
}