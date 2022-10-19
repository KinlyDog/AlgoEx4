import java.util.*;

public class Stack<T> {
    LinkedList<T> list;
    int size;

    public Stack() {
        list = new LinkedList<>();
        size = 0;
    }

    public int size() {
        if (size != 0) {
            return size;
        }

        return 0;
    }

    public T pop() {
        if (size != 0) {
            size--;
            return list.removeFirst();
        }

        return null;
    }

    public void push(T val) {
        list.addFirst(val);
        size++;
    }

    public T peek() {
        if (size != 0) {
            return list.peek();
        }

        return null;
    }
}
