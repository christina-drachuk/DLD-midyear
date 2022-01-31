import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.*;


public class MainGUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("ARGO");
        StackPane layout = new StackPane();
        
        Button door1 = makeDoors(layout, 250, 400, -450, "Click here 1!");
        Button door2 = makeDoors(layout, 250, 400, -150, "Click here 2!");
        Button door3 = makeDoors(layout, 250, 400, 150, "Click here 3!");
        Button door4 = makeDoors(layout, 250, 400, 450, "Click here 4!");

        Scene scene = new Scene(layout, 1250, 700);
        arg0.setScene(scene);
        arg0.show();
    }

    public Button makeDoors(StackPane layout, int width, int length, int translate, String message){
        Button door = new Button(message);
        door.setPrefSize(width, length);
        door.setTranslateX(translate);
        layout.getChildren().add(door);
        return door;
        }

}
