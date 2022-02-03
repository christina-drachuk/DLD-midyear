import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Scene2 {
    public static VBox layout2 = new VBox();
    public static Scene scene2 = new Scene(layout2, 1300, 700);
    
    public static Scene getScene2() {            
        Label label2 = new Label("This is the second scene");
        layout2.getChildren().addAll(label2);
        return scene2;
    }

}
