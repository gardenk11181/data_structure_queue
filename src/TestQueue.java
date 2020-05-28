public class TestQueue {
    public static void main(String[] args) {
//        ArrayBasedQueue<String> arrayBasedQueue = new ArrayBasedQueue<>();
//        arrayBasedQueue.enqueue("hello");
//        arrayBasedQueue.enqueue("hi");
//        System.out.println(arrayBasedQueue.dequeue());
//        System.out.println(arrayBasedQueue.dequeue());

//        ReferenceBasedQueue<String> referenceBasedQueue = new ReferenceBasedQueue<>();
//        referenceBasedQueue.enqueue("hello");
//        referenceBasedQueue.enqueue("hi");
//        System.out.println(referenceBasedQueue.dequeue());
//        System.out.println(referenceBasedQueue.dequeue());
//        System.out.println(referenceBasedQueue.dequeue());
//        referenceBasedQueue.enqueue("haha");
//        System.out.println(referenceBasedQueue.peek());

        ListBasedQueue<String> listBasedQueue = new ListBasedQueue<>();
        listBasedQueue.enqueue("hello");
        listBasedQueue.enqueue("hi");
        System.out.println(listBasedQueue.dequeue());
        System.out.println(listBasedQueue.dequeue());
        System.out.println(listBasedQueue.dequeue());
        listBasedQueue.enqueue("haha");
        System.out.println(listBasedQueue.peek());
        System.out.println(listBasedQueue.dequeue());
    }
}
