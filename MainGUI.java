import javafx.application.Application;
import javafx.geometry.Pos;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
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
        Text text1 = new Text("\nChoose a door to enter through!");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 35));
        text1.setFill(Color.BLACK);
        StackPane.setAlignment(text1, Pos.TOP_CENTER);
        layout.getChildren().add(text1);


        
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

        VBox layout2 = new VBox();
        VBox layout3 = new VBox();
        VBox layout4 = new VBox();
        VBox layout5 = new VBox();

        Label label1 = new Label("This is the First Scene");
        Label label2 = new Label("This is the First Scene");
        Label label3 = new Label("So you have decided to enter through this door thought we told you not to...\n well there is no going back now so lets test your worthiness");
        Label label4 = new Label("This is the First Scene");

        
        Scene scene1 = new Scene(layout2, 1300, 700);
        door1.setOnAction(e -> arg0.setScene(scene1));

        Scene scene2 = new Scene(layout3, 1300, 700);
        door2.setOnAction(e -> arg0.setScene(scene2));

        Scene scene3 = new Scene(layout4, 1300, 700);
        door3.setOnAction(e -> arg0.setScene(scene3));

        Scene scene4 = new Scene(layout5, 1300, 700);
        door4.setOnAction(e -> arg0.setScene(scene4));

        layout2.getChildren().addAll(label1);
        layout4.getChildren().addAll(label3);


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
