public class getCarpetWidthHeightByTile {



    class Solution {
        public int[] solution(int brown, int yellow) {
            
           
            // total = width * height; // width > height
            
            //wh = y+b
            //(w-2)(y-2) = y
            int[] answer = {};
            int wh = brown + yellow;
            // wh - 2w-2h + 4 = yellow;
            int wPlusH = (wh + 4 - yellow)/2;
            
            for(int divider = wPlusH-1; divider ==2 ; divider-- ){
                if(wh%divider==0 && (wh/divider + divider == wPlusH)){
                    answer[0]=divider;
                    answer[1]=wh/divider;
                    break;
                }
            }
            
            
            
            return answer;
        }
    }
}