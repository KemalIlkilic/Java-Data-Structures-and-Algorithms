public class QueueLinkedList {
	LinkedList list;
	
	public QueueLinkedList() {
		list = new LinkedList();
	}
	public boolean isEmpty() {
		if(list.head == null) return true;
		else return false;
	}
	public void enQueue(int value) {
		list.insertInLinkedList(value, list.size);
	}
	public int deQueue() {
		if(list.head == null) return -1;
		else
		{
			int value = list.head.value;
			list.deletionOfNode(0);
			return value;
		}
	}
	public int peek() {
		if(isEmpty()) return -1;
		else {
			return list.head.value;
		}
	}
	public void delete() {
		list.deleteSLL();
	}
	
	
	
}
