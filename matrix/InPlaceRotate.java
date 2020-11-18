package matrix;

import java.util.Arrays;

public class InPlaceRotate {

	public static void main(String[] args) {
		int R = 4; 
        int C = 4; 
        int a[][] = {	{1,  2,  3,  4}, 
                		{7,  8,  9,  10}, 
                		{13, 14, 15, 16}, 
                		{19, 20, 21, 22}}; 
        int result [][] = new int [C][R];
        inPlaceRotateClockwise(a, result, R, C);
        inPlaceRotateClockwise(result, a, C, R);
	}
	
	public static void inPlaceRotateClockwise(int mat[][], int result[][], int rowSize, int colSize) {
		// in this case column becomes row and vice-versa
		for (int currRowIndex=0; currRowIndex < rowSize; ++currRowIndex)
			for(int currColIndex=0; currColIndex < colSize; ++currColIndex)
				result[currRowIndex][currColIndex] = mat[currColIndex][currRowIndex];
		System.out.println();
		for (int i = 0; i < result.length; i++)
			System.out.println(Arrays.toString(result[i]));
	}
}
