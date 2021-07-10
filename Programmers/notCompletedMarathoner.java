
    import java.util.HashMap;

public class notCompletedMarathoner {
    

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String,Integer> resultBoard = new HashMap<String,Integer>();
            for(String tried : participant){
                if(resultBoard.containsKey(tried)){
                    resultBoard.put(tried,resultBoard.get(tried)+1);
                }else{
                    resultBoard.put(tried, 1);
                }
            }

       
            
            for(String finalPpl : completion){
                resultBoard.put(finalPpl, resultBoard.get(finalPpl)-1);
            }

            for(String resultval : resultBoard.keySet()){
                if(resultBoard.get(resultval) == 1){
                    answer = resultval;
                }
            }


            
          
            return answer;
            
            
            
        }
    }

}
