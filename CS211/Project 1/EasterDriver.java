
import java.util.*;

public class EasterDriver
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        RomanNumbers juan = new RomanNumbers();
        System.out.print("Por favor entra un numero: ");
        int num = in.nextInt();
        System.out.println(juan.computeRomanNumerals(num));
    }
}