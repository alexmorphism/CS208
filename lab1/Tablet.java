//Alexandre Castro
public class Tablet extends Computer{
  
  private double screenSize;
  private int size = 0;
  
  public Tablet(String wnc, double cpu, int mem, int hd, double sz){
   super(wnc, cpu, mem, hd);
   screenSize = sz;
  }
  
  public double basePrice(){
    return 50.0;
  }
  
  public double getTotalPrice(){
   return (basePrice() + getMEMPrice() + getWNCPrice() + getHDPrice() + getCPUPrice() + 
           getShippingPrice() + getShippingPrice()); 
  }
  
  public double getShippingPrice(){
   return 5.99; 
  }
  
  public double getScreenSizePrice(int size){
   if(size == 1)
     screenSize = 5.3;
   if(size == 2)
     screenSize = 7.7;
   if(size == 3)
     screenSize = 10.1;
   return(screenSize * 5);
  }
  
  public String toString(){
   return super.toString() + "\nScreen Size: " + screenSize + " = $" + getScreenSizePrice(size) +
     "\nShipping price: = $" + getShippingPrice() +
     "\nTotal Tablet price: = $" + getTotalPrice();
  }
}