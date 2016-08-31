package ar.fiuba.tdd.template;

/**
 * Created by ltessore on 31/08/16.
 */
public class TQueue<T> {
    TQueueState<T> listState;

    TQueue() {
        listState = new TQueueStateEmpty<>(this);
    }

    boolean isEmpty() {
        return listState.isEmpty();
    }

    int size() {
        return listState.size();
    }

    void add(T item) {
        listState.add(item);
    }

    T top() throws AssertionError {
        return listState.top();
    }

    void remove() throws AssertionError {
        listState.remove();
    }
}
