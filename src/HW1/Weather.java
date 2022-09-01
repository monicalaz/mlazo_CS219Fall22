package HW1;

public class Weather {
    public static double windchill(double t, //temperature
                                   double v) {  // velocity mph
        return 35.74 + .06215 * t + (.4275 * t - 35.75 * Math.pow(v, 0.16));
    }

        public static void main(String[]args){
            System.out.println(windchill(32, 10));
        }

    }

