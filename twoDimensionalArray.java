public class twoDimensionalArray {
	int[][] arr = null;
	public twoDimensionalArray (int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row<numberOfRows;row++) {
			for (int col = 0; col<numberOfColumns;col ++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
			
			
		}
		
		
	}
	public void insertValueInArray(int indexOfRow, int indexOfColumn, int value) {
		try {
			if (arr[indexOfRow][indexOfColumn] == Integer.MIN_VALUE) {
				arr[indexOfRow][indexOfColumn] = value;
				System.out.println(value + ": Başarıyla Eklendi...");
			}
			else {
				System.out.println("Dolu kardeş");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Bro sınırı aştın.");
		}
	}
		

	public void accesCell(int row, int col) {
		try {
			System.out.println("\nAccessing Row: " + row + " , Acessing Column: " + col);
			System.out.println("Cell Volue is: " + arr[row][col]);
			
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Öyle bir hücre bulunmuyor...");
			
		}
	}
	public void traverse2DArray() {
		for(int row = 0; row <arr.length;row++) {
			for(int col = 0; col <arr[0].length;col ++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	public void search2DArray(int value) {
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col <arr[0].length; col ++) {
				if (arr[row][col] == value) {
					System.out.println("Aradığınız değer bu Array içinde bulunmaktadır.");
					System.out.println("Row: " + row + "  Column: " + col);
					return;
				}
				
			}
		}
		System.out.println("Aradığınız değer bu Array içinde bulunmamaktadır...");
		
	}
	

}
