public class Main {
	public static void main(String[] args) {
		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.createSinglyLinkedList(5);
		sLL.insertInLinkedList(6, 0);
		sLL.insertInLinkedList(7, 3);
		sLL.insertInLinkedList(8, 4);
		sLL.insertInLinkedList(9, 0);
		sLL.traverseSinglyLinkedList();
		sLL.deletesLL();
		sLL.traverseSinglyLinkedList();

	}

}
