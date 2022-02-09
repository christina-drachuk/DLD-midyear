import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Scene1 {
    
    public static Scene getScene1() throws FileNotFoundException {            
        
        VBox layout1 = new VBox();
        Scene scene1 = new Scene(layout1, 1300, 700);
        
        Label label1 = new Label("Riddles");
        Label enterLabel = new Label("welcome to the riddles bro");
        enterLabel.setTranslateX(100);
        enterLabel.setTranslateY(100);

        // Image image = new Image("tringus.png");
        // ImageView iv1 = new ImageView();
        // iv1.setImage(image);
        InputStream stream = new FileInputStream("images/tringus.png");
        Image image = new Image(stream);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        // TODO: finish InputStream

        // TODO: how to organize this (keep in this file or put in maingui?)
        String[] riddles = {"The current and tide obey my command, yet, I am hardly seen by man. Spotted and speckled, but by the sun I proudly reflect. What am I?",
                            "What has roots, as nobody sees, is taller than trees, up, up it goes, yet it never grows?", 
                            "It cannot be seen, cannot be felt, cannot be heard, cannot be smelt. It lies behind stars and under hills, and empty holes it fills. It comes out first and follows after, ends life and kills laughter.",
                            "Alive without breath, as cold as death, never thirsty, always drinking, all in mail never clinking.",
                            "What do you call a cow with no legs?", "What has one eye but can't see?", "The more you take, the more you leave behind. What am I?",
                            "What first walks on four, then on two, and then on three?"};

        String[] answers = {"The moon", "A mountain", "Darkness", "A fish", "Ground beef", "A needle", "Footsteps", "A human",};

        layout1.getChildren().addAll(iv1);

        layout1.getChildren().addAll(label1);
        layout1.getChildren().addAll(enterLabel);
        
        return scene1;
    }
}
