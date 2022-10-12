package HW6;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {
    public static void swallow_stats() {

        // connect to the webpage of speeds
        URL url = null;     // null is the "nothing" value
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sum = 0.0;
        int count = 0;

        double max =  Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;


        // read each line of the web file
        while (s.hasNextLine()) {

            String line = s.nextLine(); // read a line of the website

            if (line.indexOf('#') == -1 && !line.equals("")) { // modify condition
                double stats = Double.parseDouble(line);
                sum = sum + stats;
                count++;

                if (stats < min)
                    min = stats;
                else if (stats > max)
                    max = stats;
            }
        }
        System.out.printf("Average swallow speeds is %.2f. \n" , sum / count );
        System.out.printf("Maximum swallow speed is %.1f.\n", max );
        System.out.printf("Minimum swallow speed is %.1f. \n", min);
    }



    public static void main(String [] args) {
        swallow_stats();
    }

}



