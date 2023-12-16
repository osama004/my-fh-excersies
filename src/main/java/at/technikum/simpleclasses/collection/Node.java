package at.technikum.simpleclasses.collection;

public class Node<E> {

    E value;

    Node<E> nextNode;

    public Node(E value, Node<E> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nextNode=" + nextNode +
                '}';
    }
}
