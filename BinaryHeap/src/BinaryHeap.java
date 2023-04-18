public class BinaryHeap {
	int[] arr;
	int sizeOfTree;
	
	public BinaryHeap(int size) {
		arr = new int[size+1];
		this.sizeOfTree = 0;
	}
	public boolean isEmpty() {
		if(sizeOfTree == 0) return true;
		else return false;
	}
	public Integer peek() {
		if(isEmpty()) return null;
		return arr[1];
	}
	public int sizeOfBP() {
		return sizeOfTree;
	}
	public void levelOrder() {
		for(int i = 1; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
}
