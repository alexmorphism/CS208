/* BinaryTreeTester.java
 * Alexandre Castro
 * Data Structures CS208 10/30/18
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BinaryTreeTester {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bR; // declares a buffered reader
		BinaryTree bst; // declares a binary tree
		
		int leaves = 0;
		
		try{
			bst = new BinaryTree();
			bR = new BufferedReader(new FileReader("test.txt"));
			bst = BinaryTree.readBinaryTree(bR);
		
			System.out.println(bst.toString()); //prints the tree
			System.out.println("Number of leaves in the tree: " + bst.leaves());
			System.out.println("Height of the tree: " + bst.height());
			
			bst.defoliate();
			System.out.println(bst.toString()); //prints the tree
			System.out.println("Number of leaves in the tree: " + bst.leaves());
			System.out.println("Height of the tree: " + bst.height());
			
			System.out.println();
			System.out.println(bst.preorderToString());
			System.out.println(bst.postorderToString());
			System.out.println(bst.inorderToString());
			
			System.out.println("\nThe root data is: " + bst.getData());
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
