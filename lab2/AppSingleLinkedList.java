/* Alexandre Castro
 * 09/18/18
 * Lab 2
*/

public class AppSingleLinkedList{
  public static void main(String[] args){
   SingleLinkedList list = new SingleLinkedList();
  
   try{
     ///adds elements to the list
     list.add("Vrej");
     list.add("Alex");
     list.add("Abby");
     list.add("Joe");
     list.add(127);
     list.add("Maria");
     list.add("Marly");
     list.add("Martin");
     
     list.set(5, "Paulo");
     list.add(4, "Sam");
     
     list.remove(1);
     list.remove("Martin");
     

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
     System.out.println("Index 4 we have the item: " + list.get(4));
     System.out.println("\n" +list.toString());
   }    
  }
}