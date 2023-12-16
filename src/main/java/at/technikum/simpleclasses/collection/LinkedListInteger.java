package at.technikum.simpleclasses.collection;

public class LinkedListInteger<Integer> implements List<Integer>{

    private Node<Integer> startNode;

    private int size;

    @Override
    public void add(Integer element) {
        if (startNode == null) {
            startNode = new Node<>(element, null);
            size++;
            return;
        }

        Node<Integer> node = startNode;
        while (node.nextNode != null) {
            node = node.nextNode;
        }
        node.nextNode = new Node<>(element, null);
        size++;
    }

    @Override
    public void removeAt(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        Node<Integer> linkedList = startNode;
        int i = 0;
        while (i < index) {
            linkedList = linkedList.nextNode;
            i++;
        }

        while (i < size - 2) {
            // node[i] = node[i + 1]
            linkedList.value = linkedList.nextNode.value;
            linkedList = linkedList.nextNode;
            i++;
        }
        linkedList.value = linkedList.nextNode.value;
        linkedList.nextNode = null;
        size--;
    }

    @Override
    public boolean contains(Integer element) {
        for (Node node = startNode; node.nextNode != null; node = node.nextNode)
            if (node.value == element) return true;
        return false;
    }

    @Override
    public void print() {
        Node node = startNode;
        System.out.printf("%s", node.value);
        while (node.nextNode != null) {
            System.out.printf(" -> %s",node.nextNode.value);
            node = node.nextNode;
        }
        System.out.println();
    }

    @Override
    public int getSize() {
        return size;
    }

    public LinkedListInteger() {
        this.size = 0;
    }
    
    public LinkedListInteger(Node<Integer> startNode) {
        this.startNode = startNode;
        this.size = 1;
    }
    

}
