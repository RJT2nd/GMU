/**
 *  A class for representing a microwave oven.
 *
 *  @author Robert Thomas, rthoma
 *  @version 9/21/2017
 */
 
public class Microwave {
    
    //~ Fields ................................................................

    // Add a field representing the time
    
    // time is in seconds
    private int time;

    // Add a field representing the power level

    // powerLevel is either 1: low or 2: high
    private int powerLevel;
    //~ Constructor ...........................................................
  
    /** 
     * Creates a microwave with 0 seconds on the timer and at low power.
     */
    public Microwave()
    {
        time = 0; // time by default is 0
        powerLevel = 1; // powerLevel by default is low
    }
    
    
    //~ Methods ...............................................................
    
    /** 
     * Increases the time on the timer by 30 seconds.
     */
    public void increaseTime()
    {
      time += 30; // time is increased by 30 seconds
    }
    
    /** 
     * Switches the power level from low to high, or vice versa.
     */
    public void switchPower()
    {
      // powerLevel is switched between 1 and 2.
      // For example: case 1: (1 % 2) = 1, 1 + 1 = 2.
      //              case 2: (2 % 2) = 0, 0 + 1 = 1.
      powerLevel = (powerLevel % 2) + 1;
    }
    
    /** 
     * Resets the microwave to its initial state.
     */
    public void reset()
    {
      time = 0; // time is set back to 0, the default value
      powerLevel = 1; // powerLevel is set back to 1, the default value
    }
    
    /**
     * Starts the microwave.
     */ 
    public void start()
    {
      // Prints out the time and power level in the desired format
      System.out.printf("Cooking for %d seconds at level %d", time, powerLevel);
    }
   
}
