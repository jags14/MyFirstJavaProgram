interface StackInterface<E> {
    /*
     * returns the number of elements in the stack
     */
    int size();

    /*
     * tests whether the stack is empty or not
     * return true if empty
     */
    boolean empty();

    /*
     * adds a new element at the top of the stack
     * @param e the element to be pushed
     */
    void push(E e);

    /*
     * removes and returns element from the top of the stack
     * returns null if stack is empty
     */
    E pop();

    /*
     * return, but not remove, the element at the top
     * returns null is stack is empty
     */
    E top();
}

// array based implementation of stack interface
public class StackExample<E> implements StackInterface<E>{
    public static final int CAPACITY = 1000;
    private E[] data;
    private int topIndex = -1;
    
    public StackExample(){
        this(CAPACITY);
    }
    public StackExample(int capacity){
        data = (E[])new Object[capacity];
    }

    public int size(){
        return topIndex + 1;
    }

    public boolean empty(){
        /*
         * if(this.size() > 0){
            return true;
        } else {
            return false;
        }
         */
        return (topIndex == -1);
    }

    public void push(E e) throws IllegalStateException{
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++topIndex] = e;
    }

    public E top(){
        if(empty()) return null;
        return data[topIndex];
    }

    public E pop(){
        if(empty()) return null;
        E topElement = data[topIndex];
        data[topIndex] = null; // dereference it to help garbage collection
        topIndex--;
        return topElement;
    }

    public static void main(String[] args){
        StackExample<Integer> stack = new StackExample<Integer>();
        stack.push(10);
        stack.push(15);
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.top());
    }

}
