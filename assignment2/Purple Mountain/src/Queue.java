/* Queue.java
 * @author a_castro4
 * 
 * 
 */
public class Queue {
    private int front;
    private int rear;
    private int nItems;
    private int maxSize;
    private Object [] queueArray;
    
    
    public Queue(int size){
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.queueArray = new Object[size];
    }
    
    public void insert(Object obj){ //insert an object in the queue. First come first serve
        
        if(isFull()){
            System.out.println("The line to go hiking for the day is FULL!");
        }else{
            rear++;
            queueArray[rear] = obj;
            nItems++;
        }
    }
    
    public Object remove(){ //removes an item from the queue, increase the front variable to point to the next in line.
        Object temp = queueArray[front];
        front++;
        
        if(isEmpty()){//if it reach the end of line and there is no one else to be removed. resuse the Array.
            System.out.println("There are no more people in the queue");
        }
        nItems--;
        
        return temp;
    }
    
    public Object peekFront(){ //looks at the first item on the queue
        Object temp = queueArray[front];
        
        return temp;
    }
    
    public boolean isFull(){ //checks if the queue is full
        return (nItems == maxSize-1);
    }
    
    public boolean isEmpty(){        
        return (nItems == 0);
    }
    
    public void view(){
        System.out.print("[ ");
        
        for(int i = 0; i < queueArray.length; i++){
            System.out.print(queueArray[i]);
        }
        
        System.out.print(" ]");
    }
    
}
