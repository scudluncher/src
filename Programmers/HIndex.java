import java.util.Arrays;
import java.util.Collections;

public class HIndex {
  
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        Solution.solution(citations);
    }
static class Solution {
    public static int solution(int[] citations) {
        int answer = 0;
        
        
        
        Integer[] citationsInt =  Arrays.stream( citations ).boxed().toArray( Integer[]::new );
        
        // 6 5 3 1 0 
       
        Arrays.sort(citationsInt, Collections.reverseOrder()); // 6 5 3 1 0
        
        
       outer: for(int i : citationsInt){
            System.out.println(i);
            int counter = 0;
            if(i>citationsInt.length){
                continue;
            }
            for(int j : citationsInt){
                if(j>=i){
                    counter++;
                    if(i==counter){
                        answer = i;
                        break outer;
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
        
    }
}

    
}
