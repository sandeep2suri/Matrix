package matrix;
public class Spiral {
	public static void main(String[] args) {
	        int R = 4; 
	        int C = 6; 
	        int a[][] = {	{1,  2,  3,  4,  5,  6}, 
                    		{7,  8,  9,  10, 11, 12}, 
                    		{13, 14, 15, 16, 17, 18}, 
                    		{19, 20, 21, 22, 23, 24}}; 
	        printSpiral(a, R, C);
	}
	
	public static void printSpiral(int mat[][], int rowSize, int colSize) {
		int count = 0;
		for (int currentRowIndex = 0, currentColIndex = 0, currentMaxColIndex = colSize, currentMaxRowIndex = rowSize - 1;;
				++currentRowIndex, ++currentColIndex, currentMaxColIndex--, currentMaxRowIndex--) {
			int topColIndex = 0;
			int rightRowIndex = 0;
			int bottomColIndex = 0;
			int leftRowIndex = 0;
			
			// print all top row elements
			for (topColIndex=currentColIndex; topColIndex<currentMaxColIndex; ++topColIndex, count++)
				System.out.print(mat[currentRowIndex][topColIndex] + "\t");
			if (count >= rowSize * colSize)
				break;
			
			// print all right most elements
			for (rightRowIndex=currentRowIndex+1; rightRowIndex<=currentMaxRowIndex; ++ rightRowIndex, count++)
				System.out.print(mat[rightRowIndex][currentMaxColIndex - 1] + "\t");
			if (count >= rowSize * colSize)
				break;
			// print all bottom most elements
			for (bottomColIndex = currentMaxColIndex - 2; bottomColIndex >= currentColIndex; --bottomColIndex, count++)
				System.out.print(mat[currentMaxRowIndex][bottomColIndex] + "\t");
			if (count >= rowSize * colSize)
				break;
			// print all left most elements
			for (leftRowIndex=currentMaxRowIndex - 1; leftRowIndex > currentRowIndex; --leftRowIndex, count++)
				System.out.print(mat[leftRowIndex][currentColIndex] + "\t");
			if (count >= rowSize * colSize)
				break;
		}
	}
}
