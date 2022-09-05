
public class LinkedListOperations {
	// Represent the head and tail of the singly linked list
	@SuppressWarnings("rawtypes")
	public Node head = null;
	public Node tail = null;

	public Node addNode(Node newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = (INode) newNode;
			tail = newNode;
		}
		return head;
	}

	public void displayNode() {
		INode current = (INode) head;
		if (head == null)
			System.out.println("Linked List is empty");
		System.out.print("Nodes are: ");
		while (current != null) {
			if (current.getNext() != null) {
				System.out.print(current.getKey() + " -> ");
				current = current.getNext();
			} else {
				System.out.println(current.getKey());
				current = current.getNext();
			}
		}
	}
}
