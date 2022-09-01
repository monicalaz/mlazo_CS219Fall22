package utility;

public class Investment {

    public static double investment (double c, double r, int t, int n) {
        return  c * Math.pow( 1 + r/n, t*n );

    }


   //     double c = 1.0; // initial deposit
        //     double r = 1.0; //interest rate
       // int t = 1; // number of years
      //  int n = (int) 2e9;  // compound billion times
        // convert the int to a double
    // double p = c * Math.pow( 1 + r/n, t*n );
        public static void main(String [] args){System.out.println(investment(1000, 0.03,10,365) );
    }
}
