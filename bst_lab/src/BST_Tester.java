/* Alexandre Castro
 * CS208 Data Structures 11/09/18
 * BinarySearchTree Lab
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BST_Tester {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of your Binary Search Tree");
		int treeSize = scan.nextInt();
		
		BinarySearchTree bst = new BinarySearchTree();
		int ran = 0; // random number
		
		// CREATES THE TREE PRINTING EVERY TIME IS BEING CREATED
		for(int i = 0; i < treeSize; i++){
			ran = (int) (1 + Math.random() * 100);
			bst.add(ran);
			System.out.println(bst.toString());
			System.out.println("---------------------UPDATED TREE---------------------");
			Thread.sleep(500);
		
		}
		
		// FINDS NODE 27 
		if(bst.find(27) == null)
			System.out.println("Could not FIND node 27");
		else
			System.out.println("Yes! node number 27 was found!");

		
		// DELETE NODE NUMBER 38 FROM A TREE IF EXISTS
		if(bst.delete(38) == null)
			System.out.println("Could not DELETE node 38");
		else{
			System.out.println("yes node 38 was deleted");
			System.out.println(bst.toString());
		}
		
		/* USE THE REMOVE METHOD RANDOMLY */
		System.out.println("How many items do you want to remove randomly?");
		int del = scan.nextInt();
		
		System.out.println("---------------------UPDATED TREE---------------------");
		System.out.println(bst.toString());
		
		int count = 0;
		for(int i = 0; i< del; i++){
			ran = (int)(1+ Math.random() * 100);
			if(bst.contains(ran)){
				Thread.sleep(500);
				System.out.println("Yes! the tree contains the item: " + ran);
				System.out.println("\nRemoving node " + ran +"\n");
				bst.remove(ran); //removes the node randomly
				System.out.println("---------------------UPDATED TREE---------------------");
				System.out.println(bst.toString());
				count++;
			}
		}
		if(count == 0)
			System.out.println("Could not find any items to delete.\n");
		
		/* DELETE PRIME */
		System.out.println("How many items do you want to DELETEPRIME randomly?");
		del = scan.nextInt();
		count = 0;
		for(int i = 0; i < del; i++){
			ran = (int)(Math.random() * 100);
			if(bst.contains(ran)){
				Thread.sleep(500);
				System.out.println("\nDeleting prime node " + ran +"\n");
				bst.deletePrime(ran);
				System.out.println(bst.toString());
				count++;
			}
		}
		if(count == 0)
			System.out.println("Could not find any PRIME items to delete.\n");
			
		//TEST TOLIST() METHOD
		ArrayList<BinarySearchTree> bstList = new ArrayList<BinarySearchTree>();
		bstList = (ArrayList<BinarySearchTree>) bst.toList();
		System.out.println("The list in ascending order:\n" + bstList.toString());
		
		//INORDER TO STRING METHOD
		System.out.println("\nThe list in organized inorder:\n" + bst.inorderToString());
	}
}
