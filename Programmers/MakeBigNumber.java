import java.util.Arrays;


public class MakeBigNumber {
    ///fail
    public static void main(String[] args) {
        Solution.solution("1231234",3);

    }

    static class Solution {
        public static String solution(String number, int k) {
            String answer = "";
            int[] asInteger = new int[number.length()];
            int index =0;
            int toSelect=number.length()-k;
            for(int j=0; j <number.length(); j++ ){
                
                asInteger[index] = Character.getNumericValue(number.charAt(index));
                index++;
            }
            
    
            int[] answerArray = new int[number.length()-k];
            int answerArrayIndex=0;
            int selectedCounter=0;
            
            while(true){
                int searchLength = asInteger.length - toSelect+selectedCounter;
                int firstValueIndex = 0 ;
                for(int i = 0; i<=searchLength ; i++){
                    if(asInteger[i] > asInteger[firstValueIndex]){
                        firstValueIndex = i;
                        selectedCounter++;
                    };
                }
                answerArray[answerArrayIndex++] = asInteger[firstValueIndex];
                
                // int [] newArray = new int[asInteger.length - firstValueIndex];
                // newArray =  Arrays.copyOfRange(asInteger, firstValueIndex+1,asInteger.length);
                // asInteger = newArray;

                if(answerArrayIndex == number.length()-k){
                    break;
                }
       
            }


            // 최초 시작점은 정해졌음.


        

           System.out.println(answerArray[0]);
            
            
            
            
    
            
            
            return answer;
        }
    }

}
