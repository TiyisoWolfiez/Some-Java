import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
    //for(int k = 0; k < d; k++){
        //int first = a.get(0);
        
        //for(int j = 1; j < a.size(); j++){
          //  a.set(j - 1, a.get(j));
        //}
        
      //  a.set(a.size() - 1, first);
    //}
    //return a;
    
    int n = a.size();
    d = d % n; 
    
    // Reverse the first d elements
    reverse(a, 0, d - 1);
    
    // Reverse the remaining elements
    reverse(a, d, n - 1);
    
    // Reverse the entire array
    reverse(a, 0, n - 1);
    
    return a;
}

private static void reverse(List<Integer> a, int start, int end) {
    while (start < end) {
        int temp = a.get(start);
        a.set(start, a.get(end));
        a.set(end, temp);
        start++;
        end--;
    }
}


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotLeft(a, d);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
