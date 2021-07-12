public class PasswordGenerator {
    
    // 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    //  예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
    // 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    static class Solution {
        static public String solution(String s, int n) {
            String answer = "";
            char[] answerArray = s.toCharArray();
            int[] answerIntArray = new int[answerArray.length];
            for(int i = 0 ; i<answerArray.length ; i++){
                answerIntArray[i] = (int) answerArray[i];
            }

            for(int i =0; i<answerIntArray.length;i++){
                if(answerIntArray[i] == 32) {
                    continue;
                }
                if(answerIntArray[i] >=97 && answerIntArray[i] <=122){
                    answerIntArray[i] = answerIntArray[i] + n;
                    if(answerIntArray[i]>122){
                        answerIntArray[i] = answerIntArray[i] - 26;
                    }
                }
                if(answerIntArray[i] >=65 && answerIntArray[i] <=90){
                    answerIntArray[i] = answerIntArray[i] + n;
                    if(answerIntArray[i]>90){
                        answerIntArray[i] = answerIntArray[i] - 26;
                    }
                }
            }
            for(int i = 0; i<answerIntArray.length;i++){
                answerArray[i] = (char) answerIntArray[i];
            }

            answer = String.valueOf( answerArray);


            // 097~122 a~z
            //065~ 090 A~Z 
            // space 32 




            return answer;
        }
    }

}
