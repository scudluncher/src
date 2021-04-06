package programmers;

public class TriangleSnare {
    
    public static void main(String[] args) {
        
        solution(7);

    }
    static int value= 0;
    static int diagonalCycle= 0;
    static int horizontalCycle = 0;

    public static int[] solution(int n) {
        int[] answer = {};

        if (n==1){
            answer = new int[1];
            answer[0]=1;
            return answer;
        }
        int[][] matrix = new int[n][n];
        int limit = (1+n)*n/2;


        //vertical -> horizontal -> diagonal -> vertical -> horizontal -> diagonal ...
        verticalFill(0,0,n,matrix, limit);
        
        return answer;
    }


    public static void verticalFill(int columnIdx,int start, int end, int[][] matrixParam, int limit){
        for(int i=start ; i<end; i++){
            matrixParam[i][columnIdx] = ++value;
            if(value==limit){
                return;
            }
        }
        horizontalFill( end-1, //ok
                        start-horizontalCycle++,end,matrixParam,limit);  // row 3 = end -1 = 4-1  //   start 2 
    }

    public static void horizontalFill(int rowIdx, int start, int end, int[][] matrixParam, int limit){
        
        for(int i=start+1 ; i <end; i++){
            matrixParam[rowIdx][i] = ++value;
            if(value==limit){
                return;
            }
        }
        diagonalFill( end-2, diagonalCycle++, matrixParam,limit);
    }


    public static void diagonalFill(int start, int end, int[][] matrixParam, int limit){
        
        for(int i=start ; i >end; i--){
            matrixParam[i][i] = ++value;
            if(value==limit){
                return;
            }
            if(i==end+1){
            verticalFill(i,i+1,start+1,matrixParam,limit); //  n= 4  i = 1, start = 2, end = 
                                                            //   n =5 i = 1, start = 3 , end = 0  
            // verticalFill(i,   ,end-1,matrixParam,limit);
            }
        }


      //종료 체크
      


    }




}
