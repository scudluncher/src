public class PairRemoval {
    
    class Solution {
        public int solution(String s)
        {
            // int answer = -1;
            
            int sum=0;
            //수행 할 수 있는가?
            // cdcd?    cdcd --> c cdcd d
            int multiplier = 1; 
            if(s.length()%2!=0){
                return 0;
            }else{
                for(char c : s.toCharArray()){
                    sum = sum + c * multiplier;
                    multiplier = multiplier * -1;
                }
                if (sum == 0){
                    return 1;
                }else return 0;
                
            }
            
        // 141~172
//stack 으로 푸는 사람이 많았음.
// cdcd = 3 -4+3-4    
// baabaa = 2-1+1-2+1-1 
            // return answer;
        }
    }
}
