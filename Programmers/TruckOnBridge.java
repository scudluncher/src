
import java.util.LinkedList;
import java.util.Queue;

public class TruckOnBridge {
    


    public static void main(String[] args){

		int len = 2;
		int wgt = 10;
		int[] truck_weights = {7,4,5,6};
		solution(len,wgt,truck_weights);





    }


        public static int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;  // 몇초 걸리는지
            int sum = 0; //다리 위 무게 
			Queue<Integer> waitTrk = new LinkedList<Integer>();
            Queue<Integer> onBridge = new LinkedList<Integer>();
			Queue<Integer> done = new LinkedList<Integer>();
			
			//대기트럭 queue 초기화
			for(int trk:truck_weights){
				waitTrk.add(trk);
			}

			//전부 다 비면 끝난다. 
			while(done.size() < truck_weights.length){
				answer++;
				if(!waitTrk.isEmpty()){
					if(sum + waitTrk.peek() <= weight){ // 올라가있는 무게 + 올라갈 무게 <=제한중량
						int trk = waitTrk.poll(); // 트럭 꺼냄
						onBridge.offer(trk); // 다리위에 올려둠 
						sum += trk;
					
						System.out.println(answer);
					}else{
						onBridge.offer(0);
						System.out.println(answer);
					}
				}else{
					onBridge.offer(0);
					System.out.println(answer);
				}

				if(!onBridge.isEmpty()){
					if(onBridge.size()==bridge_length){
						int doneTrk = onBridge.poll();
						
						if(doneTrk!=0){
							done.offer(doneTrk);
							sum -= doneTrk;
						}
					}
				}
			}

			return answer+1;

			
            
        }




}