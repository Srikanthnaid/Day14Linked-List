
public class LinkedList {
	  public static void main(String[] args) {
	        LinkedListOperations operations = new LinkedListOperations();

	        Node<Integer> myFirstNode = new Node<>(56);
	        Node<Integer> mySecondNode = new Node<>(30);
	        Node<Integer> myThirdNode = new Node<>(70);

	        operations.addNode(myFirstNode);
	        operations.addNode(myThirdNode);
	        operations.addNodeInMiddle(mySecondNode);

	        operations.displayNode();
	    }
}
