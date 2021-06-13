

public class MakeBigNumber {
    
    public static void main(String[] args) {
        Solution.solution("1924", 2);
    }

//loop1 0-3     3 = 7-4  4 is from remaining select, selected index 2, 2 is going to next loop
        //loop2 2-4     4 = 7-3  3 is from remaining select, selected index 4, 4 is going to next loop

static class Solution {
    public static String solution(String number, int k) {
        String answer = "";
        int[] asInteger = new int[number.length()];
        int index =0;
        int totalSelect = number.length() -k; 
        for(int j=0; j <number.length(); j++ ){
            asInteger[index] = Character.getNumericValue(number.charAt(index));
            index++;
        }

        StringBuilder sb = new StringBuilder();
         
        int targetIndex = 0;
        for(int i=0 ; i<number.length()-k;i++){  // number.length()-k 번 만큼의 순번을 돌린다.
            int max=0;
            for(int j=targetIndex; j<= number.length()-totalSelect; j++){
                if(asInteger[j]>max){
                    max = asInteger[j];
                    targetIndex = j+1;
                }
            }
            sb.append(max);
            totalSelect--;
            
        }
         
        answer = sb.toString();
        return answer;
    }
}
}
