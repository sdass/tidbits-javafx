package com.subra.jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//http://www.ssaurel.com/blog/create-your-first-javafx-8-application-with-eclipse/
//http://docs.oracle.com/javafx/2/get_started/hello_world.htm

public class HelloJavaFxFirst extends Application  {

	public static void main(String[] args) {
		System.out.println("1st");
		launch(args); //if packaged then not critical
		System.out.println("4th");

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("3rd");
		//ground work.
		// 1. stage already in param 2. scene 3. Node tree (all nodes)
		primaryStage = new Stage();
				
		StackPane root = new StackPane();
		
		//node building up
		Button btn1 = new Button("This Hello");
		btn1.setOnAction((e)->{System.out.println("This Hello is clicked!");});
		
		root.getChildren().add(btn1);
		
		Scene scene1 = new Scene(root, 200, 100);
		primaryStage.setTitle("First cup of javaFx");
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene1);
		
		primaryStage.show();
		

		
	}


	
	
	@Override
	public void init(){ //optional
		System.out.println("2nd");	
	}


	
	

}
