import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//failed...
public class JumpCloud {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int result = 0;
        for(int i=0; i<c.length-1;i++){
            if (c[i+1] == 1){
                result ++;
                i++;
            }else if(i+2 < c.length &&c[i+2] == 1){
                result ++;
            }else if(i+1 < c.length && c[i+1]==0 && i+2<c.length && c[i+2]==0){
                result++;
                i++;
            }else result++;
        }

        return result;

    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 7;//scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[] {0, 0, 1, 0, 0, 1, 0}; //new int[n];

        // String[] cItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        //     int cItem = Integer.parseInt(cItems[i]);
        //     c[i] = cItem;
        // }

        int result = jumpingOnClouds(c);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        // scanner.close();
    }
}
