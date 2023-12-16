package at.technikum.simpleclasses.collection.doublyLinked;

import at.technikum.simpleclasses.collection.LinkedList;
import at.technikum.simpleclasses.collection.List;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedListDoublyLinked();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.print();

    }
}
