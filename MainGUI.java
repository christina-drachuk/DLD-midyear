import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.event.ActionEvent;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
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

import java.io.FileNotFoundException;

import javafx.*;


public class MainGUI extends Application {
private Stage stage;
private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage arg0) throws Exception {
        stage = arg0;
        arg0.setTitle("4 Wits");

        StackPane layout = new StackPane();
        layout.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));

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

       // stage.setScene(scene);
       Scene scene = new Scene(layout, 1250, 700);

        door1.setOnAction( e -> {
            System.out.println("clicked!");
            try {
                stage.setScene(Scene1.getScene1(stage, scene));
             } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            }
        );
        
        door2.setOnAction( e -> {
            System.out.println("clicked!");
            stage.setScene(Scene2.getScene2());
            }
        );

        door3.setOnAction( e -> {
            System.out.println("clicked!");
            stage.setScene(Scene3.getScene3(stage));
            }
        );

        door4.setOnAction( e -> {
            System.out.println("clicked!");
            try {
                stage.setScene(Scene4.getScene4());
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            }
        );

        //Image img = new Image("brick.jpg");
        //ImageView iv3 = new ImageView();
        //iv3.setImage(img);
        //Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
        //iv3.setViewport(viewportRect);
        //BackgroundImage bImg = new BackgroundImage(img,
                                                   //BackgroundRepeat.NO_REPEAT,
                                                   //BackgroundRepeat.NO_REPEAT,
                                                   //BackgroundPosition.DEFAULT,
                                                   //BackgroundSize.DEFAULT);
                                                   
        //Background bGround = new Background(bImg);
        //new BackgroundSize(1250, 700, true, true, true))));
        //layout.setBackground(bGround);
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
