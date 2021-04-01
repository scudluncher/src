
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

			//while 문 조심.. done.size() 가 truck_weight.length 와 동일해질 때 끝내므로 < 로 처리하고 ,마지막에 한번 더해서 동일해지면 종료
			while(done.size() < truck_weights.length){
				answer++;
				//대기 트럭을 다리위에 올린다.
				if(!waitTrk.isEmpty()){
					if(sum + waitTrk.peek() <= weight){ // 올라가있는 무게 + 올라갈 무게 <=제한중량
						int trk = waitTrk.poll(); // 트럭 꺼냄
						onBridge.offer(trk); // 다리위에 올려둠 
						sum += trk;
					
					}else{//무게때문에 실을 수 없음 0 올림
						onBridge.offer(0);
					}
				}else{ // 실을 트럭이 없음,  0 올림
					onBridge.offer(0);
				}

				//다리위 트럭 중 다 옮긴 것 뺀다. 
				if(!onBridge.isEmpty()){
					if(onBridge.size()==bridge_length){ // 다리 길이와 다리 위에 있는 차 길이가 동일하면, 다 온것임.
						int doneTrk = onBridge.poll();
						
						if(doneTrk!=0){ // 0이 아닐 경우에만 sum 반영하고, 완료 queue 에 넣어줌 
							done.offer(doneTrk); // while 종료 triggering
							sum -= doneTrk;
						}
					}
				}
			}

			return answer+1;

			
            
        }




}