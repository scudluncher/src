package Programmers;

import java.math.BigInteger;

public class fineSquare {
    
    
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        int gcdPrim = 0;
        BigInteger wBig = BigInteger.valueOf(w);
        BigInteger hBig = BigInteger.valueOf(h);
        BigInteger gcd = wBig.gcd(hBig);
        gcdPrim = gcd.intValue();
        
        if(w==1 || h == 1){
            answer = 0;
        }
        if(w==h){
            answer = (long)w*h-w;
        }else{
            answer = (long)w*h - gcdPrim * (w/gcdPrim+h/gcdPrim-1) ;
            //gcdPrim * (w/gcdPrim+h/gcdPrim-1) 이 부분이 핵심임. 못쓰는 사각형의 최소 단위    n + m -1  ==> 2 * 3 짜리 사각형에서 4개는 못씀  2+3-1
        }
        return answer;
    }
}
}
