public class TestQueue {
    public static void main(String[] args) {
//        ArrayBasedQueue<String> arrayBasedQueue = new ArrayBasedQueue<>();
//        arrayBasedQueue.enqueue("hello");
//        arrayBasedQueue.enqueue("hi");
//        System.out.println(arrayBasedQueue.dequeue());
//        System.out.println(arrayBasedQueue.dequeue());

        ReferenceBasedQueue<String> referenceBasedQueue = new ReferenceBasedQueue<>();
        referenceBasedQueue.enqueue("hello");
        referenceBasedQueue.enqueue("hi");
        System.out.println(referenceBasedQueue.dequeue());
        System.out.println(referenceBasedQueue.dequeue());
        System.out.println(referenceBasedQueue.dequeue());
        referenceBasedQueue.enqueue("haha");
        System.out.println(referenceBasedQueue.peek());
    }
}
