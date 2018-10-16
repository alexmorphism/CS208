
import java.util.Arrays;

/**
 * DoubleStack.java
 * @author alexandrecastro
 *
 * DoubleStack should support the methods (peak, pop, push, empty);
 */
public class DoubleStack{
        
    private int maxSize, top1, top2;
    private Object[] albumStack;
    
    /*********CONSTRUCTORS***********/
    public DoubleStack(){
        maxSize = 5;
        top1 = -1;
        top2 = maxSize + 1;
        albumStack[maxSize] = new Object();
    }
    
    public DoubleStack(int size){
        maxSize = size;
        albumStack = new Album[maxSize];
        top1 = -1;
        top2 = maxSize;
        
    }
     
    /***************METHODS*********/
  
    public int getMaxSize(){
        return maxSize;
    }
    
    public int getTop1(){
        return top1;
    }
    
    public int getTop2(){
        return top2;
    }
    
    
    public void push(int index, Object obj){
        if(isFull()){
            System.out.println("The stack is full and can't add anymore items\n");
        }
        else{
            if(index == 1){
                top1++;
                albumStack[top1] = obj;
            }
            else{
                top2--;
                albumStack[top2] = obj;
            }
            
        }
    }
    
    public Object pop(int index){
        if(isEmpty()){
            System.out.println("The stack is empty\n");
            return null;
        }
        else{
            if(index == 1){
                int old_top1 = top1;
                top1--;
                return albumStack[old_top1];
            }
            else if(index == 2){
                int old_top2 = top2;
                top2++;
                return albumStack[old_top2];
            }
        }
        return null;
    }
    
    public Object peak(int index){
        if(isEmpty()){
            System.out.println("The stack is empty, nothing to peak\n");
            return null;
        }
        else{
            if(index == 1){
                return albumStack[top1];
            }
            else if(index == 2){
                return albumStack[top2];
            }
        }
        return null;
    }
    
    
    
    //if the stack is empty it returns true.
    //otherwise returns false.
    public boolean isEmpty(){
        return (top1 <= 0 || top2 > maxSize);
    }
    
    //if the stack is full returns true, otherwise returns false
    public boolean isFull(){
        return albumStack[top1 + 1] != null;
    }
    
    public String[] toStack1(){
        String[] temp = new String[top2-1];
        
        for(int i = 0; i <top2 -1; i++)
            temp[i] = albumStack[i] + "\n";
        return temp;
    }  
    
    public String[] toStack2(){
        int sizeArray = (maxSize - (top2 -1));
        int index = top2-1;
        
        String[] temp = new String[sizeArray];
        
        for(int i = 0; i < sizeArray; i++){
            temp[i] = albumStack[index] +"\n";
            index++;
        }
        return temp;
    }  
    
    
    public String toString(int i){ 
        if(i == 1)
            return  "Number of items on stack1: "+ (top2-1) + "\n\n" + Arrays.toString(toStack1());
        else if(i == 2)
            return "Number of items on stack2: " +(maxSize - (top2 -1)) + "\n\n" + Arrays.toString(toStack2());
            //return "";
        return null;
    }


}
