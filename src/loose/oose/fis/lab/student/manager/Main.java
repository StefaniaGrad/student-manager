package loose.oose.fis.lab.student.manager;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		   Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
		   primaryStage.setTitle("FIS - Student Manager");
		   primaryStage.setScene(new Scene(root, 600, 400));
		   primaryStage.show();
		}

	public static void main(String[] args) {
		System.out.println("hello");
		launch(args);
	}
}
