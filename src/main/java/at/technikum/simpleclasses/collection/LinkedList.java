package at.technikum.simpleclasses.collection;

public class LinkedList<E> implements List<E>{

    private Node<E> startNode;

    private Node<E> lastNode;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public LinkedList(Node<E> startNode) {
        this.startNode = startNode;
        this.size = 1;
    }

    @Override
    public void add(E element) {
        if (size == 0) {
            startNode = new Node<>(element, null);
            size++;
            return;
        } else if (size == 1) {
            startNode.nextNode = new Node<>(element, null);
            lastNode = startNode.nextNode;
            size++;
            return;
        }
        lastNode.nextNode = new Node<>(element, null);
        lastNode = lastNode.nextNode;
        size++;
    }

    private Node<E> traverse(Node<E> startNode) {
        if (startNode.nextNode == null)
            return startNode;
        return traverse(startNode.nextNode);
    }

    @Override
    public void removeAt(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        Node<E> currentNode = startNode;
        int currentIndex = 0;
        if (index != size - 1) {
            while (currentIndex < size - 2) {
                if (currentIndex < index) {
                    currentNode = currentNode.nextNode;
                } else {
                    currentNode.value = currentNode.nextNode.value;
                    currentNode = currentNode.nextNode;
                }
                currentIndex++;
            }
            currentNode.value = currentNode.nextNode.value;
            currentNode.nextNode = null;
        }
        else {
            while (currentIndex < index - 1) {
                currentNode = currentNode.nextNode;
                currentIndex++;
            }
            currentNode.nextNode = null;
            lastNode = currentNode;
        }
        size--;
    }

    @Override
    public boolean contains(E element) {
        for (Node node = startNode; node.nextNode != null; node = node.nextNode)
            if (node.value == element) return true;
        return false;
    }

    @Override
    public void print() {
        Node linkedList = startNode;
        System.out.printf("%s", linkedList.value);
        while (linkedList.nextNode != null) {
            System.out.printf(" -> %s",linkedList.nextNode.value);
            linkedList = linkedList.nextNode;
        }
        System.out.println();
    }
    
    @Override
    public int getSize() {
        return size;
    }
}
