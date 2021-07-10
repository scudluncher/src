
public class lottoMaxMin {
    

    
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        
        int zeroCounter = 0;
        int sameCounter = 0;
        for(int i=0; i<lottos.length;i++){
            if (lottos[i] == 0) {
                zeroCounter++;
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        sameCounter++;
                    }
                }
            }
        }
        
        //exceptional case
        
        if(zeroCounter == 6){
            answer[0] = 1;
            answer[1] = 6;
        }else if(zeroCounter == 0 && sameCounter==0){
            answer[0] = 6; 
            answer[1] = 6;
        }else{
            answer[0] = 7 - sameCounter - zeroCounter;
            answer[1] = 7 - sameCounter;
        }
        
        
     
        
        
        
        return answer;
    }
}
}
