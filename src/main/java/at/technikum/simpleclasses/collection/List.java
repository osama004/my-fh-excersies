package at.technikum.simpleclasses.collection;

public interface List<E> {

    void add(E element);

    void removeAt(int index);

    boolean contains(E element);

    void print();

    int getSize();
}
