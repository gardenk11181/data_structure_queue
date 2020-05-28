import java.util.LinkedList;

public class ListBasedQueue<T> implements QueueInterface<T> {
    private LinkedList<T> items;

    public ListBasedQueue() {
        items = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.size()==0;
    }

    @Override
    public void dequeueAll() {
        items.clear();
    }

    @Override
    public void enqueue(T newItem) {
        items.add(newItem);
    }

    @Override
    public T dequeue() {
        if(isEmpty()) {
            return null;
        } else {
            T item = items.get(0);
            items.remove(0);
            return item;
        }
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            return null;
        } else {
            return items.get(0);
        }
    }
}
