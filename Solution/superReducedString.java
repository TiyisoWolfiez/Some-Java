import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    // Write your code here
    
    if(s.isEmpty()){
        return "Empty String";
    }
    StringBuilder result = new StringBuilder();
    int k =0;
    int i = s.length();
    
    while(k < i){
        char currChar = s.charAt(k);
        if(k <i-1 && currChar == s.charAt(k+1)){
            k += 2;
        }
        else
        {
            result.append(currChar);
            k++;
        }
    }   
    String reducedStr = result.toString();
    
    if (reducedStr.equals(s))
        {
        // return a;
        return reducedStr;
        } 
    else {
        return superReducedString(reducedStr);
    }
    }
}
 // return reducedStr.equals(s) ? reducedStr : superReducedString(reducedStr);
// return reducedStr.isEmpty() ? "Empty String" : reducedStr;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
