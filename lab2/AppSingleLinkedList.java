//Alexandre Castro

public class AppSingleLinkedList{
  public static void main(String[] args){
   SingleLinkedList list = new SingleLinkedList();
  
   try{
     list.add(5);
     list.add("Alex");
     list.add("Joe");
     list.add("Abby");
     list.add("Maria");
     list.add("Marly");
     list.add("Martin");
     
     list.set(3, "Paulo");
     list.add(4, "Sam");
     
     //list.remove(0);
     //list.remove("Martin");
     
     System.out.println(list.get(3));
   }
   catch(IndexOutOfBoundsException e){
    System.out.println("Index out of bounds"); 
   }
   catch(NullPointerException e){
    System.out.println(e.getMessage() + " Null pointer"); 
   }
   catch(Exception e){
     System.out.println(e.getMessage());
   }
   finally{
     System.out.println(list.toString());
   }
   
   

    

    
  }
}