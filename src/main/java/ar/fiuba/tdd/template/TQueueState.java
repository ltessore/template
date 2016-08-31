package ar.fiuba.tdd.template;

/**
 * Created by ltessore on 31/08/16.
 */
public interface TQueueState<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    T top() throws AssertionError;

    void remove() throws AssertionError;
}
