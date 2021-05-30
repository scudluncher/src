package Programmers;

import java.util.HashMap;

public class disguiseSpy {
    //https://programmers.co.kr/learn/courses/30/lessons/42578
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> closet = new HashMap<String,Integer>();
        for(String[] item : clothes){
           closet.put(item[1], closet.getOrDefault(item[1], 0)+1 );
        }
        if(closet.keySet().size()>1){ // 조합을 고려 
            int combination = 1;
            for(String key : closet.keySet()){
                combination *= closet.get(key)+1;
            }
            combination = combination -1; // 아무것도 고르지 않는 경우는 제외한다.
            answer += combination;
        }else{//조합 미고려
            answer += clothes.length; // 기본 가짓수
        }
       
        return answer;

    }

}

// [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]

// [["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]