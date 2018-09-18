//Alexandre Castro
public class Laptop extends Computer{
  private int dvd; //number of dvd disks
  
  public Laptop(String wnc, double cpu, int mem, int hd, int dvd){
   super(wnc,cpu,mem,hd);
   this.dvd = dvd;
  }
  
  public double basePrice(){
    return 100.0;
  }
  
  public double getTotalPrice(){
   return (basePrice() + getMEMPrice() + getWNCPrice() + getHDPrice() + getCPUPrice() + 
           getShippingPrice() + getShippingPrice()); 
  }
  
  public double getShippingPrice(){
   return 19.99; 
  }
  
  public double getDVDPrice(){
   return (dvd * 39.99); 
  }
  
  public String toString(){
   return super.toString() + "\nDVD: " + dvd + " = $" + getDVDPrice() +
     "\nShipping price: = $" + getShippingPrice() +
     "\nTotal cost price of Laptop: = $" + getTotalPrice();
  }
}