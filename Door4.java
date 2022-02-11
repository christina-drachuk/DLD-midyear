import javafx.application.Application;
import javafx.scene.Node;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.FileInputStream;


public class Door4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("TIC-TAC-TOE");
        StackPane layout = new StackPane();
        
        
        Button btn1 = makeButtons(layout, 90, 90, -96, 96, "Click here 1!");
        Button btn2 = makeButtons(layout, 90, 90, 0, 96,"Click here 2!");
        Button btn3 = makeButtons(layout, 90, 90, 96, 96, "Click here 3!");
        Button btn4 = makeButtons(layout, 90, 90, -96, 0, "Click here 4!");
        Button btn5 = makeButtons(layout, 90, 90, 0, 0,"Click here 5!");
        Button btn6 = makeButtons(layout, 90, 90, 96, 0, "Click here 6!");
        Button btn7 = makeButtons(layout, 90, 90, -96, -96, "Click here 7!");
        Button btn8 = makeButtons(layout, 90, 90, 0, -96,"Click here 8!");
        Button btn9 = makeButtons(layout, 90, 90, 96, -96, "Click here 9!");
        
        FileInputStream inputstream = new FileInputStream("C:\\downloads\\bigBlueX.png"); 
        Image redx = new Image(inputstream);
        ImageView imageView = new ImageView(redx); 
        

        Scene scene = new Scene(layout, 1250, 700);
        arg0.setScene(scene);
        arg0.show();

        btn1.setOnAction(e -> {
            actionSequence(btn1, imageView);
        });
        btn2.setOnAction(e -> {
            actionSequence(btn2, imageView);
        });
        btn3.setOnAction(e -> {
            actionSequence(btn3, imageView);
        });
        btn4.setOnAction(e -> {
            actionSequence(btn4, imageView);
        });
        btn5.setOnAction(e -> {
            actionSequence(btn5, imageView);
        });
        btn6.setOnAction(e -> {
            actionSequence(btn6, imageView);
        });
        btn7.setOnAction(e -> {
            actionSequence(btn7, imageView);
        });
        btn8.setOnAction(e -> {
            actionSequence(btn8, imageView);
        });
        btn9.setOnAction(e -> {
            actionSequence(btn9, imageView);
        });
        

    }


    public Button makeButtons(StackPane layout, int width, int length, int translateX, int translateY, String message){
        Button door = new Button(message);
        door.setPrefSize(width, length);
        door.setTranslateX(translateX);
        door.setTranslateY(translateY);
        layout.getChildren().add(door);
        return door;
        }
    public <Imageview> void actionSequence(Button btn, Imageview imgvw){
            btn.setTranslateX(20000);
            btn.setManaged(false);
            btn.setDisable(true);
            ((Node) imgvw).setTranslateX(96);
            ((Node) imgvw).setTranslateY(-96);
        
    }
    
}
