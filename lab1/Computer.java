//Alexandre Castro
public abstract class Computer{
  private String wnc; //wireless network card
  private double cpu;
  private int memory;
  private int hard_disk;
  
  public Computer(){
   this.wnc = "slow";
   this.cpu = 1.1; //in GHz giga hertz
   this.memory = 4; //in GB giga bytes
   this. hard_disk = 32; //in GB giga bytes
  }
  public Computer(String wnc, double cpu, int mem, int hd){
    this.wnc = wnc;
    this.cpu = cpu;
    memory = mem;
    hard_disk = hd;
  }
  
  public abstract double getTotalPrice();
  
  public abstract double basePrice();
  
  //multiplies the number of memory by 20 to get the price of memory
  public double getMEMPrice(){
   return (memory * 20); 
  }
  public double getWNCPrice(){
   if(wnc.equals("slow"))
     return 10.99;
   if(wnc.equals("moderate"))
     return 19.99;
   if(wnc.equals("fast"))
     return 99.99;
   return 0.0;
  }
  
  public double getHDPrice(){
   return (hard_disk * 3); 
  }
  
  public double getCPUPrice(){
   return (cpu * 100); 
  }
  
  public abstract double getShippingPrice();
  
  public String toString(){
   return 
     "WNC: " + wnc + " = $" + getCPUPrice() + 
     "\nCPU: " + cpu + " = $" + getCPUPrice() +
     "\nMemory: " + memory + " = $" + getMEMPrice() +
     "\nHard Disk: " + hard_disk + " = $" + getHDPrice();
  }
  
  public boolean equals(Object obj){
    
  }
}