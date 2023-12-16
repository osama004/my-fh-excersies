package at.technikum.simpleclasses.collection.doublyLinked;

public class NodeDoubly<E> {
    NodeDoubly<E> privousNode;

    E value;
    NodeDoubly<E> nextNode;

    public NodeDoubly(NodeDoubly<E> privousNode, E value, NodeDoubly<E> nextNode) {
        this.privousNode = privousNode;
        this.value = value;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "NodeDoubly{" +
                "privousNode=" + privousNode +
                ", value=" + value +
                ", nextNode=" + nextNode +
                '}';
    }
}
