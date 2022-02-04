import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Scene1 {
    public static VBox layout1 = new VBox();
    public static Scene scene1 = new Scene(layout1, 1300, 700);
    public static Scene getScene1() {            
        
        Label label1 = new Label("This is the First Scene");
        layout1.getChildren().addAll(label1);
        return scene1;
    }
}
