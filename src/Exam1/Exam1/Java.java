package Exam1.Exam1;

import java.util.Scanner;

public class Java {

    public static void main(String[] args) {

        // prompt for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number in integer form: ");

        // check the format
        if (!in.hasNextDouble()) {
            String n = in.next();
            System.err.println(n + " is not a number");
        }else{
            System.out.println(between(n));
        }

        public static int between(int n){

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (i < 2 || i > 7) {
                    count = count + i;
                }
            }
            return count;
        }

    }
}
