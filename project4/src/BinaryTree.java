/* BinaryTree.java
 * Alexandre Castro
 * Data Structures CS208 11/12/18
 * project4
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;

/**
 * Class for a binary tree that stores type E objects.
 **/
public class BinaryTree<E> implements Serializable {

    /** Class to encapsulate a tree node. */
    protected static class Node<E> implements Serializable {
        // Data Fields

        /** The information stored in this node. */
        public E data;
        /** Reference to the left child 1. */
        public Node<E> leftChildOne;
        /** Reference to the right child 1. */
        public Node<E> rightChildOne;
        /** Reference to the left child 2. */
        public Node<E> leftChildTwo;
        /** Reference to the right child 2. */
        public Node<E> rightChildTwo;
        // Constructors
        /**
         * Construct a node with given data and no children.
         * @param data The data to store in this node
         */
        public Node(E data) {
            this.data = data;
            leftChildOne = null;
            rightChildOne = null;
            leftChildTwo = null;
            rightChildTwo = null;
        }

        // Methods
        /**
         * Returns a string representation of the node.
         * @return A string representation of the data fields
         */
        @Override
        public String toString() {
            return data.toString();
        }
    }
 




    // Data Field
    /** The root of the binary tree */
    protected Node<E> root;

    /** Construct an empty BinaryTree */
    public BinaryTree() {
        root = null;
    }

    /**
     * Construct a BinaryTree with a specified root.
     * Should only be used by subclasses.
     * @param root The node that is the root of the tree.
     */
    protected BinaryTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Constructs a new binary tree with data in its root,leftTree
     * as its left subtree and rightTree as its right subtree.
     */
    public BinaryTree(E data, BinaryTree<E> leftTreeOne,
            BinaryTree<E> rightTreeOne) {
        root = new Node<E>(data);
        if (leftTreeOne != null) {
            root.leftChildOne = leftTreeOne.root;
        } else {
            root.leftChildOne = null;
        }
        if (rightTreeOne != null) {
            root.rightChildOne = rightTreeOne.root;
        } else {
            root.rightChildOne = null;
        }
    }

    /**
     * Return the left subtree.
     * @return The left subtree or null if either the root or
     * the left subtree is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if (root != null && root.leftChildOne != null && root.leftChildTwo != null) {
            return new BinaryTree<E>(root.leftChildOne);
        } else {
            return null;
        }
    }

    /**
     * Return the right sub-tree
     * @return the right sub-tree or
     *         null if either the root or the
     *         right subtree is null.
     */
    public BinaryTree<E> getRightSubtree() {
        if (root != null && root.rightChildOne != null) {
            return new BinaryTree<E>(root.rightChildOne);
        } else {
            return null;
        }
    }

    /**
     * Return the data field of the root
     * @return the data field of the root
     *         or null if the root is null
     */
    public E getData() {
        if (root != null) {
            return root.data;
        } else {
            return null;
        }
    }

    /**
     * Determine whether this tree is a leaf.
     * @return true if the root has no children
     */
    public boolean isLeaf() {
        return (root == null || (root.leftChildOne == null && root.rightChildOne == null &&
        		                 root.leftChildTwo == null && root.rightChildTwo == null));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, 1, sb);
        return sb.toString();
    }

    /**
     * Perform a preorder traversal.
     * @param node The local root
     * @param depth The depth
     * @param sb The string buffer to save the output
     */
    private void preOrderTraverse(Node<E> node, int depth,
            StringBuilder sb) {
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {
            sb.append("null\n");
        } else {
            sb.append(node.toString());
            sb.append("\n");
            preOrderTraverse(node.leftChildOne, depth + 1, sb);
            preOrderTraverse(node.rightChildOne, depth + 1, sb);
            preOrderTraverse(node.leftChildTwo, depth + 1, sb);
            preOrderTraverse(node.rightChildTwo, depth + 1, sb);
        }
    }

 
    /**
     * Method to read a binary tree.
     * @pre The input consists of a preorder traversal
     *      of the binary tree. The line "null" indicates a null tree.
     * @param bR The input file
     * @return The binary tree
     * @throws IOException If there is an input error
     */
    public static BinaryTree<String> readBinaryTree(BufferedReader bR)
            throws IOException {
        // Read a line and trim leading and trailing spaces.
        String data = bR.readLine().trim();
        if (data.equals("null")) {
            return null;
        } else {
            BinaryTree<String> leftTreeOne = readBinaryTree(bR);
            BinaryTree<String> rightTreeOne = readBinaryTree(bR);
            return new BinaryTree<String>(data, leftTreeOne, rightTreeOne);
        }
    }

    /**
     * Method to return the preorder traversal of the binary tree
     * as a sequence of strings each separated by a space.
     * @return A preorder traversal as a string
     */
    public String preorderToString() {
        StringBuilder stb = new StringBuilder();
        preorderToString(stb, root);
        return stb.toString();
    }

    private void preorderToString(StringBuilder stb, Node<E> root) {
        stb.append(root);
        if (root.leftChildOne != null) {
            stb.append(" ");
            preorderToString(stb, root.leftChildOne);
        }
        if (root.rightChildOne != null) {
            stb.append(" ");
            preorderToString(stb, root.rightChildOne);
        }
        if (root.leftChildTwo != null) {
            stb.append(" ");
            preorderToString(stb, root.leftChildTwo);
        }
        if (root.rightChildTwo != null) {
            stb.append(" ");
            preorderToString(stb, root.rightChildTwo);
        }
    }

    /**
     * Method to return the postorder traversal of the binary tree
     * as a sequence of strings each separated by a space.
     * @return A postorder traversal as a string
     */
    public String postorderToString() {
        StringBuilder stb = new StringBuilder();
        postorderToString(stb, root);
        return stb.toString();
    }

    private void postorderToString(StringBuilder stb, Node<E> root) {
        if (root.leftChildOne != null) {
            postorderToString(stb, root.leftChildOne);
            stb.append(" ");
        }
        if (root.rightChildOne != null) {
            postorderToString(stb, root.rightChildOne);
            stb.append(" ");
        }
        if (root.leftChildTwo != null) {
            postorderToString(stb, root.leftChildTwo);
            stb.append(" ");
        }
        if (root.rightChildTwo != null) {
            postorderToString(stb, root.rightChildTwo);
            stb.append(" ");
        }
        stb.append(root);
    }

    /** 
     * A method to display the inorder traversal of a binary tree 
     * placeing a left parenthesis before each subtree and a right 
     * parenthesis after each subtree. For example the expression 
     * tree shown in Figure 6.12 would be represented as
     * (((x) + (y)) * ((a) / (b))).
     * @return An inorder string representation of the tree
     */
    public String inorderToString() {
        StringBuilder stb = new StringBuilder();
        inorderToString(stb, root);
        return stb.toString();
    }

    private void inorderToString(StringBuilder stb, Node<E> root) {
        if (root.leftChildOne != null) {
            stb.append("(");
            inorderToString(stb, root.leftChildOne);
            stb.append(") ");
        }
        stb.append(root);
        if (root.rightChildOne != null) {
            stb.append(" (");
            inorderToString(stb, root.rightChildOne);
            stb.append(")");
        }
        if (root.leftChildTwo != null) {
            stb.append("(");
            inorderToString(stb, root.leftChildTwo);
            stb.append(") ");
        }
        stb.append(root);
        if (root.rightChildTwo != null) {
            stb.append(" (");
            inorderToString(stb, root.rightChildTwo);
            stb.append(")");
        }
    }
    
    public int leaves (){
    	return countLeaves(this);
    }
    
    private int countLeaves(BinaryTree<E> root){
    	if(root == null)
    		return 0;
    	else if(root.isLeaf()){
    		return 1;
    	}
    	else
    		return countLeaves(root.getLeftSubtree()) + countLeaves(root.getRightSubtree());
    }
    
    public int height (){
    	return getHeight(this);
    }
    private int getHeight(BinaryTree<E> root){
    	if(root == null){
    		return -1;
    	}
    	
    	int leftHeight = getHeight(root.getLeftSubtree());
    	int rightHeight = getHeight(root.getRightSubtree());
    	
    	if(leftHeight > rightHeight){
    		return leftHeight + 1;
    	} else
    		return rightHeight + 1;
    }
    
    public void defoliate(){
    	if(removeLeaves(root))
    		root = null;
    }
    private boolean removeLeaves(Node<E> root){    	
    	if(root == null || (root.leftChildOne == null && root.rightChildOne == null &&
    						root.leftChildTwo == null && root.rightChildOne == null))
    	{
    		return true;
    	}
    	if(removeLeaves(root.leftChildOne)){
    		root.leftChildOne = null;
    	}
    	if(removeLeaves(root.rightChildOne)){
    		root.rightChildOne = null;
    	}
    	if(removeLeaves(root.leftChildTwo)){
    		root.leftChildTwo = null;
    	}
    	if(removeLeaves(root.rightChildTwo)){
    		root.rightChildTwo = null;
    	}
    	return false;   	
    }
  
}

/* public int leaves () //returns the number of leaves in this tree
public int height() //returns the height of this tree
public void defoliate() //removes all the leaves from this tree
Then write a tester to create a tree and test these methods (and others).
*/
