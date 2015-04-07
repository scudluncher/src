

public class escargo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException {
	
		// TODO Auto-generated method stub		
		
	      int num,n,i,j,k;
	      
	        
	       num = 10; //한 변의 길이
	        
	        int matrix[][]= new int[num][num]; //정사각형 배열 생성
	        
	        int data =1; //시작 값
	        j=0; //열 초기화
	        
	                
	        for(n=num; n>0;n-=2){//한바퀴가 2줄을 소모하기 때문에 2번 씩 줄여 나간다.
	            for(i=0;i<n;i++){ //좌 -> 우
	                matrix[j][j+i]=data;
	                data++;	                        
	            }
	            for(k=1;k<n;k++){ //위 -> 아래
	            	//하나가 차있는 상태이므로 1부터 시작
	                matrix[j+k][num-j-1]=data;
	                data++;
	            }
	            for(i=1;i<n;i++){ //우 -> 좌
	            	//하나가 차 있는 상태이므로 1부터 시작
	                matrix[j+k-1][num-1-j-i]=data;
	                data++;
	            }
	            for(k=1;k<n-1;k++){ // 아래 -> 위
	            	//두개 가 차 있기에 1부터 시작 n-1까지
	                matrix[num-1-j-k][j]=data;
	                data++;
	            }	                    
	                
	            j++; //한바퀴 추가
	        }
	        
	        
	        
	        for(i=0;i<num;i++){
	            for(j=0;j<num;j++){
	                System.out.printf("%5s",matrix[i][j]);
	                //끝으로 정렬을.. 어떻게 하지...성공 여기서도 printf가 있군....
	            }
	            System.out.println("");
	        }//출력
	    }
	
	}


