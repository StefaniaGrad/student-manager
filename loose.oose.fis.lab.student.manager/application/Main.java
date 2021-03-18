package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		   Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.xml"));
		   primaryStage.setTitle("Student Manager");
		   primaryStage.setScene(new Scene(root, 600, 400));
		   primaryStage.show();
		}

	
	public static void main(String[] args) {
		System.out.println("hello");
		launch(args);
	}
}
