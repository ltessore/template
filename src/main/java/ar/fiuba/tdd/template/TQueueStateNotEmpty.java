package ar.fiuba.tdd.template;

/**
 * Created by ltessore on 31/08/16.
 */
public class TQueueStateNotEmpty<T> implements TQueueState<T> {

    private TNode<T> first; // First element of queue
    private TQueue<T> list;

    public TQueueStateNotEmpty(TQueue<T> list, TNode<T> nodeListFirst) {
        first = nodeListFirst;
        this.list = list;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return first.sizeCalculate(1);
    }

    public void add(T item) {
        first.add(item);
    }

    public T top() throws AssertionError {
        return first.value;
    }

    public void remove() throws AssertionError {
        first = first.next;
        if (first == null) {
            list.listState = new TQueueStateEmpty<T>(list);
        } else {
            list.listState = this;
        }
    }

}
