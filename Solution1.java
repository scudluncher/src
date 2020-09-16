import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String,String> testArea = new HashMap<String,String>();
       
        
        outer:for (String a : phone_book){
            testArea.put(a,a);
            for(String target : phone_book){
                if(!a.equals(target)&&target.length()>a.length()){
                    if(testArea.containsKey(target.substring(0,a.length()))){
                        answer = false;
                        break outer;
                    }
                }
            }
                
        }
        
        
        
        return answer;
    }
}