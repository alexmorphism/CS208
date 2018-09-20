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

public class TestResizableCircle extends Application{
  
  Stage window;
  Scene scene;
  
  ResizableCircle c1;
  
  @Override
  public void start(Stage primaryStage){
    window = primaryStage;
    
    window.setTitle("Geometric Sahpes");
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    
    btn.setOnAction(e -> System.out.println("You did it!!"));
    
    //StackPane layout = new StackPane();
    //layout.getChildren().add(btn);
    
    VBox vbox = new VBox(20);
    vbox.getChildren().add(btn);
    
    scene = new Scene(vbox, 1200, 800); //creates a scene with an adequate size
    window.setScene(scene);
    window.show();
    
  }
  public static void main(String[] args){
   launch(args); 
  }
}