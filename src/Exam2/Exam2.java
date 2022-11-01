package Exam2;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;



public class Exam2 {
    public static String [] load_words(String path, int n) {

        URL url = null;
        Scanner s = null;

        try {
            url = new URL(path);
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
            words[i++] = s.nextLine();
        }

        return words;
    }


    public static void Palindrome(String words) {
        String [] palindrome = {};
        if (words.length() < 2);

        else  (words.charAt(0) == words.charAt(words.length() - 1) &&
                Palindrome(words.substring(1,words.length() - 1)))
            palindrome.append.Words
    }


    public static int [] reverse(int [] s) {
        for (int i = 0; i < s.length/2; i++) {
            int temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        return s;
    }


    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);
        System.out.println(reverse( palindrome));
}