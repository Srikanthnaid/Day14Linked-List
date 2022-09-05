
public class LinkedList<T> {
	node<T> head;

	public void add(T value) {
		node<T> newnode = new node<T>();
		newnode.data = value;
		newnode.next = null;
		if (head == null) {
			head = newnode;
		} else {
			node<T> tail = null;
			while (tail.next != null) {
				tail = (node<T>) tail.next;
			}
			tail.next = newnode;
		}
	}

	// method to printing the data inside the linkedlist.
	public void print() {
		node<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = (node<T>) node.next;

		}
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>();
		list1.add(56);
		list2.add(30);
		list3.add(70);
		list1.print();
		list2.print();
		list3.print();
	}
}
