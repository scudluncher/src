package programmers;

import java.util.*;

public class noSameNumber {
    
    public static void main(String[] args) {
        
    }


    public class Solution {
        public int[] solution(int []arr) {
            int[] answer = {};
            
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            // System.out.println("Hello Java");
            Stack<Integer> arrStack = new Stack<Integer>();
            arrStack.push(arr[0]);
            for(int i = 1; i<arr.length;i++){
                
                    if(arrStack.peek()!=arr[i]){
                        arrStack.push(arr[i]);
                        // System.out.println(arr[i]);
                    }
                
            }
            answer = arrStack.stream().mapToInt(i->i).toArray();
                ////int[] array = list.stream().mapToInt(i->i).toArray();
            return answer;
        }
    }
}
