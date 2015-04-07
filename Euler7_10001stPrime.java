import java.util.ArrayList;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
public class Euler7_10001stPrime {

	public static void main(String[] args) {
		int Prime_10001st;
		ArrayList<Integer> primeList = getPrime();
		Prime_10001st = (Integer) (primeList.get(10001).intValue());
	}

	public static ArrayList<Integer> getPrime() {
		int firstPrime = 2;
		int secondPrime = 3;

		ArrayList<Integer> primeList = new ArrayList();
		// ArrayList <Integer>primeCandidates =new ArrayList();

		primeList.add(firstPrime);
		primeList.add(secondPrime);
		int k = 6;
		while (primeList.size() == 10001) {

			for (int i = 0; primeList.get(i) <= getLargestCandidate(k - 1); i++) {
				if (k-1%primeList.get(i)==0)
				{break;}
				
			}
		}

		return primeList;

	}

	// square root 값 씌운거보다 크면 연산 안해도 됨. 그 정수값 구하는 메소드
	public static int getLargestCandidate(int a) {
		int largest;
		double di = (double) a;
		largest = (int) Math.sqrt(di);

		return largest;
	}

}
