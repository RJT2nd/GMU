/**
 *  
 *
 *  @author Robert Thomas, rthoma  
 *  @version 9/21/2017
 */
public class Diary
{
    //~ Fields ................................................................

    // declare your 2D array of appointments here
    private Appointment[][] appointments;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new WeeklyCalendar object.
     */
        
    // Initialize your 2D array of appointments in the constructor
    
    public Diary() {
        // In a week, there are 7 days (0-6) and 10 hours from 8am-5pm (0-9)
        this.appointments = new Appointment[7][10];
    }

    //~ Methods ...............................................................

    /**
     * Add a new appointment on the specified day.  The time for the
     * appointment is extracted from the appointment object itself.
     * If the day is invalid, the method does nothing.  If the appointment
     * is outside the window of 8am-5pm, the method does nothing.
     * If another appointment has already been entered for the
     * specified day/time, it is removed and replaced by the one
     * being added.
     * 
     * @param day         The day for the appointment.
     * @param appointment The appointment to add on that day (contains
     *                    its own time).
     */
    
    // place addAppointment() here

    public void addAppointment(int day, Appointment appointment) {
        int hour = appointment.getHour();
        
        // There are only 7 days in a week, so less than 0 and more than 7 are thrown out
        if (day > 6 || day < 0) {
            return; // ends the method
        }

        // Invalid time less than 08 more than 17
        if (hour < 8 || hour > 17 ) {
            return; // ends the method
        }

        // hour - 8 is used because the available hours are 8am-5pm,
        // subtracting 8 allows us to fit it in the array as 0-9
        this.appointments[day][hour - 8] = appointment;
    }

    // ----------------------------------------------------------
    /**
     * Retrieve an existing appointment (if any) by day and hour.
     * 
     * @param day  The day to check.
     * @param hour The hour to check, in military time.
     * @return The appointment at the specified day and time,
     * if there is one, or null if no appointment is found, if
     * the day specified is invalid, or if the hour specified is
     * outside the range 8-17.
     */
    
    // place getAppointment() here

    public Appointment getAppointment(int day, int hour) {
        // There are only 7 days in a week, so less than 0 and more than 6 are thrown out
        if (day > 6 || day < 0) {
            return null; // ends the method
        }

        // Invalid time less than 08 more than 17
        if (hour < 8 || hour > 17 ) {
            return null; // ends the method
        }

        // hour - 8 is used because the available hours are 8am-5pm,
        // subtracting 8 allows us to fit it in the array as 0-9
        return appointments[day][hour - 8];
    }
}
