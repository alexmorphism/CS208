//
/** A Node is the building block for the SingleLinkedList */
public class TheNode{    
  private static class Node<E> {
    
    /** The data value. */
    private E data;
    private Node<E> next;    
    /** The link */

    
    /**
     * Construct a node with the given data value and link
     * @param data - The data value 
     * @param next - The link
     */
    public Node(E data, Node<E> next) {
      this.data = data;
      this.next = next;
      
    }
    
    /**
     * Construct a node with the given data value
     * @param data - The data value 
     */
    public Node(E data) {
      this(data, null);
    }
  }
}
