import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Collections.*;
import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    // Collections.sort(arr);
    List<Integer> sortedArr = new ArrayList<>(arr);
    Collections.sort(sortedArr);
    
    long min = 0;
    long max = 0;
    
    for(int i=0;i<sortedArr.size()-1;++i){
        min += sortedArr.get(i);
    }

    for (int j = 1; j < sortedArr.size(); j++) {
        max += sortedArr.get(j);
    }
    
    System.out.print(min + " " + max);

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

