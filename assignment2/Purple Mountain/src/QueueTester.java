/**
 * QueueTester.java
 * @author a_castro4
 * This is a class to test the Queue class. It creates Hiker objects and puts the on the queue, testing all of it's methods. 
 * 
 */
public class QueueTester {
   
    public static void main(String[]args){

        Hiker h0 = new Hiker("Alex", 27);
        Hiker h1 = new Hiker("Abby", 22);
        Hiker h2 = new Hiker("John", 18);
        Hiker h3 = new Hiker("Paul", 25);
        Hiker h4 = new Hiker("Ringo", 26);

        Queue myQueue =  new Queue(5);

        myQueue.insert(h0);
        myQueue.insert(h1);
        myQueue.insert(h2);
        myQueue.insert(h3);
        myQueue.insert(h4);//full
        myQueue.insert(h0);//full
        myQueue.insert(h0);//full
        
        System.out.println("Hello anybody");
        System.out.println("HEKKI" + myQueue.peekFront());
    
        //myQueue.view();
    }
    
    
}
