import java.util.*;
import java.io.*;

public class PrimesCalculator {
    public static void main(String[] args) {
        try{
            File outputFile = new File("output.txt");
            outputFile.createNewFile();

            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(outputFile);

            System.out.print("Please an integer: ");
            int inputInt = in.nextInt();
            ArrayList<Integer> primes = findLesserPrimes(inputInt);
            out.println("Inputed Integer: " + inputInt);
            out.println("Lesser Primes: ");

            for(int i : primes) {
                out.println(i);
            }

            out.close();
        }
        catch(Exception e) {
            System.out.print("Failure");
        }
    }

    public static ArrayList<Integer> findLesserPrimes(int inputInt) {
        ArrayList<Integer> outputPrimes = new ArrayList<Integer>();
        
        boolean isPrime = true;

        for(int i = 2; i <= inputInt; i++) {
            
            isPrime = true;

            for(int j = i - 1; j > 1; j--) {
                if(i % j == 0)
                    isPrime = false;
            }

            if(isPrime)
                outputPrimes.add(i);

        }

        return outputPrimes;
    }
}