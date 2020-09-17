import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class checkMagazine {

    // Complete the checkMagazine function below.
    static void checkMagazine2(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<String,Integer>();
        for(String s : magazine){
            magazineMap.put(s, magazineMap.get(s)!=null ? magazineMap.get(s)+1: 0);
        }

        Map<String, Integer> noteMap = new HashMap<String,Integer>();
        for(String s : note){
            noteMap.put(s, noteMap.get(s)!=null ? noteMap.get(s)+1:0);
        }

        String returnVal ="Yes";
        if(noteMap.entrySet().size() > magazineMap.entrySet().size()){
            returnVal = "No";
        }else{
            Set<String> word = noteMap.keySet();
            for(String n : word){
                if(magazineMap.containsKey(n)){
                    if(magazineMap.get(n)<noteMap.get(n)){
                        returnVal = "No";
                        break;
                    }
                }else{
                    returnVal ="No";
                    break;
                }
            }
            
        }


        

        

        

        System.out.println(returnVal);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // String[] mn = scanner.nextLine().split(" ");

        int m = 6;

        int n = 4;

        String[] magazine = new String[m];

        String[] magazineItems = "give me one grand today night".split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = "give one grand today".split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine2(magazine, note);

        scanner.close();
    }
}
