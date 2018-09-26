/* AppShape.java
 * 
 * Alexandre Castro
 * 09/20/18
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import static javafx.scene.input.MouseEvent.MOUSE_CLICKED;
import static javafx.scene.input.MouseEvent.MOUSE_DRAGGED;

public class TestResizableCircle extends Application{
  
  Stage window;
  Scene scene;
  Group root;
  
  ResizableCircle c1 = new ResizableCircle(50,100,150, Color.GREEN);
  double xLoc, yLoc, radius;
  
  //Ellipse e1 = new Ellipse(50,50,50,50);
  
  @Override
  public void start(Stage primaryStage){
    window = primaryStage;
    
    window.setTitle("Geometric Sahpes");
    Button btn = new Button();
    //btn.setText("Say 'Hello World'");
    //btn.setOnAction(e -> System.out.println("You did it!!"));
    //StackPane layout = new StackPane();
    //layout.getChildren().add(btn);

    //c1.draw().addEventFilter(MOUSE_CLICKED, eventHandler);
    

    c1.draw().addEventHandler(MOUSE_CLICKED, new EventHandler<MouseEvent>()
    {
        @Override
        public void handle(MouseEvent event){
           xLoc = c1.getX() +  event.getX();
           yLoc = c1.getY() + event.getY();
           radius = c1.getRadius() ;
           //System.out.println("test");  
        }
    });
    
    c1.draw().addEventHandler(MOUSE_DRAGGED, new EventHandler<MouseEvent>(){
        @Override
        public void handle(MouseEvent event){
            c1.setX(xLoc);
            c1.setY(yLoc);
            c1.setRadius(radius);
            root.getChildren().add(c1.draw());
        }
    });
            
    root = new Group();
    root.getChildren().add(c1.draw());
    //root.getChildren().add(c2.draw());
    
    //VBox vbox = new VBox(20);
    //vbox.getChildren().add(btn);
    
    scene = new Scene(root, 1200, 800); //creates a scene with an adequate size
    window.setScene(scene);
    window.show();
    
  }
  public static void main(String[] args){
   launch(args); 
  }
}