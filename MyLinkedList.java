package HW_3;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> implements Iterable<T> {
    public LinkedList<T> elements = new LinkedList<>();

    public void addElement(T element) {
        this.elements.add(element);
    }

    public void removeElement(int index) {
        this.elements.remove(index);
    }

    public T getElement(int index) {
        return elements.get(index);
    }

    public LinkedList<T> getAllElements() {
        return elements;
    }

    public Iterator<T> iterator() {
        return elements.iterator();
    }
}