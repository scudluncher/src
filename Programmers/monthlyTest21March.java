import java.util.HashSet;
import java.util.Set;


//https://programmers.co.kr/learn/courses/30/lessons/68644?language=java

public class monthlyTest21March {

    public int[] solution(int[] numbers) {
     
        int[] pareNumbers = numbers;
        int[] answer = {};
        Set<Integer> answerSet = new HashSet<Integer>();  // TreeSet 으로 하면 아래쪽에서 Collections.sort 필요없음 
        for(int i = 0 ; i<numbers.length-1 ; i++){
            for (int j = i+1 ; j<pareNumbers.length; j++){
                    int tempResult = numbers[i] + pareNumbers[j];
                    answerSet.add(Integer.valueOf(tempResult));
                
            }
        }
        // Arrays.sort(answerSet);
        int length = answerSet.size();
        answer = new int[length];
        List<Integer> answerList = new ArrayList<Integer>(answerSet);//answerSet.stream().collect(Collectors.toList());
        // Arrays.sort(answerList);
        Collections.sort(answerList);
        for(int i = 0; i <length ; i++){
            answer[i] = answerList.get(i);
        }
        return answer;

    }

    

}