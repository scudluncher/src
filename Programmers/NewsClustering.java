import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class NewsClustering {
    public static void main(String[] args) {
        Solution.solution("FRANCE", "FRENCH");

    }



    static class Solution {
        static public int solution(String str1, String str2) {
            int answer = 0;
            
            Map<String,Integer> group1 = elementProvider(str1);
            Map<String,Integer> group2 = elementProvider(str2);
        
            group1.keySet();
            group2.keySet();
            Set<String> unionSet = new HashSet<String>();
            Set<String> interSet = group1.keySet();

            unionSet.addAll(group1.keySet());
            unionSet.addAll(group1.keySet());
            interSet.retainAll(group2.keySet());
            
            Map<String,Integer> union = new HashMap<String,Integer>();
            Map<String,Integer> inter = new HashMap<String,Integer>();
            for(String key : unionSet){
                union.put(key,Math.max(group1.getOrDefault(key,0), group2.getOrDefault(key,0)));
            }
            for(String key2: interSet){
                inter.put(key2,Math.min(group1.getOrDefault(key2,0), group2.getOrDefault(key2,0)));
            }

            // union 순환 size
            //inter 순환 size
            int unionSize = 0;
            int interSize = 0;
            // union.keySet().stream().reduce(0, x->union.get(x) ,Integer::sum);
            for(String key:union.keySet()){
                unionSize += union.get(key);
            }
            for(String key:inter.keySet()){
                interSize += inter.get(key);
            }

            BigDecimal a = null;
            if(unionSize!=0){
               a = BigDecimal.valueOf(interSize).divide(BigDecimal.valueOf(unionSize));
            }else {
                a = BigDecimal.ONE;
            }
               
            answer = a.multiply(BigDecimal.valueOf(65536)).intValue();
                
            //  자카드 유사도는 원소의 중복을 허용하는 다중집합에 대해서 확장할 수 있다.
            //  다중집합 A는 원소 "1"을 3개 가지고 있고, 다중집합 B는 원소 "1"을 5개 가지고 있다고 하자.
            //  이 다중집합의 교집합 A ∩ B는 원소 "1"을 min(3, 5)인 3개, 합집합 A ∪ B는 원소 "1"을 max(3, 5)인 5개 가지게 된다. 
            // 다중집합 A = {1, 1, 2, 2, 3}, 다중집합 B = {1, 2, 2, 4, 5}라고 하면, 
            // 교집합 A ∩ B = {1, 2, 2}, 합집합 A ∪ B = {1, 1, 2, 2, 3, 4, 5}가 되므로, 
            // 자카드 유사도 J(A, B) = 3/7, 약 0.42가 된다.

            // BigDecimal a = null;
            // if(unionGroup.size()!=0){
            //      a = BigDecimal.valueOf(group1.size()).divide( BigDecimal.valueOf( unionGroup.size()));
            //     a=a.multiply(BigDecimal.valueOf(65536));
            // }else return 0;
           
            // answer = a.intValue();
            
           
            
            return answer;
        }
        
         static private Map<String,Integer> elementProvider(String target){
            int i;
            Map<String,Integer> elementList = new HashMap<String,Integer> ();
            for(i=0 ; i<target.length()-1; i++){
                StringBuilder sb = new StringBuilder();
                sb.append( Character.toUpperCase(target.charAt(i)));
                sb.append( Character.toUpperCase(target.charAt(i+1)));
                String candidate = sb.toString();
                if(Pattern.matches ("^[a-zA-Z]*$", candidate)){
                    elementList.put(candidate, elementList.getOrDefault(candidate, 0)+1);
                }
            }
             return elementList;
        }
    }

}
