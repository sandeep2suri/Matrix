package matrix;
import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
	      int R = 4; 
	      int C = 6; 
	      int a[][] = {	{1,  2,  3,  4,  5,  6}, 
                   		{7,  8,  9,  10, 11, 12}, 
                   		{13, 14, 15, 16, 17, 18}, 
                   		{19, 20, 21, 22, 23, 24}}; 
	      rotate(a, R, C);
	}
	
	public static void rotate(int mat[][], int rowSize, int colSize) {
		int currentRowIndex = 0;
		int currentColIndex = 0;
		int currentMaxRowIndex = rowSize;
		int currentMaxColIndex = colSize;
		int result [][] = new int [rowSize][colSize];
		int count = 0;
		
		for(;;++currentRowIndex, ++currentColIndex, --currentMaxRowIndex, --currentMaxColIndex) {
			int topColIndex;
			int rightRowIndex;
			int bottomColIndex;
			int leftRowIndex;
			
			// rotate top row
			for(topColIndex=currentColIndex; topColIndex < (currentMaxColIndex - 1); ++topColIndex, count++)
				result[currentRowIndex][topColIndex + 1] = mat[currentRowIndex][topColIndex];
			result [currentRowIndex+1][currentMaxColIndex - 1] = mat[currentRowIndex][currentMaxColIndex - 1];
			
			if (++count >= (rowSize*colSize))
				break;
			
			// rotate right most row
			for (rightRowIndex=currentRowIndex+1; rightRowIndex < (currentMaxRowIndex - 1); ++rightRowIndex, count++)
				result[rightRowIndex + 1][currentMaxColIndex - 1] = mat [rightRowIndex][currentMaxColIndex - 1];
			result[currentMaxRowIndex - 1][currentMaxColIndex - 2] = mat[currentMaxRowIndex - 1][currentMaxColIndex - 1]; 
			
			if (++count >= (rowSize*colSize))
				break;
			
			// rotate bottom most row 19, 20, 21, 22, 23, 24
			for (bottomColIndex=currentMaxColIndex-3; bottomColIndex>=currentColIndex; --bottomColIndex, count++)
				result[currentMaxRowIndex - 1][bottomColIndex] = mat[currentMaxRowIndex - 1][bottomColIndex + 1];
			result[currentMaxRowIndex - 2][currentColIndex] = mat[currentMaxRowIndex - 1][currentColIndex];
			
			if (++count >= (rowSize*colSize))
				break;
			/*{1,  2,  3,  4,  5,  6}, 
       		  {7,  8,  9,  10, 11, 12}, 
       		  {13, 14, 15, 16, 17, 18}, 
       		  {19, 20, 21, 22, 23, 24}*/
       		
			// rotate left most col
			for (leftRowIndex=currentMaxRowIndex-2; leftRowIndex>=currentRowIndex; --leftRowIndex, count++)
				result[leftRowIndex][currentColIndex] = mat[leftRowIndex+1][currentColIndex];
			
			if (++count >= (rowSize*colSize))
				break;
		}
		
		for (int i = 0; i < result.length; i++)
			System.out.println(Arrays.toString(result[i]));
	}
}
