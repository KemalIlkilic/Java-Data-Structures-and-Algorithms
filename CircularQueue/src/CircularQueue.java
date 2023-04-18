public class CircularQueue {
	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	int size;
	public CircularQueue(int size) {
		this.arr = new int[size];
		this.size = size;
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
	}
	public boolean isEmpty() {
		if(topOfQueue == -1) return true;
		else return false;
	}
	public boolean isFull() {
		if(topOfQueue == size-1 && beginningOfQueue == 0) return true;
		else if(topOfQueue+1 == beginningOfQueue) return true;
		else return false;
	}
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("The Queue is Full!");
		}
		else if(isEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
		}
		else {
			if(topOfQueue+1 == size) {
				topOfQueue = 0;
			}
			else {
				topOfQueue++;
			}
			arr[topOfQueue] = value;
		}
		
	}
	public int deQueue() {
		if(isEmpty()) return -1;
		else {
			int result = arr[beginningOfQueue];
			arr[beginningOfQueue] = 0;
			if(beginningOfQueue == topOfQueue) {
				beginningOfQueue = topOfQueue = -1;
			}
			else if (beginningOfQueue+1 == size) {
				beginningOfQueue = 0;
			}
			else {
				beginningOfQueue++;
			}
			return result;
		}
	}
	public int peek() {
		if(isEmpty()) return -1;
		else {
			return arr[beginningOfQueue];
		}
	}
	public void deleteQueue() {
		arr = null;
		System.out.println("The Queue succesfully deleted!");
	}
	
	
	
	
}
