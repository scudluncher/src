//
//
//Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
//
//
//How many such routes are there through a 20×20 grid?
public class Euler15_LatticePaths {

	public static void main(String[] args) {

		long matrix[][] = new long[21][21];

		
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 20; j++) {
		if (i*j==0){
			matrix[i][j]=1;
		}
		else
		{
			matrix[i][j]=matrix[i-1][j]+matrix[i][j-1];
		}
				
				
				
			}
		}
		
		
		
		
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 20; j++) {
				System.out.println(i+" " +j+ " " + matrix[i][j]);
			}
		}
	}
}