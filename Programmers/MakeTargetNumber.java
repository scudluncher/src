public class MakeTargetNumber {
    
public static void main(String[] args) {
    int [] numbers ={1,1,1,1,1};
    int target = 3;
    Solution.solution(numbers, target);
}

    static class Solution {
    
        static int answer = 0;

    

    public static int solution(int[] numbers, int target) {
       
       
        dfs(target, numbers[0], 0, 0,numbers);
        dfs(target, -numbers[0], 0, 0,numbers);
    
        return answer;
        
        
    }
    
    public static void dfs(int target, int value, int sum, int index, int[] numbers){
     
        sum = sum + value;
        
        if(index == numbers.length-1){
			if(target == sum){
         	    answer++;
           		return;
          }else {
           		return;  
          }
        }
        index = index + 1;
        dfs(target,numbers[index] , sum, index,numbers );
        dfs(target,-numbers[index] , sum, index ,numbers);


    }

    }
}
