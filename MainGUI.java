import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainGUI extends Application {
    public static void main(String[] args) {
        
    }
    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("This is the title of the window we can change it later");
        StackPane layout = new StackPane();
        // layout.getChildren().add(whatever widget we need);

        Scene scene = new Scene(layout, 400, 300);
        arg0.setScene(scene);
        arg0.show();
    }
}
