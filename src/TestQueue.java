public class TestQueue {
    public static void main(String[] args) {
        ArrayBasedQueue<String> arrayBasedQueue = new ArrayBasedQueue<>();
        arrayBasedQueue.enqueue("hello");
        arrayBasedQueue.enqueue("hi");
        System.out.println(arrayBasedQueue.dequeue());
        System.out.println(arrayBasedQueue.dequeue());
    }
}
