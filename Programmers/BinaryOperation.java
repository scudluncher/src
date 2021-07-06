public class BinaryOperation {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int[] solution(String s) {
            int[] initial = {0,0};
            //Integer.toBinaryString(int i)
       
            // char one = '1';

            //looping
            int[] answer = binaryOperation(s,initial);
            
            return answer;
        }

        public int[] binaryOperation(String s, int [] answer){

            if("1".equals(s)){
                return answer;
            }
            int counter = s.length();
            char[] asArray = s.toCharArray();
            int i = 0; //zero counter
            char zero= '0';
            for(char tester : asArray){
                if (tester==zero){
                    i++;
                }
            }
            answer[0]++;
            answer[1] = answer[1] + i;
            
            int removedLength = counter - i;
            s = Integer.toBinaryString(removedLength);


            return binaryOperation(s, answer);
            

        }
        

    }
}
