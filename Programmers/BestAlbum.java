import java.util.HashMap;

public class BestAlbum {
    //todo     완성하세요.
    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            int[] answer = {};


            HashMap<String, Integer> genreCoutner = new HashMap<String,Integer>();
            

            for(int i = 0 ; i<genres.length;i++){  //genres.length = plays.length
                genreCoutner.put(genres[i], genreCoutner.getOrDefault(genres[i], 0) +plays[i]);
            }
            // genreCoutner.values()

            return answer;
        }
    }


}
