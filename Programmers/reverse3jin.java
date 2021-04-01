import java.util.*;

public class reverse3jin {

//자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
//https://programmers.co.kr/learn/courses/30/lessons/68935
    public static void main(String[] args) {

                int n= 45;
                int answer = 0;
                String samjinValReverse = "";
                while(n>0){
                  samjinValReverse = samjinValReverse + n%3;
                    System.out.println(samjinValReverse);
                  n =   n / 3 ;
                
                    
                }
                
                answer = Integer.parseInt(samjinValReverse,3);
                System.out.println(answer);
                
                

    }
   

    

}
