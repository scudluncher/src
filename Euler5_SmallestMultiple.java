//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Euler5_SmallestMultiple {

	public static void main(String[] args) {

		System.out.println(getSmallestMultiple());
		System.out.println(Math.pow(0, 0));
	}

	public static int getSmallestMultiple() {

		int[] divider = new int[20];
		;
		int[] divider_cnt = new int[20];
		int[] power = new int[20];
		int result = 1;
		// 20개 배열 초기화
		for (int i = 0; i < 20; i++) {
			divider[i] = i + 1;
		}
		for (int i = 0; i < 20; i++) {
			divider_cnt[i] = 0;
		}

		for (int i = 1; i < 20; i++) {
			System.out.println("검증시작" + i);
			for (int j = 1; j <= i; j++) {
				if (divider[i] % divider[j] == 0) {
					if (divider_cnt[j] == 0) {
						divider_cnt[j]++;
							System.out.println("divider count"+ divider[j]+ " " + divider_cnt[j]);
					} 
					if (divider[i]
							% (int) Math.pow(divider[j], divider_cnt[j] +1) == 0) {
						divider_cnt[j]++;
						
						
						System.out.println("divider count "+divider[j]+ "    "+divider_cnt[j]);
					}
					
			
					
					
				} else {
				}
			}
			//else if (i==j)

		}

//		for (int i = 1; i < 20; i++) {
//			for (int j = 1; j < i; j++) {
//				if(i!=j){
//				if (divider[j] != 0) {
//					if (divider[i] % divider[j] == 0) {
//						divider[i] = 1;
//				//	System.out.println(divider[i]);
//					}
//				}
//				else continue;
//			}
//				else {}	
//		}
//		}
		for (int i = 1; i < 20; i++) {
			power[i] = (int) Math.pow(divider[i], divider_cnt[i]);
		}

		for (int i = 1; i < 20; i++) {
			result = result * power[i];
		}

		return result;
	}

}
