import java.util.Arrays;
import java.util.Comparator;

public class SortToMakeBig {
  
    
    class Solution {
        public String solution(int[] numbers) {
            int sum = 0;
            for(int i = 0; i<numbers.length; i++){
                sum = sum+ numbers[i];
            }
            if(sum==0){
                return "0";
            }

            
            String answer = "";
            String [] numbersString = new String[numbers.length];

            for(int i = 0; i<numbers.length; i++){
                numbersString[i] = String.valueOf(numbers[i]);
            }

            Comparator<String> pairComparator = new Comparator<String>(){
                
                @Override
                public int compare (String a, String b){
                    return -(a+b).compareTo((b+a));
                }
            };

            Arrays.sort(numbersString,pairComparator);

            StringBuilder sb = new StringBuilder();
            for(int i=0;i<numbersString.length;i++){
                sb.append(numbersString[i]);
            }

            answer = sb.toString();




            return answer;
        }
    }
}
