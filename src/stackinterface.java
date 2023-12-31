public interface stackinterface<E> {
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