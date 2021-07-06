import java.util.*;


public class Keypad {
    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        Solution.solution(numbers, "left");
    }

    static class Solution {
        public static String solution(int[] numbers, String hand) {
            String answer = "";
            
            StringBuilder sb = new StringBuilder();
            
            int[] lastLeft = {3,0};
            int[] lastRight=   {3,2};
            int[] temp =   {0,0};
            int differenceLeft = 0;
            int differenceRight = 0;
            for(int i=0 ; i<numbers.length; i++){
                if(numbers[i] == 1 ||numbers[i] == 4 || numbers[i] == 7){
                    sb.append("L");
                    lastLeft[0] = (numbers[i]-1)/3; 
                    lastLeft[1] = 0;
                }else if (numbers[i] == 3 ||numbers[i] == 6 || numbers[i] == 9){
                    sb.append("R");
                    lastRight[0] = (numbers[i]-3)/3;
                    lastRight[1] = 2;
                    
                }else{
                    if(numbers[i] ==0){
                        temp[0] = 3;
                        temp[1] = 1;
                    }else{
                        temp[0]= (numbers[i]-2) /3 ;
                        temp[1] = 1;
                    }
                    
                    differenceLeft = Math.abs(lastLeft[0]-temp[0]) + Math.abs(lastLeft[1]-temp[1]);
                    differenceRight= Math.abs(lastRight[0]-temp[0]) +Math.abs(lastRight[1]-temp[1]);
                    if(differenceLeft == differenceRight){
                        if(hand.equals("left")){
                            sb.append("L");
                            lastLeft[0] = temp[0]; 
                            lastLeft[1] = temp[1];
                        }else{
                            sb.append("R");
                            lastRight[0] = temp[0];
                            lastRight[1] = temp[1];
                        }
                    }else if(differenceLeft<differenceRight){
                        sb.append("L");
                          lastLeft[0] = temp[0];
                          lastLeft[1] = temp[1];
                    }else{
                        sb.append("R");
                         lastRight[0] = temp[0];
                        lastRight[1] = temp[1];
                    }
                    
                    
                }
            }
            answer= sb.toString();
            
            return answer;
        }
    }
}