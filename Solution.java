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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
        int beforeCnt = 0;
        int currentCnt = 0;
        int result = 0;


        //initialize for first value;
        if(path.charAt(0) =='U'){
            currentCnt = 1;
        }else if (path.charAt(0) =='D'){
            currentCnt = -1;
        }

        for(int i=1;  i< steps; i++){
            if(path.charAt(i) == 'U'){
                beforeCnt = currentCnt++;

            }else if(path.charAt(i) == 'D'){
                beforeCnt = currentCnt--;
            }

            if(beforeCnt == -1 && currentCnt == 0){
                result++;
            }
        }
        

        return result;

        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int steps = Integer.parseInt(bufferedReader.readLine().trim());

        // String path = bufferedReader.readLine();

        // int result = Result.countingValleys(steps, path);
        int result = Result.countingValleys(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD");

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
