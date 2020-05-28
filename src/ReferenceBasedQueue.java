public class ReferenceBasedQueue<T> implements QueueInterface<T> {
    Node<T> lastNode;

    @Override
    public boolean isEmpty() {
        return lastNode==null;
    }

    @Override
    public void dequeueAll() {
        lastNode=null;
    }

    @Override
    public void enqueue(T newItem) {
        Node<T> node = new Node<T>();
        node.setItem(newItem);
        if(lastNode==null) {
            node.setNextNode(node);
        } else {
            Node<T> firstNode = lastNode.getNextNode();
            lastNode.setNextNode(node);
            node.setNextNode(firstNode);
        }
        lastNode = node;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) {
            return null;
        } else {
            Node<T> firstNode = lastNode.getNextNode();
            if(firstNode==lastNode) {
                lastNode = null;
            } else{
                lastNode.setNextNode(firstNode.getNextNode());
            }
            return firstNode.getItem();
        }
    }

    @Override
    public T peek() {
       if(isEmpty()) {
           return null;
       } else {
           return lastNode.getNextNode().getItem();
       }
    }
}

class Node<T> {
    private T item;
    private Node<T> nextNode;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
