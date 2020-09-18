import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class aCounter {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long stringLen = s.length();
        long result = 0;
        long remainder = n%stringLen;
        long quote = n/stringLen;
        long aInString = aCounter(s);
        long aInRemainder = aCounter(s.substring(0, (int)remainder));
        
        
        
        result = aInString*quote + aInRemainder;


        return result;

    }

    static long aCounter(String s){
        long result = 0;

        for(int i=0; i<s.length() ;i++){
            if(s.charAt(i)=='a'){
                result++;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
