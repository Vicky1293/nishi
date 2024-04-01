package practicekarvikram;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//defining multidimensional array
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		//printing number of rows
		int row = a.length;
		System.out.println("total rows :" + row);
		
		//printing number of columns
		int columns = a[0].length;
		System.out.println(columns);
		
		//printing total matrix for that we are using outer loop and inner loop
		
		//outer loop
		for(int i = 0; i < row; i++) {
			
			//inner loop
			for(int j =0; j < columns; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
