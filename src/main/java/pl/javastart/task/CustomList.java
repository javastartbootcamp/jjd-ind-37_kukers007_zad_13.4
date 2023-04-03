package pl.javastart.task;

import java.util.Arrays;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest
public class CustomList<T> {

    private Object[] customs;
    private int size;

    public CustomList() {
        customs = new Object[10];
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) customs[index];
    }

    public void add(T element) {
        if (size == customs.length) {
            increaseCapacity();
        }
        customs[size++] = element;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == customs.length) {
            increaseCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            customs[i + 1] = customs[i];
        }
        customs[index] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            customs[i] = customs[i + 1];
        }
        customs[size--] = null;
    }

    private void increaseCapacity() {
        Object[] newElements = Arrays.copyOf(customs, customs.length * 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(customs[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}