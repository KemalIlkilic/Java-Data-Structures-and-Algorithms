public class TwoDimensionalArray {
	int[][] arr = null;
	
	// Constructor
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0;row<arr.length;row++) {
			for(int column = 0;column<arr[0].length;column++) {
				arr[row][column] = Integer.MIN_VALUE;
			}
		}
	}
	public void insertValueInTheArray(int row,int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("The value is succesfully inserted");
			}
			else {
				System.out.println("This cell is already occupied");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D array");
		}
		
	}
	public void accessCell(int row, int col) {
	    System.out.println("\nAccessing Row#" + row + ", Col#" + col);
	    try {
	      System.out.println("Cell value is: " + arr[row][col]);

	    } catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("Invalid index for 2D array");
	    }
	  }
	public void traverse2DArray() {
		for (int row=0; row < arr.length; row++) {
			for (int col=0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "  ");
				}
			System.out.println();
			}
		}
	public void searchingValue(int value) {
		for (int row=0; row<arr.length; row++){
		    for (int col=0; col<arr[0].length; col++) {
		        if (arr[row][col] == value) {
		            System.out.println("Value is found at row: "+ row + " Col: " + col);
		            return;
		    }
		  }
		}
		System.out.println("Value is not found");
}
	  public void deleteValuefromArray(int row, int col) {
		  try {
			  System.out.println("Succesfully deteled: " + arr[row][col]);
			  arr[row][col] = Integer.MIN_VALUE;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index is not valid for array");
			
		}
	  }
}
