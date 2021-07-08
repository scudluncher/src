public class Network {
    
    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            
            boolean[] isVisited = new boolean[computers.length]; // 객체.. call by reference. 

            for(int i = 0 ; i<computers.length ; i++){
                isVisited[i] = false;
            }
            
            for(int checkNode = 0 ; checkNode<computers.length; checkNode++){
                if(isVisited[checkNode]==false){ // key point 1
                    answer++; // key point 2     dfs 니까 끝까지 팝니다.최초 수행에서 끝까지 팠는데 안갔으면 answer 2 가 됩니다.. 
                    dfs(isVisited, computers, checkNode);
                }
                
            }
            
            
            return answer;
        }

        public void dfs(boolean[] isVisited, int[][] computers, int checkNode){
            isVisited[checkNode] = true;
            for(int i=0; i<computers.length;i++){
                if(!isVisited[i] && computers[checkNode][i] ==1){
                    // isVisited[i]=true;
                    dfs(isVisited,computers,i);
                }
            }

        }

    }



}
