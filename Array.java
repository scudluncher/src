import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[] a = new int[36];
        int k = 0;
        Integer maxVal = null;
        for(int i = 0 ; i<arr.length ;i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                a[k++] = arr[i][j];
            }
        }

        for(int l = 0 ; l<22 ; l++){
            if(l%6 == 4){
                continue;
            }else if(l%6 == 5){
                continue;
            }else{
                int temp= a[l] + a[l+1] + a[l+2] 
                      +a[l+7] 
                    + a[l+12] + a[l+13] +a[l+14];
                if(l==0){
                    maxVal = temp;
                }else{
                    if (temp>maxVal.intValue()){
                        maxVal = temp;
                    }
                }
                    }
                        
        }

        return maxVal.intValue();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
