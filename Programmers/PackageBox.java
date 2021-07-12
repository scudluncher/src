public class PackageBox {
    

    //택배 박스, 3개들이 5개 들이로 n 개의 상품 보내기
    //다 채워서 보내야 함
    //7개의 경우 보낼 수 없음 --> return -1
// 이렇게 쉬운걸 풀지도 못하다니.. ^_^... 나가죽자
    public static void main(String[] args) {
        int answer = Solution.solution(121);
        System.out.println(answer);

    }
    static class Solution {
        static public int solution(int n) {
            // int answer = 0;
            int threeBoxCounter=0;
            while(true){

                if(n%5==0){
                    return n/5 + threeBoxCounter;
                }else{
                    n = n-3;
                    threeBoxCounter++;
                    if(n<5){
                        return -1;
                    }
                }


            }
     

        
           
        }


     
    }

}
