public class ArrayBasedQueue<T> implements QueueInterface<T> {
    final private int MAX_QUEUE = 50;
    private T[] items;
    private int front,back,numItems;

    @SuppressWarnings("unchecked")
    public ArrayBasedQueue() {
       items = (T[]) new Object[MAX_QUEUE];
       front=0;
       back = MAX_QUEUE-1;
       numItems=0;
    }

    @Override
    public boolean isEmpty() {
        return numItems==0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void dequeueAll() {
        items = (T[]) new Object[MAX_QUEUE];
        front=0;
        back = MAX_QUEUE-1;
        numItems=0;
    }

    @Override
    public void enqueue(T newItem) {
        if(numItems<MAX_QUEUE) {
            back = (back+1)%MAX_QUEUE;
            items[back] = newItem;
            numItems++;
        } else {
            System.err.println("Queue if full!");
        }
    }

    @Override
    public T dequeue() {
        if(!isEmpty()) {
            T item = items[front];
            front = (front+1)%MAX_QUEUE;
            numItems--;
            return item;
        } else {
            return null;
        }
    }

    @Override
    public T peek() {
        if(!isEmpty()) {
            return items[front];
        } else {
            return null;
        }
    }
}
