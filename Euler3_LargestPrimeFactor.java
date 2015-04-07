import java.util.ArrayList;

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?
public class Euler3_LargestPrimeFactor {

	
	public static void main(String[] args) {
		System.out.println(target);
		  ArrayList<Integer> primeList = new ArrayList<Integer>();
		  primeList.add(2);
		  primeList.add(3);
		  primeList.add(5);
		  primeList.add(7);
		  getPrime(primeList);
		  
		  
		  double dividee=600851475143d;
		  
		  for (int k = primeList.size()-1; k>=0 ; k-- ){
			  if ( dividee%primeList.get(k)==0){
				  System.out.println("biggest prime factor is "+ primeList.get(k));
				  break;
			  }
		  }
		
	}
	
	static double target = Math.sqrt(600851475143d);
	
	
	public static ArrayList<Integer> getPrime(ArrayList<Integer> primeList) {
		//System.out.println("test");
		for (int i = 3; primeList.get(primeList.size()-1) <= target; i++) {
			int j = 6 * i - 1;
			int j_test = 1;
			for (int m = 0; m < primeList.size(); m++) {
				if (j % primeList.get(m) == 0) {
					j_test = j_test * 0;
					break;
				} else if (j % primeList.get(m) != 0) {
					j_test = j_test * 1;
					if (m == primeList.size() - 1) {
						primeList.add(j);
						System.out.println(primeList.size() + " "
								+ primeList.get(primeList.size() - 1));

					} else {
					}
				}

			}
			int k = 6 * i + 1;
			int k_test = 1;

				for (int n = 0; n < primeList.size(); n++) {
					if (k % primeList.get(n) == 0) {
						k_test = k_test * 0;
						break;
					} else if (k % primeList.get(n) != 0) {
						k_test = k_test * 1;
						if (n == primeList.size() - 1) {
							primeList.add(k);
							System.out.println(primeList.size() + " "
									+ primeList.get(primeList.size() - 1));
							// System.out.println(primeList.size());
						} else {
						}
					}

				}
			}
		

		return primeList;

	}
}
