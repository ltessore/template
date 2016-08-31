package ar.fiuba.tdd.template;

/**
 * Created by ltessore on 29/08/16.
 */
public class TNode<T> {
    public T value;
    public TNode<T> next;

    TNode(T item) {
        value = item;
    }

    public void add(T item) {
        if (next == null) {
            next = new TNode<T>(item);
        } else {
            next.add(item);
        }
    }

    public int sizeCalculate(int base) {
        if (next != null) {
            return next.sizeCalculate(base + 1);
        }
        return base;
    }


}
