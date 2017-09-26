import java.util.*;

public class test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array length: ");
        int len = sc.nextInt();
        int[] testArray = new int[len];
        System.out.println("Input list of integers: ");
        for(int i=0; i<len; i++)
        {
            testArray[i] = sc.nextInt();
        }
        
        int largestInt = len > 0 ? 0 : testArray[0];
        int largestIndex = 0;
        for(int i = 0; i<len; i++)
        {
            if(testArray[i] > largestInt)
            {
                largestInt = testArray[i];
                largestIndex = i;
            }
        }

        int thirdSum = 0;
        for(int i=0; i<len; i+=3)
        {
            thirdSum+=testArray[i];
        }

        
        System.out.println("Largest Integer: " + largestInt + " @ " + largestIndex);
        System.out.println("Sum of every third: " + thirdSum);
    }
}