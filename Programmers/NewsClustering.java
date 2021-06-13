import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class NewsClustering {
    public static void main(String[] args) {
        Solution.solution("abcccc", "cccdefff");

    }

    static class Solution {
        static public int solution(String str1, String str2) {
            int answer = 0;
            
            Map<String,Integer> group1 = elementProvider(str1);
            Map<String,Integer> group2 = elementProvider(str2);
        
            //union
            Set<String> unionSet = new HashSet<String>();
            unionSet.addAll(group1.keySet());
            unionSet.addAll(group2.keySet());
            Map<String,Integer> union = new HashMap<String,Integer>();
            for(String key : unionSet){
                union.put(key,Math.max(group1.getOrDefault(key,0), group2.getOrDefault(key,0)));
            }
            //intersection
            Set<String> interSet = group1.keySet();
            //주의: 이걸 하는 순간 group1 이 사이즈가 바뀝니다. keySet() 은 Map 과 backed 연결 되어있습니다.
            interSet.retainAll(group2.keySet());  
            Map<String,Integer> inter = new HashMap<String,Integer>();
            for(String key2: interSet){
                inter.put(key2,Math.min(group1.getOrDefault(key2,0), group2.getOrDefault(key2,0)));
            }

            // union 순환 size
            //inter 순환 size
            int unionSize = 0;
            int interSize = 0;
            for(String key:union.keySet()){
                unionSize += union.get(key);
            }
            for(String key:inter.keySet()){
                interSize += inter.get(key);
            }

            int a = 0;
            if(unionSize!=0){
               a = interSize *65536 / unionSize ;
            }else {
                a = 65536;
            }
               
            answer=a;
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
