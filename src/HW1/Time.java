package HW1;

public class Time {
    public static void main(String [] args) {

        int hour = 17;
        int minute = 23;
        int seconds = 56;
        int seconds_since = hour * 3600 + minute * 60 + seconds;
        int seconds_remaining = 86400 - seconds_since;
        int elapsed_percent = (seconds_since * 100) / 86400;

        // or double elapsed_percent = (seconds_since * 100) / 86400 ;

        System.out.println("Homework 1");
        System.out.println(hour + ":" + minute + ":" + seconds + " is " + seconds_since + " seconds since midnight." );
        System.out.println("There are " + seconds_remaining + " seconds remaining.");
        System.out.println( elapsed_percent +"% of the day has elapsed.");
    }
}
