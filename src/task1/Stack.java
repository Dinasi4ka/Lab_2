package task1;
import java.util.Iterator;


public class Stack<T> implements Iterable {
    private Node<T> top;
    private int size;

    public   void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new IllegalStateException("No more elements in the stack");
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
