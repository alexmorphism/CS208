/*
 * Alexandre Castro
 * 09/20/18
 */
public abstract class Circle implements GeometricObject{
  private final double PI = 3.14;
  private double radius;
  
  //no arg constructor
  public Circle (){
    radius = 2;
  }
  
  //parametrized constructor
  public Circle(double r){
    radius = r; 
  }
  
  /* returns the area of a circle
   * depending on the size of the radius
   */
  public double getArea(){
    return (PI * (radius * radius)); 
  }
  
  public double getPi(){
    return PI; 
  }
  
  public double getRadius(){
    return radius;
  }
  
  public void setRadius(double r){
    radius = r; 
  }
  
//abstract method
  public abstract double getPerimeter();
  
  
  /**** ****/
  
  @Override
  public String toString(){
    return "The radius is: " + radius + "\n PI is: " + PI ; 
  }
  
  @Override
  public boolean equals(Object obj){
    if(obj == this) return true;
    if(obj == null) return false;
    
    if(this.getClass() == obj.getClass()){
      Circle other = (Circle) obj;
      return radius == other.radius;
    }else{
      return false;
    }
  }
  
}//end Circle



