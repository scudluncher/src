//
//The sum of the squares of the first ten natural numbers is,
//
//12 + 22 + ... + 102 = 385
//The square of the sum of the first ten natural numbers is,
//
//(1 + 2 + ... + 10)2 = 552 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.



public class Euler6_SumSquareDifference {

	
	public static void main(String[] args) {
		System.out.println(sumSquare(10));
		System.out.println(squareSum(10));
		System.out.println(squareSum(100)-sumSquare(100));
	}
	
	
	public static int sumSquare(int a){    //1^2+2^2+3^2
		int sumSquare=0;
		for (int i=1; i<=a;i++){
			sumSquare=sumSquare+i*i;
		}
		return sumSquare;
	}
	
	
	
	
	
	public static int squareSum(int a){  // (1+2+3+ ...)^2
		int squareSum=0;
		for  (int i=1; i<=a;i++){
			squareSum=squareSum+i;
		}
		return squareSum*squareSum;
	
	}
	
	
	
	
}




//효율적인 방법 해설 : f(n) = ? 인지 4차 방정식 세우고,
//f(0), f(1), f(2) ,f(3) 값을 알고 있으므로 이를 대입하여 인자를 구하고
// f((n+1)) = f(n)+(n+1)^2 인지 확인하면 귀납적으로 f(n) 을 확인가능하고, 이 공식 이용
// 그냥 sum^2 구하는 것은 g(n) = (n+1)*n/2 으로 구함.
