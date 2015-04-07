import java.util.ArrayList;


public class Euler10_SummationOfPrimes {

	
	public static void main(String[] args) {
		  ArrayList<Integer> primeList = new ArrayList<Integer>();
		  primeList.add(2);
		  primeList.add(3);
		  primeList.add(5);
		  primeList.add(7);
		  
		  getPrime(primeList);
		long sum=0;
		
		for(int i = 0 ; i<primeList.size()-1;i++){
			sum=sum+primeList.get(i);
		}
		
		System.out.println(sum);
		
		System.out.println(primeList.get(4));
	}
	
	 public static ArrayList<Integer> getPrime(ArrayList<Integer> primeList) {
		  System.out.println("test");
		  for (int i = 2; primeList.get(primeList.size()-1) <2000000; i++) {
		   int j = 6 * i - 1;
		   int j_test = 1;
		   if (primeList.get(primeList.size()-1) >2000000) break;
		   for (int m = 0; m < primeList.size(); m++) {
		    if (j % primeList.get(m) == 0)
		    {j_test = j_test*0;
		    	break;}
		    else if (j % primeList.get(m) != 0) {
		    	j_test=j_test*1;
		    	if (j_test==1&&m == primeList.size() - 1&& primeList.get(primeList.size()-1) <2000000) {
		      primeList.add(j);
		      System.out.println(primeList.size() +" "+ primeList.get(primeList.size() - 1));

		     } else
		     {}
		    }

		   }
		   int k = 6 * i + 1;
		   int k_test = 1;
		   if (primeList.get(primeList.size()-1) >2000000) break;
		   else {
		   for (int n = 0; n < primeList.size(); n++) {
		    if (k % primeList.get(n) == 0)
		    {
		    k_test = k_test*0;
		    break;}
		    else if (k % primeList.get(n) != 0) {
		    	k_test=k_test*1;
		     if (k_test==1 &&n == primeList.size() - 1 && primeList.get(primeList.size()-1) <2000000) {
		      primeList.add(k);
		      System.out.println(primeList.size()+" "+primeList.get(primeList.size() - 1));
		      //System.out.println(primeList.size());
		     } else
		     {}
		    }

		   }
		  }}

		  return primeList;

		 }
		}

//
//
//import java.util.ArrayList;
//import java.util.ArrayList;

////By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
////What is the 10 001st prime number?
//public class Euler7_10001stPrime {
//
//	public static void main(String[] args) {
//		int Prime_10001st;
//		ArrayList<Integer> primeList = getPrime();
//		Prime_10001st = (Integer) (primeList.get(10001).intValue());
//	}
//
//	public static ArrayList<Integer> getPrime() {
//		int firstPrime = 2;
//		int secondPrime = 3;
//
//		ArrayList<Integer> primeList = new ArrayList();
//		// ArrayList <Integer>primeCandidates =new ArrayList();
//
//		primeList.add(firstPrime);
//		primeList.add(secondPrime);
//		int k = 6;
//		while (primeList.size() == 10001) {
//
//			for (int i = 0; primeList.get(i) <= getLargestCandidate(k - 1); i++) {
//				if (k-1%primeList.get(i)==0)
//				{break;}
//				
//			}
//		}
//
//		return primeList;
//
//	}
//
//	// square root 값 씌운거보다 크면 연산 안해도 됨. 그 정수값 구하는 메소드
//	public static int getLargestCandidate(int a) {
//		int largest;
//		double di = (double) a;
//		largest = (int) Math.sqrt(di);
//
//		return largest;
//	}
//
//}
