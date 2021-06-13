import java.util.Arrays;
import java.util.Collections;

public class HIndex {
  
    public static void main(String[] args) {
        // int[] citations = {25,8,5,3,3};
        int[] citations = {61,33};
        int answer = Solution.solution(citations);
        System.out.println(answer);
    }

        static class Solution {
            public static int solution(int[] citations) {
                int answer = 0;
        
        
        
                Integer[] citationsInt =  Arrays.stream( citations ).boxed().toArray( Integer[]::new );
                
                // 6 5 3 1 0 
            
                Arrays.sort(citationsInt, Collections.reverseOrder()); // 6 5 3 1 0
                    
                int startPoint = citations.length;  //5 
        
                    int largeCount = 0;
                int smallCount = 0;
                
                while(startPoint>=0){
                    for(int i = 0 ;  i<citationsInt.length; i++){
                        if(citationsInt[i]>=startPoint){
                            largeCount++;
                        }
                        if(citationsInt[i]<=startPoint){
                            smallCount++;
                        }

                        if(i == citationsInt.length-1){ //evaluate at final?
                            // startPoint<=largeCount
                            
                            if(startPoint <= largeCount && smallCount<=startPoint){ // 조건1 h 번이상 논문이 h개 이상 조건2 h번 이하 논문
                                answer = startPoint;
                                startPoint = -1;  // -1 을 해야 while 을 탈출합니다... 
                                break;
                            }else{
                                startPoint--;
                                largeCount = 0;
                                smallCount = 0;
                                continue;
                            }
                        }
                    }
                }
                
                

                
        
                return answer;
        
                
            }
        }

    
}
