public class TargetNumber {
    
    public static void main(String[] args) {
        int numbers[] ={1,1,1,1,1};
        int target = 3;
        System.out.println( Solution.solution(numbers, target));
       


    }


    static class Solution {
    
        static int answer;
    
        
        private static void dfs(int[]numbers, int sum, int target, int index){
            //종료조건 // dfs 
            if(numbers.length== index){
                if(sum == target){
                   answer++;
                   return;
                }//else return; // this return is key to finish.. ?
            }else{
                // sum += numbers[index++];
               
              
                dfs(numbers,sum + numbers[index],target,index +1);
                dfs(numbers,sum - numbers[index],target,index+1);

                
            }        
        }
        
        public static int solution(int[] numbers, int target) {
         
            
            dfs(numbers,0,target, 0);
            
    
            return answer;
        
     
        }
    }
}
