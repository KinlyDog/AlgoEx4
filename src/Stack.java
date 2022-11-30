import java.util.*;

public class Stack<T> {
    LinkedList<T> list;
    int size;

    public Stack() {
        this.list = new LinkedList<>();
        this.size = 0;
    }

    public int size() {
        if (this.size != 0) {
            return this.size;
        }

        return 0;
    }

    public T pop() {
        if (this.size != 0) {
            this.size--;
            return list.removeFirst();
        }

        return null;
    }

    public void push(T val) {
        list.addFirst(val);
        this.size++;
    }

    public T peek() {
        if (this.size != 0) {
            return list.peek();
        }

        return null;
    }
}

