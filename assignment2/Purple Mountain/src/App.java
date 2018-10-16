/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author a_castro4
 */
public class App extends Application {
    
    Stack[] stack = new Stack[5];
    Queue[] queue = new Queue[3];
    
    ArrayList<Integer> random = new ArrayList<Integer>();
    


    @Override
    public void start(Stage primaryStage) {
        
        for(int k = 1; k <= 3; k++){
            random.add(k);
        }
        
        Collections.shuffle(random);
        
        Button start = new Button("Start");
        Button openTrial = new Button("Open Trial");
        Button closeTrials = new Button("Close Trials");
        
        TextArea textArea = new TextArea();
        
        start.setOnAction(e->{
            //System.out.println("Start!");
            int total_hikers = 1;
            for(int i = 0; i < stack.length; i++){
                stack[i] = new Stack(10); //creates stacks
                
                for(int j = 0; j < 10; j++){ //adds 10 Hikers to each stack
                    stack[i].push(new Hiker("Hiker" + total_hikers));
                    String str = ((Hiker)stack[i].peek()).toString();
                    textArea.appendText(str);
                    total_hikers++;
                }
            }
            
            //adds the hikers stack to the queue Randomly
            for(int q = 0; q < 3; q++){
                queue[q] = new Queue(stack[q].getMaxSize());
                //queue[q] = ; 
            }
            
        });
        
        openTrial.setOnAction(e-> System.out.println("Open Trials"));
        closeTrials.setOnAction(e-> System.out.println("Close Trials"));
        
        
        VBox root = new VBox();
        root.getChildren().addAll(textArea, start, openTrial, closeTrials);
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
