
public class Euler1_MultipleOf3And5 {


	
	public static void main(String[] args) {
		System.out.println(getsum(3));
		System.out.println(getsum(5));
		System.out.println(getsum(3)+getsum(5)-getsum(15));
		
	}
	
	
	
	public static int getsum(int a){
		int sum=0;
		for (int i=1;a*i<1000;i++){
			sum=sum+a*i;
			
		}
		return sum;
		
	}
	
	
	
}