import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution2 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        // IntStream streamAr = Arrays.stream(ar);
        // Map<Integer,Integer> mapAr = streamAr.collect(toMap())
        Integer [] arInteger = Arrays.stream(ar).boxed().toArray(Integer[]::new);
        Map<Integer,Integer> mapAr = new HashMap<Integer,Integer>();
        int result = 0;
        for(int i =0 ; i<n ; i++){
            if(!mapAr.containsKey(arInteger[i])){
                mapAr.put(arInteger[i], 1);
            }else{
                mapAr.put(arInteger[i], mapAr.get(arInteger[i])+1);
            }
        }
        for(Integer key : mapAr.keySet()){
            result = result + mapAr.get(key)/2;
        }



        return result;


//best answer in my opinion
    //     Set<Integer> colors = new HashSet<>();
    // int pairs = 0;

    // for (int i = 0; i < n; i++) {
    //     if (!colors.contains(c[i])) {
    //         colors.add(c[i]);
    //     } else {
    //         pairs++;
    //         colors.remove(c[i]);
    //     }
    // }

    // System.out.println(pairs);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
