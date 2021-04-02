package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WorkList {
    public static void main(String[] args) {
        
        //[93, 30, 55]	[1, 30, 5]
        int[] progressParam = {93,30,55};
        int[] speedParam = {1,30,5};

        solve(progressParam,	speedParam);
    }

  


    public static int[] solve(int[] progresses, int[] speeds) {

        class Work{
            int progress;
            int speed;
            Work(int progress, int speed){
                this.progress = progress;
                this.speed    = speed;
            }
    
            void dailyUpdate(){
                this.progress += this.speed;
            }
    
        }

        int[] answer = {};
        Queue<Work> workList = new LinkedList<Work>();
        List<Integer> done = new ArrayList<Integer>();
        int size = progresses.length;
        
        for(int i=0 ; i<size ; i++){
            workList.offer(new Work(progresses[i], speeds[i]));
        }
        while(workList.size()>0){
            if(workList.peek().progress<100){
                workList.stream().forEach(x->x.dailyUpdate());
            }else{
                int result = 0;
                while(workList.size()>0 &&workList.peek().progress>=100){
                    workList.poll();
                    result++;
                }
                done.add(result);
            }
        }
        answer = done.stream().mapToInt(i->i).toArray();
        // for(int a : answer){
        //     System.out.println(a);
        // }
            return answer;
    }

}


   

   

   
