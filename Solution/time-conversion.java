import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String str) {
    // Write your code here
    int h1 = (int) str.charAt(1) - '0';
    int h2 = (int) str.charAt(0) - '0';
    int hh = (h2 * 10 + h1 % 10);

    // Check if the time is in "AM"
    if (str.charAt(8) == 'A') {
        if (hh == 12) {
            // Midnight (12:00 AM)
            return "00" + str.substring(2, 8);
        } else {
            // Any other time in the morning
            return str.substring(0, 8);
        }
    } else { // If time is in "PM"
        if (hh == 12) {
            // Noon (12:00 PM)
            return "12" + str.substring(2, 8);
        } else {

            hh += 12;
            return hh + str.substring(2, 8);
        }
    }
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

