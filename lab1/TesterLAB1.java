//Alexandre Castro
import java.util.ArrayList;

public class TesterLAB1{
  public static void main(String[] args){
    ArrayList<Computer> list = new ArrayList<Computer>();
    
    list.add(new Tablet("slow", 1.1, 4, 32, 1));
    list.add(new Tablet("moderate", 2.3, 8, 64, 2));
    list.add(new Tablet("fast", 3.1, 16, 128, 2));
    
    list.add(new Laptop("slow", 1.1, 4, 128, 1));
    list.add(new Laptop("moderate",3.4, 16, 256, 1));
    list.add(new Laptop("moderate",3.8, 32, 512, 1));
    
    
    for(Computer item: list)
      System.out.println(item.toString()+"\n");
  }
}