

public class TriangleSnare {
    
    public static void main(String[] args) {
        
        solution(10);

    }
    static int value= 0;
    static int diagonalCycle= 0;
    static int horizontalCycle = 0;

    public static int[] solution(int n) {
        int[] answer = {};
        int limit = (1+n)*n/2;
        if (n==1){
            answer = new int[1];
            answer[0]=1;
            return answer;
        }else{
            answer = new int[limit];
        }
        int[][] matrix = new int[n][n];
       

        //vertical -> horizontal -> diagonal -> vertical -> horizontal -> diagonal ...
        verticalFill(0,0,matrix, limit);
        int idx = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0 ; j< matrix[i].length;j++){
                if(matrix[i][j]!=0){
                    answer[idx++] =matrix[i][j];
                }
            }
        }

        for(int k : answer){
            System.out.println(k);
        }

        return answer;
    }


    public static void verticalFill(int startX, int startY , int[][] matrixParam, int limit){
        while( startX<matrixParam.length && startY<matrixParam.length && matrixParam[startX][startY]==0 ){
            matrixParam[startX++][startY] = ++value;
            if(value==limit){
                return;
            }
        }
        horizontalFill( startX-1 , startY ,matrixParam,limit);  // row 3 = end -1 = 4-1  //   start 2 
       
    }

    public static void horizontalFill(int startX, int startY, int[][] matrixParam, int limit){
        while(startY+1<matrixParam.length &&matrixParam[startX][startY+1]==0 ){
            matrixParam[startX][1+ startY++] = ++value;
            if(value==limit){
                return;
            }
        }
        diagonalFill( startX-1, startY-1, matrixParam,limit);
    }

    public static void diagonalFill(int startX, int startY, int[][] matrixParam, int limit){
        while(startX<matrixParam.length && startY<matrixParam.length && matrixParam[startX][startY]==0){
            matrixParam[startX--][startY--] = ++value;
            if(value==limit){
                return;
            }
        }
        verticalFill(startX+2,startY+1,matrixParam,limit); 


      //종료 체크
      


    }




}
