import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CDAlertBox extends Application{

    Button button;
    Label label;
    public static void main(String[] args) {
        launch(args); // call launch, go into app, and set up program as javafx app    

    }

    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("Title of the window");
        button = new Button("Click here!");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 400, 300);
        arg0.setScene(scene);
        arg0.show();
    }
}
