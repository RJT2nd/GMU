/**
 *  
 *  
 *  @author Robert Thomas, rthoma
 *  @version 9/21/2017
 */
 
public class Appointment 
{
    //~ Fields ................................................................

    // Add a field representing the hour of this appointment

    private int hour;
    
    // Add a field representing the description of this appointment

    private String description;

    //~ Constructors ...........................................................

    /**
     * Creates an appointment.
     * 
     * @param hour The hour (time) of this appointment, in military time
     *             (0-23).
     * @param description The description of this appointment.
     */

    public Appointment(int hour, String description) {

        // this refers to the appointment being made
        // hour and description refer to the input parameters
        // this.hour and this.description refer to the object's variables
        this.hour = hour;
        this.description = description;
    }
    
    /**
     * Creates an appointment
     * 
     * @param time String representation of the time
     * @param newDescription Description of the appointment
     */

    public Appointment(String time, String newDescription) {
        // the input parameter time is in standard time, not military
        // by default this.hour is empty. By calling setTime, we handle the logic for setting time only once. 
        this.setTime(time);

        // Since there is no description parameter, description refers to this.description
        description = newDescription;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get the description of this appointment.
     * @return This appointment's description.
     */
 
    // place getDescription() here

    public String getDescription() {
        return description; // returns the appointment's description
    }

    // ----------------------------------------------------------
    /**
     * Get the hour of this appointment.
     * @return This appointment's hour, in military time.
     */

    // place getHour() here

    public int getHour() {
        return hour; // returns the appointment's hour in military time
    }

    // ----------------------------------------------------------
    /**
     * Set the description of this appointment.
     * @param newDescription The new description for this appointment.
     */

    // place setDescription() here

    public void setDescription(String newDescription) {
        description = newDescription; // sets the appointment's description to the input
    }

    // ----------------------------------------------------------
    /**
     * Set the hour of this appointment.
     * @param newHour The new hour for this  appointment, in military
     *                time.
     */

    // place setHour() here

    public void setHour(int newHour) {
        hour = newHour; // sets the appointment's hour to the input in military time
    }

    // ----------------------------------------------------------
    /**
     * Set the hour of this appointment, using a more human-friendly
     * string.
     * @param newHour The new hour for this  appointment, using an
     *                am/pm designation such as "9am" or "5pm".
     */
 
    // place setTime() here

    public void setTime(String newHour) { // setTime sets the appointment's hour in standard time
        
        // this divides the newHour string into the hour part and the 'am'/'pm' part
        int timeHour = Integer.parseInt(newHour.substring(0, newHour.length()-2)); // the number of the hour
        String timeAmPm = newHour.substring(newHour.length()-2); // whether it is 'am' or 'pm'

        // 4 possible cases exist and are handled in this order:
        // 1. after midnight/before noon
        // 2. midnight (12am)
        // 3. noon (12pm)
        // 4. afternoon
        if(timeAmPm.equalsIgnoreCase("am") && timeHour != 12) {
            this.hour = timeHour;
        }
        else if(timeAmPm.equalsIgnoreCase("am")) {
            this.hour = 0;
        }
        else if(timeHour == 12){
            this.hour = timeHour;
        }
        else {
            this.hour = timeHour + 12;
        }
    }

    public String getTime() { // this is a method I created that returns the time as standard
        
        // 4 possible cases exist and are handled in this order:
        // 1. noon (12pm)
        // 2. afternoon
        // 3. midnight (12am)
        // 4. before noon
        boolean pastNoon = hour >= 12;
        if(pastNoon && hour == 12) {
            return hour + "pm";
        }
        else if(pastNoon) {
            return (hour - 12) + "pm";
        }
        else if(hour == 0) {
            return "12am";
        }
        else {
            return hour + "am";
        }
    }

    // ----------------------------------------------------------
    /**
     * Get a string representation of this appointment.
     * @return A human-readable representation of this appointment
     * that includes the time (in am/pm format) and the description,
     * such as "3pm: CS 211".
     * @Override
     */
    // place toString() here

    public String toString() {

        // returns a string in a "{standard time}: {description}" format
        return String.format("%s: %s", this.getTime(), this.description);
    }
}
