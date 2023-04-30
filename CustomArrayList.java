public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
    private int size = 0;

    @Override
    public boolean add(T item) {
        if (size == items.length) {
            Object[] newItems = new Object[2 * size];
            System.arraycopy(items, 0, newItems, 0, size);
            items = newItems;
        }
        items[size++] = item;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) items[index];
    }
}
