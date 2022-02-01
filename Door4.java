import javafx.application.Application;
import javafx.event.ActionEvent;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.*;


public class Door4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("ARGO");
        StackPane layout = new StackPane();
        
        Button btn1 = makeButtons(layout, 90, 90, -96, 96, "Click here 41!");
        Button btn2 = makeButtons(layout, 90, 90, 0, 96,"Click here 2!");
        Button btn3 = makeButtons(layout, 90, 90, 96, 96, "Click here 3!");
        Button btn4 = makeButtons(layout, 90, 90, -96, 0, "Click here 4!");
        Button btn5 = makeButtons(layout, 90, 90, 0, 0,"Click here 5!");
        Button btn6 = makeButtons(layout, 90, 90, 96, 0, "Click here 6!");
        Button btn7 = makeButtons(layout, 90, 90, -96, -96, "Click here 7!");
        Button btn8 = makeButtons(layout, 90, 90, 0, -96,"Click here 8!");
        Button btn9 = makeButtons(layout, 90, 90, 96, -96, "Click here 9!");
        
        Scene scene = new Scene(layout, 1250, 700);
        arg0.setScene(scene);
        arg0.show();

    }

    public Button makeButtons(StackPane layout, int width, int length, int translateX, int translateY, String message){
        Button door = new Button(message);
        door.setPrefSize(width, length);
        door.setTranslateX(translateX);
        door.setTranslateY(translateY);
        layout.getChildren().add(door);
        return door;
        }

}
