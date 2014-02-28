/**
 * Complete the following methods in a class called DateUtil:
 * 
 * - boolean isLeapYear(int year): returns true if the given year is a leap year. 
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * 
 * - boolean isValidDate(int year, int month, int day): returns true if the given year, 
 * month and day constitute a given date. Assume that year is between 1 and 9999, 
 * month is between 1 (Jan) to 12 (Dec) and day shall be between 1 and 28|29|30|31 
 * depending on the month and whether it is a leap year.
 * 
 * - int getDayOfWeek(int year, int month, int day): returns the day of the week,
 * where 0 for SUN, 1 for MON, ..., 6 for SAT, for the given date. Assume that the date is valid.
 * 
 * - String toString(int year, int month, int day): prints the given date 
 * in the format "xxxday d mmm yyyy", e.g., "Tuesday 14 Feb 2012". Assume that the given date is valid.
 * 
 * To find the day of the week (Reference: Wiki "Determination of the day of the week"):
 * 1. Based on the first two digit of the year, get the number from the following "century" table.
 *  -------+---------+--------+--------+--------+--------+--------+--------+
 *  1700-  |  1800-  | 1900-  | 2000-  | 2100-  | 2200-  | 2300-  | 2400-  |
 *    4    |    2    |   0    |   6    |   4    |   2    |   0    |   6    |
 *  -------+---------+--------+--------+--------+--------+--------+--------+
 * Take note that the entries 4, 2, 0, 6 repeat.
 * 
 * 2. Add to the last two digit of the year.
 * 
 * 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
 * 
 * 4. Add to the number obtained from the following month table:
 * -------------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
 *                Jan |	Feb | Mar | Apr | May | Jun | Jul | Aug | Sep | Oct | Nov | Dec |
 * -------------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * Non-Leap Year  0   | 3   | 3   | 6   | 1   | 4   | 6   | 2   | 5   | 0   | 3   | 5   |
 * -------------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
 * Leap Year	  6   |	2   |                    same as above                          |
 * -------------------+-----+-----------------------------------------------------------+
 * 
 * 5. Add to the day.
 * 
 * 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
 * 
 * For example: 2012, Feb, 17
 * (6 + 12 + 12/4 + 2 + 17) % 7 = 5 (Fri)
 */

package javaexercises.difficult;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
    
    private final int MIN_YEAR = 1;
    private final int MAX_YEAR = 9999;
    
    // Month's name – for printing
    private final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    // Day's name - for printing
    private final String[] strDays   = {"Sunday", "Monday", "Tuesday", "Wednesday",
                                        "Thursday", "Friday", "Saturday"};

    // Number of days in each month (for non-leap years)
    private final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    private final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    
    private final int[] leapYearMonthNumbers    = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    
    
    public static void main(String[] args) {
        DateUtil aDateUtil = new DateUtil();
        
        System.out.println(aDateUtil.isLeapYear(1900));  // false
        System.out.println(aDateUtil.isLeapYear(2000));  // true
        System.out.println(aDateUtil.isLeapYear(2011));  // false
        System.out.println(aDateUtil.isLeapYear(2012));  // true

        System.out.println(aDateUtil.isValidDate(2012, 2, 29));  // true
        System.out.println(aDateUtil.isValidDate(2011, 2, 29));  // false
        System.out.println(aDateUtil.isValidDate(2099, 12, 31)); // true
        System.out.println(aDateUtil.isValidDate(2099, 12, 32)); // false

        System.out.println(aDateUtil.getDayOfWeek(1982, 4, 24));  // 6:Sat
        System.out.println(aDateUtil.getDayOfWeek(2000, 1, 1));   // 6:Sat
        System.out.println(aDateUtil.getDayOfWeek(2054, 6, 19));  // 5:Fri
        System.out.println(aDateUtil.getDayOfWeek(2012, 2, 17));  // 5:Fri
        
        // test
        aDateUtil.getDayOfWeekTest(1982, 4, 24);
        aDateUtil.getDayOfWeekTest(2000, 1, 1);
        aDateUtil.getDayOfWeekTest(2054, 6, 19);
        aDateUtil.getDayOfWeekTest(2012, 2, 17);


        System.out.println(aDateUtil.toString(2012, 2, 14)); // Tuesday 14 Feb 2012
        System.out.println(aDateUtil.toString(2014, 2, 26)); // Wednesday 26 Feb 2014
    }
    
    /**
     * Returns true if the given year is a leap year.
     * A year is a leap year if it is divisible by 4 but not by 100,
     * or it is divisible by 400.
     * 
     * @param  year
     * @return true if the given year is a leap year.
     */
    private boolean isLeapYear(int year) {
        return (year%4 == 0 && year%100 != 0) || (year%400 == 0);
    }
    
    /**
     * Returns true if the given year, month and day constitute a given date.
     * Assume that year is between 1 and 9999, month is between 1 (Jan) to 12 (Dec)
     * and day shall be between 1 and 28|29|30|31 depending on the month 
     * and whether it is a leap year.
     * 
     * @param year
     * @param month
     * @param day
     * @return true if the given year, month and day constitute a given date.
     */
    private boolean isValidDate(int year, int month, int day)
    {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            return false;
        }        
        if (month < 1 || month > 12) {
            return false;
        }        
        int monthDays = daysInMonths[month-1] + (month == 2 && isLeapYear(year) ? 1 : 0);        
        return 1 <= day && day <= monthDays;
    }
    
    // Return the day of the week, 0:Sun, 1:Mon, ..., 6:Sat
    private int getDayOfWeek(int year, int month, int day)
    {   
        // 1. Based on the first two digit of the year, get the number from the "century" table.
        int magicCenturyNumber = 6 - 2*((year / 100) % 4);
        
        // 2. Add to the last two digit of the year.
        int lastTwoDigitsOfYear = year % 100;
        
        // 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        
        // 4. Add to the number obtained from the month table.
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];
        
        // 5. Add to the day.
        int magicDayNumber = day;
        
        // 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
        return (  magicCenturyNumber + lastTwoDigitsOfYear 
                + magicYearNumber    + magicMonthNumber + magicDayNumber) % 7;
    }
    
    // test method getDayOfWeek()
    private void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);  // month is 0-based
        // Get the day of the week number: 1 (Sunday) to 7 (Saturday)
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String[] calendarDays = { "Sunday", "Monday", "Tuesday", "Wednesday",
                                  "Thursday", "Friday", "Saturday" };
        // Print result
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }
    
    // Return String "xxxday d mmm yyyy" (e.g., Wednesday 29 Feb 2012)
    private String toString(int year, int month, int day) {
        if ( ! isValidDate(year, month, day)) {
            return "Not a valid date!";
        }        
        int d = getDayOfWeek(year, month, day);        
        return strDays[d] + " " + day + " " + strMonths[month-1] + " " + year;
    }
}
