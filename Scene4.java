import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Scene4 {
    public static VBox layout4 = new VBox();
    public static Scene scene4 = new Scene(layout4, 1300, 700);
    public static Scene getScene3() {            
        
        Label label4 = new Label("This is the fourthttttttttt Scene");
        layout4.getChildren().addAll(label4);
        return scene4;
    }

}
