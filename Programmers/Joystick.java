package Programmers;

public class Joystick {
 
    
    class Solution {
        public int solution(String name) {
            int answer = 0;

            int[] charCounter = new int[name.length()];
            int i = 0;
            char A = 'A';
            for(char c : name.toCharArray()){
                if(c-A > 13){
                    charCounter[i++] = c-A;
                }else{
                    charCounter[i++] = 26 - (c-A);
                }
            }


            int[] moveCounter = new int[name.length()]; // 이것이 문제로다... 



            return answer;
        }
    }
}
