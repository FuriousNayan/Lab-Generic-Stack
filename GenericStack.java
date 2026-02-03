import java.util.ArrayList;

/**
 * Lab: GenericStack
 * 
 * A generic stack implementation using ArrayList.
 * Students will implement all methods.
 */
public class GenericStack<E> {
    
    private ArrayList<E> list = new ArrayList<>();
    
    /**
     * TODO: Implement this method.
     * Hint: Add the element to the end of the list (top of stack).
     */
    public void push(E element) {
        list.add(element);
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Remove and return the last element (top of stack).
     * Return type is E.
     */
    public E pop() {
        E poppedVal = list.get(list.size() - 1);
        list.remove(poppedVal);
        return poppedVal;
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return the last element without removing it.
     * Return type is E.
     */
    public E peek() {
        if(list.isEmpty()){
            throw new IllegalArgumentException("Cannot have an empty list");
        }
        return list.get(list.size() - 1);

    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return the number of elements in the stack.
     */
    public int getSize() {
        return list.size();
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return true if the stack is empty.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}
