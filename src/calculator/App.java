package calculator;

import java.io.IOException;

import calculator.controller.AdvancedViewController;
import calculator.controller.BasicViewController;
import calculator.controller.DeveloperViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {
	
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
		showBasicView();
	}
	
	public void showBasicView() {
		try {
			// Load the view 
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation( App.class.getResource("view/BasicView.fxml") );
			AnchorPane basicView;
			basicView = (AnchorPane) loader.load();
			
			// Create the scene with the view
			Scene scene = new Scene(basicView);
			
			// Establish communication with the controller
			BasicViewController controller = loader.getController();
			controller.setMainApp(this);
			
			// Set the scene into the stage and show
			this.primaryStage.setScene(scene);
			this.primaryStage.setTitle("Calculator");
			this.primaryStage.getIcons().add( new Image("file:resources/images/calculator.png") );
			this.primaryStage.show();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showAdvancedView() {
		try {
			// Load the view 
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation( App.class.getResource("view/AdvancedView.fxml") );
			AnchorPane advancedView;
			advancedView = (AnchorPane) loader.load();
			
			// Create the scene with the view
			Scene scene = new Scene(advancedView);
			
			// Establish communication with the controller
			AdvancedViewController controller = loader.getController();
			controller.setMainApp(this);
			
			// Set the scene into the stage and show
			this.primaryStage.setScene(scene);
			this.primaryStage.setTitle("Calculator");
			this.primaryStage.getIcons().add( new Image("file:resources/images/calculator.png") );
			this.primaryStage.show();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showDeveloperView() {
		try {
			// Load the view 
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation( App.class.getResource("view/DeveloperView.fxml") );
			AnchorPane developerView;
			developerView = (AnchorPane) loader.load();
			
			// Create the scene with the view
			Scene scene = new Scene(developerView);
			
			// Establish communication with the controller
			DeveloperViewController controller = loader.getController();
//			controller.setMainApp(this);
			
			// Set the scene into the stage and show
			this.primaryStage.setScene(scene);
			this.primaryStage.setTitle("Calculator");
			this.primaryStage.getIcons().add( new Image("file:resources/images/calculator.png") );
			this.primaryStage.show();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
