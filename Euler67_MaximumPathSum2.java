import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Euler67_MaximumPathSum2 {

	public static int tree [][];
	
	public static void main(String[] args) throws IOException {
		new Euler67_MaximumPathSum2().readTree();
		System.out.println(getMaxforTriangle(tree));
	}


public static int getMaxforTriangle(int[][] triangle){

	for(int i= triangle.length-2;i>=0;i--){
		for(int j = 0 ; j<triangle[i].length;j++){
			triangle[i][j]+=Math.max(triangle[i+1][j], triangle[i+1][j+1]);
		}
	}





return triangle[0][0];
}
	
	private void readTree() throws IOException {
		tree = new int[100][];

		BufferedReader bufferedReader = new BufferedReader(new FileReader("c:/triangle.txt"));
		for (int i = 0; i < 100; i++) {
		tree[i] = new int[i + 1];
		String[] values = bufferedReader.readLine().split(" ");
		for (int j = 0; j <= i; j++)
		tree[i][j] = Integer.parseInt(values[j]);
		}
		}
}
