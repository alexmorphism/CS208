/**
 * DoubleStackTeste.java
 * @author alexandrecastro
 * 10-01-18
 * CS208 Data Structures
 */
public class DoubleStackTester {
    public static void main(String[] args){
        
        DoubleStack albumStack = new DoubleStack(10);
        
        albumStack.push(1, new Album("Voyager", 10)); 
        albumStack.push(1, new Album("Random Access Memory", 12));
        albumStack.push(1, new Album("Variables in the Sky", 9));
        
        albumStack.push(1, new Album("Mirage", 3));
        albumStack.push(1, new Album("He.Art", 13));
        albumStack.push(2, new Album("Digital Shock", 3));
  
        albumStack.push(2, new Album("The new order", 7));
        
        albumStack.push(2, new Album("Trance state of mind", 18));
        albumStack.push(2, new Album("2am", 10));
        albumStack.push(2, new Album("Discodelic", 21));
        
        albumStack.push(1, new Album("Free your mind", 5));//tries to add more items to the stack1
        albumStack.push(2, new Album("Ups and Downs", 17)); //tries to add more items to the stack2
        
        
        albumStack.pop(1);
        albumStack.pop(2);
        
        System.out.println("Peaking to stack1");
        System.out.println(albumStack.peak(1).toString());
        System.out.println("Peaking to stack2");
        System.out.println(albumStack.peak(2).toString());
        
        //print items items on both stacks
        System.out.println(albumStack.toString(1));
        System.out.println();
        System.out.println(albumStack.toString(2));      
    }
    
}
