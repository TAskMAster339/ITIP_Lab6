

public class Stack<T> {
    private T[] data;
    private int head;

    public Stack(int capacity){
        this.data = (T[]) new Object[capacity];
        this.head = 0;
    }
    public void push(T element){
        try {
            data[head] = element;
            head += 1;
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Tried to push to a full stack. " + e.getMessage());
        }
    }
    public T pop() {
        try {
            head -= 1;
            return data[head];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tried to pop from an empty stack. " + e.getMessage());
            return null;
        }
    }
    public T peek() {
        return data[head - 1];
    }
}

