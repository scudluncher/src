
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// import Programmers.testTest.Solution;

public class testTest {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Solution.solution(test);
    }
   

    static class  Solution {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        
  
        class Student{
            Integer cnt = 0;
            int no;
            
            Student(int i){
                this.no = i;
            }
            public int getCnt() {
                return cnt;
            }
            
            public int getNo(){
                return no;
            }
            
            
    
        }


        List<Student> answerList = new ArrayList<Student>();
        int[] aSupo = {1,2,3,4,5};
        int[] bSupo = {2,1,2,3,2,4,2,5};
        int[] cSupo = {3,3,1,1,2,2,4,4,5,5};
        
        Student a = new Student(1);
        Student b = new Student(2);
        Student c = new Student(3);
        
        
        for(int i=0; i<answers.length ; i++){
            if(answers[i] == aSupo[i%aSupo.length]){  // mod 를 쓰는 것 까지는 금방 했는데..
                a.cnt++;
            }
            if(answers[i] == bSupo[i%bSupo.length]){
                b.cnt++;
            }
            if(answers[i] == cSupo[i%cSupo.length]){
                c.cnt++;
            }
        }
        

            answerList.add(a);

            answerList.add(b);
      
            answerList.add(c);
   
        
    
        answerList.sort(Comparator.comparing(Student::getCnt).reversed()); // 이것이 내 마음대로 작동하지 않았음.. 
        
        int bestScore = answerList.get(0).getCnt();
        
        answerList =answerList.stream().filter(i->i.getCnt()==bestScore).collect(Collectors.toList());
        answerList.sort(Comparator.comparing(Student::getNo));
        answer = answerList.stream().mapToInt(i->i.getNo()).toArray();
     
        
        return answer;
    
    }
    
    
   
    }
}

//12345
//21232425
//3311224455

