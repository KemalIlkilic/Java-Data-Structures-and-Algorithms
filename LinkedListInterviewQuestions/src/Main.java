public class Main {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.createLL(1);
		ll.insertNode(2);
		ll.insertNode(3);
		ll.insertNode(2);
		ll.insertNode(5);
		ll.traversalLL();
		Questions questions = new Questions();
		questions.deleteDups(ll);
		ll.traversalLL();
	}
}
