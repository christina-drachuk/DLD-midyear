import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Door2 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("TRIVIA");
        StackPane format = new StackPane();
        Scene scene1 = new Scene(format, 1250, 700);

        Button sbtn1 = makeButtons(format, 220, 220, -450, 0, "Click here 1!");
        Button sbtn2 = makeButtons(format, 220, 220, -200, 0,"Click here 2!");
        Button sbtn3 = makeButtons(format, 220, 220, 50, 0, "Click here 3!");
        Button sbtn4 = makeButtons(format, 220, 220, 300, 0, "Click here 4!");

        arg0.setScene(scene1);
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
