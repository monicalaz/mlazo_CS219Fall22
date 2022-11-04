package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2redo {
    public static String [] loadWords(String arr, int n) {
    // connect to the web page of speeds
    URL url = null;    // null is the "nothing value"
    Scanner s = null;

    try {
        url = new URL(arr); // create a URL object for the path
        s = new Scanner(url.openConnection().getInputStream());
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

    // create an array of strings
    String [] words = new String[n];
    int i = 0;
    while (s.hasNextLine()) {
        String word = s.nextLine();
        if (Palindrome(word)){
            words[i++] = word;
        }
    }

    return words;

}
    public static boolean Palindrome(String s) {
        if (s.length() < 2)
            return true;
        else return s.charAt(0) == s.charAt(s.length() - 1) && Palindrome(s.substring(1, s.length() - 1));
    }

    public static String [] reverse(String [] rev) {
        for (int i = 0; i < rev.length / 2; i++) {
            String temp = rev[i];
            rev[i] = rev[rev.length - 1 - i];
            rev[rev.length - 1 - i] = temp;
        }
        return rev;
    }

    public static void main(String[] args) {

    System.out.println(Arrays.
            toString(reverse(loadWords("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 9))));
    }
}
