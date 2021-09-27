public class ArrayStack implements IStack {
    private Object[] data;
    private int size;
    public static int CAP;

    public ArrayStack() {
        this(100);
    }

    public ArrayStack(int cap) {
        this.data = new Object[cap];
        this.size = 0;
        CAP = cap;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object top() {
        if (isEmpty()) return null;
        return data[size - 1];
    }

    @Override
    public Object pop() {
        if (isEmpty()) return null;
        Object answer = data[size - 1];
        data[size - 1] = null;
        size--;
        return answer;
    }

    @Override
    public void push(Object item) throws StackFullException {
        if (size == CAP)
            throw new StackFullException("The stack is full");
        data[size++] = item;
    }
}

