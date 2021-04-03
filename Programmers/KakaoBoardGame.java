package Programmers;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class KakaoBoardGame {
    
    public static void main(String[] args) {
        
        int [][]board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        //{{0,0,0,0,0],
        // {0,0,1,0,3],
        // {0,2,5,0,1],
        // {4,2,4,4,2],
        // {3,5,1,3,1]]
        int[] moves ={1,5,3,5,1,2,1,4}; //{1,5,3,5,1,2,1,4]
        Solution.solution(board, moves);



    }

    static class  Solution {
        static  public int solution(int[][] board, int[] moves) {
                int answer = 0;
                
                List<Stack<Integer>> gameBoard = new ArrayList<Stack<Integer>>();
                
                for(int i=0;i<board.length;i++){
                    gameBoard.add(new Stack<Integer>());
                }
               
                String a="AAA";
                a.length();
                StringBuffer b = new StringBuffer();
                b.append("*");
                // b =  "*" * length() + answer.substring(length-4);
                // b.to
                

                Stack<Integer> resultBin = new Stack<Integer>();
                // [1,5,3,5,1,2,1,4]	
                
                for(int i = board.length-1; 0<=i  ; i--){
                    for (int j = 0 ; j<board[i].length; j++){
                        if(board[i][j]!=0){
                            gameBoard.get(j).push(board[i][j]);
                        }
                       
                    }
                }


                for(int k =0 ; k<moves.length ; k++){
                    int index = moves[k]-1;
                    if(gameBoard.get(index).size()>0){
                        int boardPop = gameBoard.get(index).pop();
                        System.out.println("board value :" + boardPop);
                        if(resultBin.empty()){
                            resultBin.push(boardPop);
                            // System.out.println("1:::" + index);
                        }else{
                            int peekVal = resultBin.peek();
                            System.err.println("peek Val" + peekVal);
                            if(resultBin.peek().compareTo(boardPop) == 0 ){  // resultBin 제일 위의 값과, 뽑아다 넣는 값이 같을 경우 result++ 하고 끝냄, 쌓을 필요 없음. 
                                resultBin.pop();
                                answer= answer+2;
                                // System.out.println("2:::" + index);
                            }else{
                                resultBin.push(boardPop);
                                // System.out.println("3:::"+index);
                            }
                        }
                        
                       
                        
                    }else continue;
                }
                System.out.println(answer);
                
                return answer;
            }
        }
}
