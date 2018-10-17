/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
//import ArrayIndexOutOfBoundsException;
/**
 *
 * @author a_castro4
 */
public class App extends Application {
    
    static Stackk[] stack = new Stackk[10];
    Queue[] queue = new Queue[3];
    
    ArrayList<Integer> random = new ArrayList<Integer>();
    static int index = 0;
    int total_hikers = 1;
    
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        for(int k = 0; k < 3; k++){
            random.add(k);
        }
        
        Collections.shuffle(random); //shuffles the numbers from 0 to 2
        
        Button start = new Button("Start");
        Button openTrial = new Button("Open Trial");
        Button closeTrials = new Button("Close Trials");
        
        start.setDisable(false);
        openTrial.setDisable(false);
        closeTrials.setDisable(false);
        
        TextArea textArea = new TextArea();
        
        creatStack(index); //creates a first stack
        
        queue[0] = new Queue(10);
        queue[1] = new Queue(10);
        queue[2] = new Queue(10);
        
        start.setOnAction(e->{
        	try{
        		
	        	if(stack[index].isFull()){               //if the current stack is full adds the stack to a queue randomly
	        		int ran = (int)(Math.random()*3);       //creates another stack to put more hikers
	        		queue[ran].insert(stack[index]);
	        		index++;
	        		creatStack(index);
	        	}	
	        		
	            stack[index].push(new Hiker("Hiker" + total_hikers));
	            String str = ((Hiker)stack[index].peek()).toString();
	            textArea.appendText(str);
	            total_hikers++;
        	}
        	catch(ArrayIndexOutOfBoundsException e1){
        		System.out.println(e1.getMessage());
        	}
           
        });
        
        openTrial.setOnAction(e->{
        	//System.out.println("Open Trials");
        	PrintWriter writer = null;
        	String file_name = "mountain.txt";
        	
        	try {
        		writer = new PrintWriter(file_name);
				
				for (int i = 0; i< queue.length; i++){
					while(!queue[i].isEmpty()){
						Stackk st = (Stackk)queue[i].remove();
						
						while(!st.isEmpty()){
							Object hiker = (Hiker) st.pop();
							writer.println(hiker.toString());
						}
					}
				}
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
        	finally{
        		writer.close();
        	}
        });
        
        
        closeTrials.setOnAction(e->{
        	PrintWriter writer = null;
        	String file_in = "mountain.txt";
        	String file_out = "mountainOUT.txt";
        	String bytes_read;
        	BufferedReader buffer;
        	try{
        		buffer = new BufferedReader(new FileReader(file_in));
        		writer = new PrintWriter(file_out);
        		
        		while((bytes_read = buffer.readLine()) != null){
        			
        			writer.println(bytes_read);
        		}
        	}
        	catch(IOException e1){
        		e1.printStackTrace();
        	}
        	finally{
        		writer.close();
        	}
        	
        	//textArea.clear();
        });
        
        
        VBox root = new VBox();
        root.getChildren().addAll(textArea, start, openTrial, closeTrials);
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setTitle("Purple Mountain");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private static void creatStack(int i){
    	if(index > stack.length)
    		throw new ArrayIndexOutOfBoundsException("Can't create more stacks for the day");
    	else
    		stack[i] = new Stackk(10);
    }
    
}








/*
for(int i = 0; i < stack.length; i++){
    stack[i] = new Stackk(10); //creates stacks
    
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
    for(int w = 0; w < stack.length; w++){
    	queue[q].insert(stack[w]);
    } 
}*/
