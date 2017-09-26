/*
 * Class to compute when Easter Sunday occurs in a given year
 * by using Carl Friedrich Gauss's algorithm. 
 * 
 * @author
 * @version 
 */ 
public class Easter
{
    private int month = -1; 
    private int day = -1;

    /*
     * Method to compute the date of Easter Sunday.
     * 
     * @param year for when Easter occurs in the given year
     */
    public void computeEasterDate(int year)
    {
        // Carl Friedrich Gauss' Formula
        // Step 1
        int y = year;

        // Step 2    
        int a = y % 19;

        // Step 3
        int b = y / 100;
        int c = y % 100;

        // Step 4
        int d = b / 4;
        int e = b % 4;

        // Step 5
        int g = (8 * b + 13) / 25;

        // Step 6
        int h = (19 * a + b - d - g + 15) % 30;
        
        // Step 7
        int j = c / 4;
        int k = c % 4;

        // Step 8
        int m = (a + 11 * h) / 319;

        // Step 9
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        
        // Step 10
        int n = (h - m + r + 90) / 25;

        // Step 11
        int p = (h - m + r + n + 19) % 32;

        month = n;
        day = p;
   }

    /*
     * Method to return the month of Easter Sunday
     * 
     * @return month of Easter Sunday
     */
    public int getEasterSundayMonth()
    {
        return month;
    }

    /*
     * Method to return the day of Easter Sunday
     * 
     * @return day of Easter Sunday
     */
    public int getEasterSundayDay()
    {
        return day;
    }
}
