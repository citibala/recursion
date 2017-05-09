
package algorithms.recursion;

public class FindPathsCount {

	public static int input[][] = { { 1, 2, 3 },
			                        { 4, 5, 6 },
			                        { 7, 8, 9 } };
	public static int rowLength=3;
	public static int colLength=3;

	public int countNumberOfPaths(int row, int col) {

		if (row == rowLength - 1 || col == colLength - 1) {
			return 1;
		}
		return countNumberOfPaths(row + 1, col) + countNumberOfPaths(row, col + 1);
	}

	public static void main(String[] args) throws java.lang.Exception {

		FindPathsCount obj = new FindPathsCount();
		System.out.print("\nTotal possible paths to reach from 1 to 9 "); 
		System.out.print("by going left or down: "); 
		System.out.println(obj.countNumberOfPaths(0,0)); 
		
	}
}
