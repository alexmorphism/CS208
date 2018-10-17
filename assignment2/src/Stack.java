/**
 * Stack.java
 * @author alexandrecastro
 *
 * Stack should support the methods (peak, pop, push, empty);
 */
public class Stack{
        
    private int maxSize, top;
    private Object[] stackArray;
    
    /*********CONSTRUCTORS***********/
    public Stack(){
        maxSize = 10;
        top = -1;
        stackArray[maxSize] = new Object();
    }
    
    public Stack(int size){
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
        
    }
     
    /***************METHODS*********/
  
    public int getMaxSize(){
        return maxSize;
    }
    
    public int getTop(){
        return top;
    }

    
    public void push(Object obj){
        if(isFull()){
            System.out.println("The stack is full and can't add anymore items\n");
        }
        else{
            top++;
            stackArray[top] = obj;
        } 
    }
    
    public Object pop(){
        
        if(isEmpty()){
            System.out.println("The stack is empty.");
            return null;
        }
        else{
            int old = top;
            top--;
            return stackArray[old]; 
        }
    }
    
    public Object peek(){
        if(isEmpty()){
            System.out.println("The stack is empty, nothing to peak\n");
            return null;
        }
        else{
            return stackArray[top];
        }
    }
    
    
    //if the stack is empty it returns true.
    //otherwise returns false.
    public boolean isEmpty(){
        return (top == -1);
    }
    
    //if the stack is full returns true, otherwise returns false
    public boolean isFull(){
        return (maxSize -1 == top);
    }
 
    public String toString(){ 
            return  "";

    }


}
