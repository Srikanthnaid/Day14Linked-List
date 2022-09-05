
public class LinkedListOperations {

	// Represent the head and tail of the singly linked list
	@SuppressWarnings("rawtypes")
	INode head;
	@SuppressWarnings("rawtypes")
	INode tail;
	int size;

	@SuppressWarnings("unchecked")
	public void addNodeInBeginnig(@SuppressWarnings("rawtypes") Node newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			@SuppressWarnings("rawtypes")
			INode temp = head;
			head = newNode;
			head.setNext(temp);
		}
	}

	@SuppressWarnings("unchecked")
	public void addNodeAtEnd(@SuppressWarnings("rawtypes") Node newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}

	@SuppressWarnings("unchecked")
	public void addNodeInMiddle(@SuppressWarnings("rawtypes") Node newNode) {

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			@SuppressWarnings("rawtypes")
			INode temp, current = null;
			int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
			temp = head;
			// current = null;
			for (int i = 0; i < count; i++) {
				current = temp;
				temp = temp.getNext();
			}
			current.setNext(newNode);
			newNode.setNext(temp);
		}
		size++;
	}

	public void deleteNodeFromBeginning() {
		if (head == null)
			System.out.println("Linked List is empty!");
		else
			head = head.getNext();

		size--;
	}

	@SuppressWarnings("unchecked")
	public void deleteNodeFromLast() {
		if (head == null)
			System.out.println("Linked List is empty!");
		else {
			@SuppressWarnings("rawtypes")
			INode current = head;
			while (tail.getNext() != null)
				current = current.getNext();
			current.setNext(null);
		}
		size--;
	}

	public void displayNode() {
		@SuppressWarnings("rawtypes")
		INode current = head;
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
