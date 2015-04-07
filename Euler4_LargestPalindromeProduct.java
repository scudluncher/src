//
//A palindromic number reads the same both ways.
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Euler4_LargestPalindromeProduct {
	static int maxtemp=0;
	public static void main(String[] args) {
		boolean functionResult;
		int product;
		String productString;
		
//		int maxtemp=0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				product = i * j;
				productString = Integer.toString(product);
			//	System.out.println(productString);
				functionResult=isPalindrome(productString);
				if(functionResult){
				System.out.println(i + " " +j );
				}
			}
		}
		System.out.println(maxtemp);
	}

	public static boolean isPalindrome(String productString) {
		char[] productChar = new char[6];
		int[] productDigit = new int [6];
		int[] temp = new int[6];
		boolean result=true;
		for (int k = 0; k < productString.length(); k++) {
			//System.out.println("여기 진입");
			productChar[k] = productString.charAt(k); // string 을 char 배열로 만들고
		//	System.out.println("???");
			productDigit[k] = (int) productChar[k] - 48; // char 배열에 담긴 값을 int
															// 배열에 넣고
		}

		for (int l = 0; l < productString.length(); l++) { // 배열을 거꾸로 넣음
			temp[l] = productDigit[productString.length()-1 - l];
			if (temp[l] == productDigit[l]) {
				result = true;
				continue;
			} else {
				result = false;
				return result;
			}
			
		}
		System.out.println(productString);
		if (Integer.parseInt(productString)>maxtemp){
			maxtemp=Integer.parseInt(productString);
		}
		else {}
		return result;

	}

}
