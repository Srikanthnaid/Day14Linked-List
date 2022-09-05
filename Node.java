
public class Node<K> {
	K key;
    INode next;

    public Node() {
    }

    public Node(K key) {
        this.key = key;
        this.next = null;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    public INode<K> getNext() {
        return next;
    }
}
