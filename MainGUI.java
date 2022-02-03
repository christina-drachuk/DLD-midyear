import javafx.application.Application;
import javafx.event.ActionEvent;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
        
        Button door1 = makeDoors(layout, 250, 400, -450, "Scary");
        Button door2 = makeDoors(layout, 250, 400, -150, "Not scary at all");
        Button door3 = makeDoors(layout, 250, 400, 150, "WARNING DO NOT ENTER");
        Button door4 = makeDoors(layout, 250, 400, 450, "Enter please :)");
        Font font = Font.font("Courier New", FontWeight.BOLD, 16);

        door1.setStyle("-fx-background-color: #8FBC8F");
        door2.setStyle("-fx-background-color: #B0C4DE");
        door3.setStyle("-fx-background-color: #9370DB");
        door4.setStyle("-fx-background-color: #D8BFD8");

        door1.setFont(font);
        door2.setFont(font);
        door3.setFont(font);
        door4.setFont(font);









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

        
        @Override
        public void handle(ActionEvent actionEvent) {
                
        }
        

}
