import java.util.ArrayList;

public class Euler49_PrimePermutations {

	public static void main(String[] args) {

		System.out.println("heello");
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		primeList.add(7);
		System.out.println(primeList.get(0));
		System.out.println(primeList.get(1));
		System.out.println(primeList.get(2));
		System.out.println(primeList.get(3));
		System.out.println("testsss");

		getPrime(primeList);
		System.out.println("last one is");
		System.out.println(primeList.get(primeList.size() - 1));
		// System.out.println(primeList.get(999));

		ArrayList<Integer> primeList4Digit = new ArrayList<Integer>();   //4자리수 소수를 모두 구함.
		

		for (int i = 0; i < primeList.size(); i++) {
			if (primeList.get(i) > 1000 && primeList.get(i) < 10000) {
				primeList4Digit.add(primeList.get(i));
				System.out.println(primeList4Digit.get(primeList4Digit.size()-1));
			}
			else
			{}
			

		}
		System.out.println(primeList4Digit.size());
		System.out.println(9%10);

	}

	public static ArrayList<Integer> getPrime(ArrayList<Integer> primeList) {
		System.out.println("test");
		for (int i = 3; primeList.size() < 2000; i++) {
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
			if (primeList.size() == 2000)
				break;
			else {
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
		}

		return primeList;

	}
}