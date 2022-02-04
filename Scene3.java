import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Scene3 {
    public static VBox layout3 = new VBox();
    public static Scene scene3 = new Scene(layout3, 1300, 700);
    public static Scene getScene3() {            
        
        Label label3 = new Label("This is the third Scene");
        layout3.getChildren().addAll(label3);
        return scene3;
    }

}
