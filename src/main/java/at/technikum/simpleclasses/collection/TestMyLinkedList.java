package at.technikum.simpleclasses.collection;

public class TestMyLinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.print();

        /*
        numbers.removeAt(1);

        numbers.print();

         */

    }
}
