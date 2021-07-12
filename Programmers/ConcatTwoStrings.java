import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcatTwoStrings {
    

    public static void main(String[] args) {
        
        // String a="bcd";
        // System.out.println(a.substring(1, 3));  //==> cd 

        //이렇게 쉬운걸 왜 못풀었을까.. 

        String a = "xyZA";
        String b = "ABCxy";
        // System.out.println(a.substring(0,2));
        // System.out.println(a.substring(0,2));
        // System.out.println(b.substring(3,5));
        String answer = Solution.solution(a,b);
        System.out.println(answer);
    }


    static class Solution{
        static public String solution(String a, String b){
            String answer = "";
            List<String> candidate = new ArrayList<>();
            int smallerSize = Math.min(a.length(),b.length());

            for(int i=0; i<=smallerSize;i++){
                if(a.substring(0, i).equals(b.substring(b.length()-i, b.length()))){
                    String target = b + a.substring(i);
                    candidate.add(target);
                }
                if(b.substring(0, i).equals(a.substring(a.length()-i, a.length()))){
                    String target = a + b.substring(i);
                    candidate.add(target);
                }
            }

            Collections.sort(candidate);
            answer = candidate.get(0);

            return answer;


        }
    }
}
