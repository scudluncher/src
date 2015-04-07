//a^2 + b^2 = c^2
// a + b + c = 1000
public class Euler9_specialPythagoreantriplet {

	public static void main(String[] args) {

		for (int i = 1; i <= 998; i++) {
			for (int j = 998; j >= 1; j--) {
				int k = 1000 - i - j;
				if (i * i + j * j == k * k) {
					System.out.println(i * j * k);
				}
			}

		}

	}

}
