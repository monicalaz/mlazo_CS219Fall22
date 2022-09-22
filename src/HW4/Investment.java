package HW4;

import java.util.Scanner;
    public class Investment {
        public static double investment(double c, double r, int t, int n) {
            return c * Math.pow(1 + r / n, t * n);
        }
        public static double getDeposit(Scanner s) {
            boolean valid = false;
            double deposit = 0;

            while (!valid) {
                System.out.print("Please enter initial deposit as decimal: ");

                if (s.hasNextDouble()) {
                    deposit = s.nextDouble();
                    if (deposit < 0) {
                        System.out.printf("Error: deposit cannot be negative. You entered %.2f\n", deposit);
                    }
                    else {
                        valid = true;
                    }
                } else {
                    System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
                }
            } // while
            return deposit;
        }
        public static double getRate(Scanner s) {
            boolean valid = false;
            double rate = 0;

            while (!valid) {
                System.out.print("Please enter interest rate as decimal: ");

                if (s.hasNextDouble()) {
                    rate = s.nextDouble();
                    if (rate < 0) {
                        System.out.printf("Error: rate cannot be negative. You entered %.2f\n", rate);
                    }
                    else {
                        valid = true;
                    }
                } else {
                    System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
                }
            } // while
            return rate;
        }
        public static int getYears(Scanner s) {
            boolean valid = false;
            double years = 0;

            while (!valid) {
                System.out.print("Please enter number of years as an integer: ");

                if (s.hasNextDouble()) {
                    years = s.nextDouble();
                    if (years < 0) {
                        System.out.printf("Error: years cannot be negative. You entered %.2f\n", years);
                    }
                    else {
                        valid = true;
                    }
                } else {
                    System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
                }
            } // while
            return (int) years;
        }
        public static int getTimes(Scanner s) {
            boolean valid = false;
            double times = 0;

            while (!valid) {
                System.out.print("Please enter number of times to compound per year as an integer: ");

                if (s.hasNextDouble()) {
                    times = s.nextDouble();
                    if (times < 0) {
                        System.out.printf("Error:the number of times cannot be negative. You entered %.2f\n", times);
                    }

                    else {
                        valid = true;
                    }
                } else {
                    System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n", s.next());
                }
            } // while
            return (int) times;
        }
        public static void main ( String [] args) {
            Scanner kbd = new Scanner(System.in);

            double deposit = getDeposit(kbd);
            double rate = getRate(kbd);
            int years = getYears(kbd);
            int times = getTimes(kbd);

            System.out.printf("Your investment is worth %.2f\n",
                    investment(deposit, rate, years, times));
    }
}





