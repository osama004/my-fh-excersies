package at.technikum.simpleclasses.collection.doublyLinked;

import at.technikum.simpleclasses.collection.List;

public class DoublyLinkedList implements List<Integer> {

    private NodeDoubly<Integer> startNode;

    private NodeDoubly<Integer> lastNode;

    private int size;


    @Override
    public void add(Integer element) {
        if (size == 0) {
            startNode = new NodeDoubly<>(null,element, null);
            size++;
            return;
        } else if (size == 1) {
            lastNode = new NodeDoubly<>(startNode, element, null);
            startNode.nextNode = lastNode;
            size++;
            return;
        }
        //NodeDoubly<Integer> node = lastNode;
        lastNode.nextNode = new NodeDoubly<>(lastNode ,element, null);
        lastNode = lastNode.nextNode;
        size++;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public boolean contains(Integer element) {
        return false;
    }

    @Override
    public void print() {
        NodeDoubly node = startNode;
        System.out.printf("%s", node.value);
        while (node.nextNode != null) {
            System.out.printf(" -> %s",node.nextNode.value);
            node = node.nextNode;
        }
        System.out.println();
    }

    @Override
    public int getSize() {
        return 0;
    }

    public DoublyLinkedList() {
        this.size = 0;
    }
}
