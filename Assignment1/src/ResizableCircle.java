/*
 * Alexandre Castro
 * 09/20/18
 */
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.Node;
import javafx.scene.Group;

public class ResizableCircle extends Circle implements Resizable{
  /***Attributes****/
  private Color color;
  private Ellipse cir;
  private double x;
  private double y;
  
  //no arg constructor
  public ResizableCircle(){
    super();
    x = 50;
    y = 50;
    color = Color.RED;
    cir = new Ellipse(200, 500, 100, 100);
    cir.setFill(Color.GREEN);
    cir.setStroke(Color.YELLOW);
  }
  
  //parametrized constructor
  public ResizableCircle(double radius, double x , double y, Color c){
   super(radius);
   this.x = x;
   this.y = y;
   color = c;
   cir = new Ellipse(x,y, radius, radius);
   cir.setFill(color);
   cir.setStroke(c);
   
  }
  
  
/********METHODS*************/
 
  
  //@Override
  public double getPerimeter(){
    return(2 * (getPi() * getRadius())); 
  }
  
  @Override
  public void resize(){
    setX(x);
    setY(y);
    setRadius(getRadius());
  }
  public double getX(){
      return x;
  }
  
  public double getY(){
      return y;
  }
  
  public double setX(double xNew){
    return x = xNew;      
  }
  
  public double setY(double yNew){
      return y = yNew;
  }

  
  public Ellipse draw(){

    return cir;
  }
  
  @Override
  public String toString(){
    return super.toString() + "\n"; 
  }
}

//@Override
//public boolean equals(){
//  
//}