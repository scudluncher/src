import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RankStudent {
    

    class Solution {
        public int[] solution(int[] grade) {
            int[] answer = new int[grade.length];
            
    
            List<GradeIndex> indexList = new ArrayList<GradeIndex>();
            for(int i = 0 ;i< grade.length;i++){
               GradeIndex gi = new GradeIndex(i, grade[i]);
               indexList.add(gi);
            }
            
        
            
    
            Comparator<GradeIndex> indexComparator = new Comparator<GradeIndex>(){
                @Override
                public int compare(GradeIndex gi1, GradeIndex gi2){
                    return Integer.compare( gi1.getIndex(), gi2.getIndex());
                }
            };
            
            Comparator<GradeIndex> gradeComparator = new Comparator<GradeIndex>(){
                @Override
                public int compare(GradeIndex gi1, GradeIndex gi2){
                    return Integer.compare( gi1.getGrade(), gi2.getGrade());
                }
            };
            
            Collections.sort(indexList,gradeComparator);
    
            indexList.get(0).setResult(1);
            int rank=2;
            for(int i = 1 ; i<indexList.size() ; i++){
                GradeIndex previousStudent = indexList.get(i-1);
                GradeIndex currentStudent = indexList.get(i);
                if(previousStudent.getGrade() == currentStudent.getGrade()){
                    currentStudent.setResult( previousStudent.getResult());
                    rank++;
                }else{
                    currentStudent.setResult(rank);
                }
            } 
    
            Collections.sort(indexList, indexComparator);
    
            for(int i = 0 ; i<indexList.size() ; i++){
                    answer[i] = indexList.get(i).result;
                }
    
    
                return answer;
            }
    
        }
    
        class GradeIndex{
            int index;
            int grade;
            int result;
    
            public GradeIndex(int index, int grade){
                this.index = index;
                this.grade = grade;
            }
    
            public int getIndex() {
                return index;
            }
            public void setIndex(int index) {
                this.index = index;
            }
            public int getGrade() {
                return grade;
            }
            public void setGrade(int grade) {
                this.grade = grade;
            }
    
            public int getResult() {
                return result;
            }
    
            public void setResult(int result) {
                this.result = result;
            }
    
        }
    
}