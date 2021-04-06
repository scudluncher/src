import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class stringOrder {
    


    public static void main(String[] args) {
        


    }



    class Solution {
        public String solution(String s) {
            String answer = "";
            
            List<Character> charList = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            charList.sort(Comparator.reverseOrder());
            
            StringBuilder a = new StringBuilder();
            for(Character chr:charList){
                a.append(chr);
            }
            answer = a.toString();
            return answer;
        }
    }

    // public int compare(Character c1, Character c2)
    // {
    //     // ignoring case
    //     return Character.compare(Character.toLowerCase(c1),
    //                             Character.toLowerCase(c2));
    // }

}
