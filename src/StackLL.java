import java.util.LinkedList;

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

public class StackLL<E> implements StackInterface<E> {
    // create a node class
    private class Node {
        E data;
        Node next;
        public Node(E data, Node next){
            this.data = data;
            this.next = next;
        }
        public String toString(){
            return data.toString();
        }
    }
    private int topIndex = -1;
    private Node top;
    LinkedList<E> list = new LinkedList<>();

    public StackLL(){};
    
    public int size(){
        int count = 0;
        while(top.data != null){
            count += 1;
            top = top.next;
        }
        return count;
    }

    public boolean empty(){
        if(top.data == null) return true;
        return false;
    }

    public void push(E e){
        top = new Node(e, top);
        topIndex += 1;
    }
}
