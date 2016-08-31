package ar.fiuba.tdd.template;

/**
 * Created by ltessore on 31/08/16.
 */
public class TQueueStateEmpty<T> implements TQueueState<T> {

    TQueue<T> list;

    TQueueStateEmpty(TQueue<T> list) {
        this.list = list;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }

    public void add(T item) {
        list.listState = new TQueueStateNotEmpty<T>(list, new TNode<T>(item));
    }

    public T top() throws AssertionError {
        throw new AssertionError();
    }

    public void remove() throws AssertionError {
        throw new AssertionError();
    }
}
