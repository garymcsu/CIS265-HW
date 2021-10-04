public class LLQueue implements IQueue {
    private SinglyLL data;

    public LLQueue() {
        data = new SinglyLL();
        // your implementation
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void add(Object item) {
        if (data.first() == null) {
            data.addFirst(item);
        }
        data.addLast(item);
        // your implementation
        // you don't need to throw QueueFullException because the linked list
        // is not limited to any specific space capacity
    }

    public Object first() {
        if (data.isEmpty()) return null;
        return data.first();
        // your implementation
    }

    public Object remove() {
        if (data.isEmpty()) return null;
        return data.first();
        // your implementation
    }
}
