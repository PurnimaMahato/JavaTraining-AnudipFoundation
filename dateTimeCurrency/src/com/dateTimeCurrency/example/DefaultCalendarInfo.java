//Q.1)Write a Java program to get and display information (year, month, day, hour, minute) about a default calendar.
package com.dateTimeCurrency.example;
import java.util.Calendar;

public class DefaultCalendarInfo {
    public static void main(String[] args) {
        // Create a new Calendar object
        Calendar calendar = Calendar.getInstance();

        // Get the year, month, day, hour, and minute values
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);

        // Display the values
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
    }
}
