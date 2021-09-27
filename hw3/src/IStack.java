public interface IStack {
    int size();

    boolean isEmpty();

    Object top();

    Object pop();

    void push(Object item) throws StackFullException;

}
