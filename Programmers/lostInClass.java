public class lostInClass {
    
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n;
            
            int [] students = new int[n];
            
            for(int i = 0 ; i<students.length ; i++){
                students[i] = 1;
            }
            
            for(int lostStudent : lost){
                students[lostStudent-1] += -1;
            }
            
            for(int reserveStudent : reserve){
                students[reserveStudent-1] += 1;
            }
           
            
            if(students[0]==2){
                if(students[1]==0){
                    students[1] = 1;
                    students[0] = 1;
                }
            }else if(students[0] == 0){
                if(students[1] == 2 ){
                    students[0] = 1;
                    students[1] = 1;
                }
            }
            
            for(int x=1; x<students.length-1 ;x++){
                if(students[x]==2){
                    if(students[x-1]==0){
                        students[x] = 1;
                        students[x-1] = 1;    
                    }else if(students[x+1] ==0){
                        students[x] = 1;
                        students[x+1] = 1;    
                    }
                    
                }else continue;
            } 
            if(students[students.length-1] == 2){
                if(students[students.length-2] == 0){
                    students[students.length-1] = 1;
                    students[students.length-2] = 1;
                }
            }
            
            for(int y=0;y<students.length;y++){
               if(students[y]==0){
                   answer--; 
                 } 
            }
            
            
            
            
            return answer;
        }
    }
}
