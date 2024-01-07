package at.technikum.simpleclasses.collection.doublyLinked;

import at.technikum.simpleclasses.collection.List;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new DoublyLinkedList();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.print();
        numbers.removeAt(4);
        numbers.add(2);
        numbers.add(75);
        numbers.print();
        numbers.removeAt(3);
        numbers.print();


    }
}
