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
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.*;

public class Door3 extends MainGUI {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("ARGO");
        StackPane layout = new StackPane();

      
        Text text1 = new Text("\n\n       So.... you have decided to enter through\n       this door even though I specifically warned\n       you not to. Well, there is no going back now\n       so why not test your worthinessto see if you\n       can passn through and escape this challenge.");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 35));
        text1.setFill(Color.BLACK);
        StackPane.setAlignment(text1, Pos.TOP_CENTER);
        // layout3.getChildren().addAll(text1);

        VBox vbox1 = new VBox();
        VBox vbox2 = new VBox();
        Scene scene1 = new Scene(vbox1, 1300, 700);
        Scene scene2 = new Scene(vbox2, 1300, 700);

        //button1
        Button button1 = new Button("Continue");
        button1.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        button1.setFont(font);
        button1.setTranslateX(150);
        button1.setTranslateY(350);
        button1.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        // layout3.getChildren().addAll(button1);
        // button1.setOnAction(e -> stage.setScene(scene1));
         


        //button2
        Button button2 = new Button("Exit");
        button2.setPrefSize(200, 60); 
        Font font2 = Font.font("Courier New", FontWeight.BOLD, 15);
        button2.setFont(font2);
        button2.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        button2.setTranslateX(100);
        button2.setTranslateX(400);
        // layout3.getChildren().addAll(button2);
        //layout3.setAlignment(Pos.BASELINE_RIGHT);
        //layout3.getChildren().addAll(button2);


        // return scene3;
    }

}

//}
