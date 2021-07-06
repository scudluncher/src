import java.util.Arrays;


// public class MakeBigNumber {
//     ///fail
//     public static void main(String[] args) {
//         Solution.solution("1231234",3);

//     }

//     static class Solution {
//         public static String solution(String number, int k) {
//             String answer = "";
//             int[] asInteger = new int[number.length()];
//             int index =0;
//             int toSelect=number.length()-k;
//             for(int j=0; j <number.length(); j++ ){
                
//                 asInteger[index] = Character.getNumericValue(number.charAt(index));
//                 index++;
//             }
            
    
//             int[] answerArray = new int[number.length()-k];
//             int answerArrayIndex=0;
//             int selectedCounter=0;
            
//             while(true){
//                 int searchLength = asInteger.length - toSelect+selectedCounter;
//                 int firstValueIndex = 0 ;
//                 for(int i = 0; i<=searchLength ; i++){
//                     if(asInteger[i] > asInteger[firstValueIndex]){
//                         firstValueIndex = i;
//                         selectedCounter++;
//                     };
//                 }
//                 answerArray[answerArrayIndex++] = asInteger[firstValueIndex];
                
//                 // int [] newArray = new int[asInteger.length - firstValueIndex];
//                 // newArray =  Arrays.copyOfRange(asInteger, firstValueIndex+1,asInteger.length);
//                 // asInteger = newArray;

//                 if(answerArrayIndex == number.length()-k){
//                     break;
//                 }
       
//             }


//             // 최초 시작점은 정해졌음.


        

//            System.out.println(answerArray[0]);
            
            
            
            
    
            
            
//             return answer;
//         }
//     }

// =======


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
>>>>>>> 9fb3bc463e4a0bb58d2eb69c6e7bc193826b46c9
}
