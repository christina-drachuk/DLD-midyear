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
        arg0.setTitle("This is the title of the window we can change it later");
        StackPane layout = new StackPane();

        Button door1 = new Button("Click here! 1");
        door1.setPrefSize(250, 400);
        door1.setTranslateX(-450);
        layout.getChildren().add(door1);

        Button door2 = new Button("Click here! 2");
        door2.setPrefSize(250, 400);
        door2.setTranslateX(-150);
        layout.getChildren().add(door2);

        Button door3 = new Button("Click here! 3");
        door3.setPrefSize(250, 400);
        door3.setTranslateX(150);
        layout.getChildren().add(door3);

        Button door4 = new Button("Click here! 4");
        door4.setPrefSize(250, 400);
        door4.setTranslateX(450);
        layout.getChildren().add(door4);

        Scene scene = new Scene(layout, 1250, 700);
        arg0.setScene(scene);
        arg0.show();
    }
}
