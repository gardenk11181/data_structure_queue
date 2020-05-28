public interface QueueInterface<T> {
    public boolean isEmpty();
    public void dequeueAll();
    public void enqueue(T newItem);
    public T dequeue();
    public T peek();
}
