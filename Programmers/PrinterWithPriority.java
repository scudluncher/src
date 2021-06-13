import java.util.LinkedList;
import java.util.Queue;

public class PrinterWithPriority {
                // 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
            // 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
            // 3. 그렇지 않으면 J를 인쇄합니다.

            // 현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 
            //내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때, 
            //내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.


            // 현재 대기목록에는 1개 이상 100개 이하의 문서가 있습니다.
            // 인쇄 작업의 중요도는 1~9로 표현하며 숫자가 클수록 중요하다는 뜻입니다.
            // location은 0 이상 (현재 대기목록에 있는 작업 수 - 1) 이하의 값을 가지며 대기목록의 가장 앞에 있으면 0, 두 번째에 있으면 1로 표현합니다.        

        

    public static void main(String[] args) {
        

    }

    class PrintJob {
        int initialPosition;
        int priority;
        int finalPosition;

        PrintJob(int initialPosition, int priority){
            this.initialPosition = initialPosition;
            this.priority = priority;
            
        }


    }
 
    

    class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            Queue<PrintJob> waitingLine = new LinkedList<PrintJob>(); // Queue 의 구현은 LinkedList 로..
            Queue<PrintJob> redefinedLine = new LinkedList<PrintJob>();

            int i=0;
            for(int job : priorities){
                waitingLine.add(new PrintJob(i++, job));
            }
            //반복문 필요함 여기에.. redefinedLine 의 길이가 priorities 길이와 같아질때 종료시키자. 
            int finalPositionIndex=0;
            while(true){
                
                int maxValue = waitingLine.stream().map(x->x.priority).max(Integer::compare).get();
                PrintJob checker = waitingLine.poll(); // 제일 선두를 뽑아요.
                if(checker.priority == maxValue){ // 현재 waiting Line 의 max priority 와 동일하면, redefined 로 이동
                    checker.finalPosition = finalPositionIndex++;
                    redefinedLine.add(checker);
                    if(redefinedLine.size() == priorities.length){
                        break; // 탈출조건
                    }
                }else{ // 가장 뒤로 보냅니다.
                    waitingLine.add(checker);
                }
            }
            
            PrintJob answerJob = redefinedLine.stream().filter(x-> x.initialPosition == location).findFirst().get();
            answer = answerJob.finalPosition+1;


            return answer;
        }
    }
}
