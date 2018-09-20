/*
 * Alexandre Castro
 * 09/20/18
 */
//import javafx.scene.shape.Circle;

public class ResizableCircle extends Circle implements Resizable{
  /***Attributes****/
  private double x;
  private double y;
  
  //no arg constructor
  public ResizableCircle(){
    super();
    this.x  = 50;
    this.y = 50;
  }
  
  //parametrized constructor
  public ResizableCircle(double x, double y, double radius){
   super(radius);
   this.x = x;
   this.y = y;
  }
  
  
/********METHODS*************/
  
  public double getX(){
    return x;
  }
  
  public double getY(){
    return y;
  }
  
  //@Override
  public double getPerimeter(){
    return(2 * (getPi() * getRadius())); 
  }
  
  @Override
  public void resize(){}
  
  
  @Override
  public String toString(){
    return super.toString() + "\n"; 
  }
}

//@Override
//public boolean equals(){
//  
//}