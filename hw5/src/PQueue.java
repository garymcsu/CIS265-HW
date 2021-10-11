public interface PQueue {
    int size();

    boolean isEmpty();

    PQEntry insert(Integer key, String value);

    PQEntry min();

    PQEntry removeMin();
}
