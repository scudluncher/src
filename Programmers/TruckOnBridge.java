

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class TruckOnBridge {
    


    public static void main(String[] args){


    }


    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;  // 몇초 걸리는지
            int sum = 0; //다리 위 무게 
			Queue<Integer> waitTrk = new LinkedList<Integer>();
            Queue<Integer> onBridge = new LinkedList<Integer>();
			
			for(int trk:truck_weights){
				waitTrk.add(trk);
			}


			for(int trk : waitTrk){
				if(onBridge.isEmpty()){
					onBridge.add(trk);
					sum += trk;
					answer++;
;
				}else if(trk+sum <= weight){
					onBridge.add(trk);
					sum += trk;
					answer++;
				}else{
					answer++;
				}
			}


			for(int trk : truck_weights){
			
			}
			

			
            
            return answer;
        }




    }
}