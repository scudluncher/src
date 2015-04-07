public class pascal {

	public static void main(String[] args) {

		int[][] pascal = new int[10][10];

		for (int i = 0; i < 10; i++) { // 줄 수를 표현

			for (int j = 0; j <= i; j++) { // 한 줄에 몇개 들어가는지 표현.
				if (i == 0 && j == 0) {
					pascal[0][0] = 1;
					System.out.println("맨 꼭대기 " + pascal[i][j]);
				} else if (j == 0) {
					pascal[i][j] = 1;
					System.out.println(i + "번쟤 줄 첫칸 " + pascal[i][j]);

				} else if (j == i) {
					pascal[i][j] = 1;
					System.out.println(i + "번째 줄 마지막 칸 " + pascal[i][j]);
				} else {
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
					System.out.println(i + "줄 " + j + "번째 " + pascal[i][j]);

				}

			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(pascal[i][j] + " ");
			}
			System.out.println();

		}

	}
}