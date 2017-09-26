/**
 *  Robert Thomas, rthoma
 *  9/21/2017
 *  @author 
 *  @version
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
        this.setTime(time);
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
        return description;
    }

    // ----------------------------------------------------------
    /**
     * Get the hour of this appointment.
     * @return This appointment's hour, in military time.
     */

    // place getHour() here

    public int getHour() {
        return hour;
    }

    // ----------------------------------------------------------
    /**
     * Set the description of this appointment.
     * @param newDescription The new description for this appointment.
     */

    // place setDescription() here

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    // ----------------------------------------------------------
    /**
     * Set the hour of this appointment.
     * @param newHour The new hour for this  appointment, in military
     *                time.
     */

    // place setHour() here

    public void setHour(int newHour) {
        hour = newHour;
    }

    // ----------------------------------------------------------
    /**
     * Set the hour of this appointment, using a more human-friendly
     * string.
     * @param newHour The new hour for this  appointment, using an
     *                am/pm designation such as "9am" or "5pm".
     */
 
    // place setTime() here

    public void setTime(String newHour) {
        int timeHour = Integer.parseInt(newHour.substring(0, newHour.length()-2));
        String timeAmPm = newHour.substring(newHour.length()-2);
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

    public String getTime() {
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
        return String.format("%s: %s", this.getTime(), this.description);
    }
}
