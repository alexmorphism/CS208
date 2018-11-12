
public class Application {

	public static void main(String[] args) {
		
		BST tree = new BST();
		tree.insert(50, "Alex"); // me
		
	    tree.insert(40, "Marly"); // mom
		tree.insert(35, "Antonita");//grandmother mom side
		tree.insert(45, "Baltazar");// grandmother mom side
		tree.insert(34, "Joaquina"); // great grandmother mom side
		
		tree.insert(60, "Paulo"); // dad
		tree.insert(55, "Bateria"); //grandfather dad side
		tree.insert(70, "Alcione");// grandmother dad side
		tree.insert(71, "Nhozinho"); // great grandfather dad side
		
		
		//System.out.println(tree.findMin().value);
		//System.out.println(tree.findMax().value);
		
//		System.out.println(tree.remove(10)); // print true
		
//		System.out.println(tree.findMin().key); // 15
//		System.out.println(tree.findMax().key); // 15
		
		// The assignment that follows will complete the body of the method used below.
		tree.displayTree();
		
		
	}

}
