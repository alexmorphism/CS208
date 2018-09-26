/*
 * Alexandre Castro
 * 09/20/18
 */

//import javafx.scene.shape.Circle;

public abstract class Circle implements GeometricObject{
  private final double PI = 3.14;
  private double radius;
  //private double radiusY;
  private double xLoc;
  private double yLoc;
  
  //no arg constructor
  public Circle (){
    radius = 2;
    xLoc = 50;
    yLoc = 50;
  }
  
  //parametrized constructor
  public Circle(double x, double y, double r){
    radius = r; 
    xLoc = x;
    yLoc = y;
  }
  
  /********************** GETTERS ************************/
  
  /* returns the area of a circle
   * depending on the size of the radius
   */
  public double getArea(){
    return (PI * (radius * radius)); 
  }
  
  public double getPi(){
    return PI; 
  }
  
  public double getX(){
    return xLoc;
  }
  
  public double getY(){
    return yLoc;
  }
  
  public double getRadius(){
    return radius;
  }
  
  
  /****************** SETTERS *****************************/
  
  public void setX(double x){
    xLoc = x;
  }
  
  public void setY(double y){
    yLoc = y;
  }
  
  public void setRadius(double r){
    radius = r; 
  }
  
  
/*************** Abstrac methods ************/
  public abstract double getPerimeter();
  
 
  
  /************************* toString and equals methods****/
  
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



