public class KaKaoNewIdRecommendation {
    public static void main(String[] args) {
        

    }


    class Solution {
        public String solution(String new_id) {
            String answer = new_id;
            // 알파벳 소문자, 숫자, - _ .     //  ~!@#$%^&*()=+[{]}:?,<>/
            answer = answer.toLowerCase(); //1단계 대문자 'B'와 'T'가 소문자 'b'와 't'로 바뀌었습니다.
            answer = answer.replaceAll("[^.\\_\\-a-z0-9]+",""); //2단계  '!', '@', '#', '*' 문자가 제거되었습니다.
            while(!answer.contains("..")){ // 3단계 '...'와 '..' 가 '.'로 바뀌었습니다.
                answer = answer.replaceAll("..",".");
            }

            while(answer.indexOf(".")==0){ //4단계 아이디의 처음에 위치한 '.'가 제거되었습니다.
                answer = answer.substring(1, answer.length());
            }

            while(!answer.contains(" ")){
                answer = answer.replaceAll(" ","");
            }

            if(answer.length()>=16){
                answer = answer.substring(0, 16);
                if (answer.indexOf(".") == answer.length()-1){
                    answer = answer.substring(0,15);
                }
                return answer;
            }else if (answer.length()<=2){
                return answer = answer+answer.substring(1, 2);
                
            }else return answer;



            


            

            
        }
    }

}
