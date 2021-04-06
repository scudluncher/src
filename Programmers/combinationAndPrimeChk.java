
public class combinationAndPrimeChk {
    



    class Solution {
        public int solution(String numbers) {
            int answer = 0;
            
            char[] numChars = numbers.toCharArray();
            int[] intArrays = new int[numChars.length];
            for(int i=0;i< numChars.length;i++){
                intArrays[i] =Character.getNumericValue( numChars[i]);
            }

            


            return answer;
            
            
            
        }
    }
}
