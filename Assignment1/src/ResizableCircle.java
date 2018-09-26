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
  
  //no arg constructor
  public ResizableCircle(){
    super();
    color = Color.RED;
    cir = new Ellipse(200, 500, 100, 100);
    cir.setFill(Color.GREEN);
    cir.setStroke(Color.YELLOW);
  }
  
  //parametrized constructor
  public ResizableCircle(double xLoc, double yLoc, double radius, Color c){
   super(xLoc, yLoc, radius);
   color = c;
   cir = new Ellipse(xLoc, yLoc, radius, radius);
   cir.setFill(color);
   cir.setStroke(c);
   
  }
  
  
/********METHODS*************/
 
  
  //@Override
  public double getPerimeter(){
    return(2 * (getPi() * getRadius())); 
  }
  
  @Override
  public void resize(){}
  
  public Ellipse draw(){
    //Group circle = new Group();
    //cir.setFill(color);
    //circle.getChildren().add(cir);
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