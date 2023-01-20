package lab5;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SingleLinkedList<T> implements Iterable<T> {
    private final LinkedList<T> linkedList = new LinkedList<T>();

    public int size() {
        return linkedList.size();
    }

    public boolean add(T element) {
        return linkedList.add(element);
    }

    public void add(int index, T element) {
        linkedList.add(index, element);
    }

    public void remove(T element) {
        linkedList.remove(element);
    }

    public void remove(int index) {
        linkedList.remove(index);
    }

    public T get(int index) {
        return linkedList.get(index);
    }

    public T getFirst() {
        return linkedList.getFirst();
    }

    public T getLast() {
        return linkedList.getLast();
    }

    public void clear() {
        linkedList.clear();
    }

    // Producer extends
    public void addAll(Collection<? extends T> collection) {
        Iterator<? extends T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            this.linkedList.add(item);
        }
    }

    // Producer extends
    public static <T> SingleLinkedList<T> getEvenIndexList(SingleLinkedList<? extends T> singleLinkedList) {
        SingleLinkedList<T> newList = new SingleLinkedList<T>();
        Iterator<? extends T> iterator = singleLinkedList.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (i % 2 == 0) {
                newList.add(item);
            }
            i += 1;
        }
        return newList;
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }
}