/**
 * This class marks "runs", i.e., adjacent repeated values, by
 * including them in parenthesis.
 * For example:
 * 1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
 *
 *  @author Robert Thomas, rthoma
 *  @version 9/22/2017
 */

public class Sequence
{
  
  //~ Fields ................................................................
  
   private int[] values;
   private int size;

   //~ Constructor ...........................................................
   
   /**
    * Intializes the fields.
    * @param capacity the sie of the array
    */ 
   public Sequence(int capacity)
   {
      values = new int[capacity];
      size = 0;
   }
   
   //~ Methods ...............................................................
   
   /**
    * Adds the generated die roll value to the array.
    * @param value die roll value
    */ 
   public void add(int value)
   {
      if (size < values.length)
      {
         values[size] = value;
         size++;
      }
   }

   /**
    * Returns the string of values, with runs enclosed in parentheses.
    * @return the string of values with the runs marked
    * for example "1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1"
    */
  public String markRuns()
  {
    String ret = ""; // initializes and sets an empty string to be able to concatenate

    boolean isSeries = false; // boolean that checks whether a series is currently in progress

    // loops through all the values of the array, except the last one which is handled later
    for(int i = 0; i < values.length - 1; i++) 
    {
      // 4 possible cases exist since two boolean conditions are present,
      // whether the next value is equal to the current one and whether you are already in a series
      if(values[i + 1] == values[i] && !isSeries) { // If you are not in a series and the next value is equal to the current one
        ret += "(" + values[i] + " "; // Adds the parenthesis to the beginning of the series
        isSeries = true; // You are now in a series
      }
      else if(values[i + 1] == values[i]) { // If the next one is equal and you are in a series
        ret += values[i] + " "; // Adds the value as normal
      }
      else if(isSeries) { // If you are in a series and the next one is not equal
        ret += values[i] + ") "; // Adds a closing parethesis to end the series
        isSeries = false; // You are no longer in a series
      }
      else { // If you are not in a series and the next value is not equal to the current
        ret += values[i] + " "; // Adds the value as normal
      }
    }

    // Handles the last index of the array of values
    // 2 possible cases: the last value is equal or not equal to the second to last value
    if(values[values.length - 2] == values[values.length - 1]) {
      ret += values[values.length - 1] + ")"; // If it is equal, then the last value must end the series
    }
    else {
      ret += values[values.length - 1]; // If it is not, then no series is present and the value is added as normal
    }

    return ret; // returns the string
  }
}
