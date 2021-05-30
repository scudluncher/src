package Programmers;

public class fineSquare {
    
    
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        
        if(w==1 || h == 1){
            answer = 0;
        }
        if(w==h){
            answer = w*h-w;
        }else{
            answer = w*h - (Math.max(w,h) / Math.min(w,h)) * Math.max(w,h);
        }
        return answer;
    }
}
}
