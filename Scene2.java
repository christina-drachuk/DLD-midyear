// import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.scene.layout.VBox;

// public class Scene2 {
//     public static VBox layout2 = new VBox();
//     public static Scene scene2 = new Scene(layout2, 1300, 700);

//     public static Scene getScene2() {            
//         Label label2 = new Label("This is the second scene");
//         layout2.getChildren().addAll(label2);
//         return scene2;
//     }

// }
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Scene2 extends Application {

    public static Scene getScene2(){
        VBox root = new VBox();
        // StackPane root = new StackPane();
        Scene scene2 = new Scene(root, 1300, 700);
        BorderPane layout13 = new BorderPane();
        root.setBackground(new Background(new BackgroundImage(new Image("images/triviabackground.jpg"),
        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
        new BackgroundSize(1750, 800, true, true, true, true))));
        // Image img = new Image("");
        // BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, null, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        // Background bGround = new Background(bImg);
        // root.setBackground(bGround);

        Label titleLabel = new Label("Welcome to Trivia!");
        titleLabel.setTranslateX(50);
        titleLabel.setTranslateY(10);
        titleLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 35));
        titleLabel.setTextFill(Color.web("#E6E6FA"));

        // Label subLabel = new Label("Are you smarter than an 8th grader??");
        // subLabel.setTranslateX(200);
        // subLabel.setTranslateY(20);

        ArrayList<String> triviaqs = new ArrayList<String>(Arrays.asList("What does “www” stand for in a website browser?", "How long is an Olympic swimming pool (in meters)?", 
            "Which animal can be seen on the Porsche logo?", "What is 'cynophobia'?", "What is the name of the  biggest technology company in South Korea?", "Who was the first woman to win a Nobel Prize (in 1903)?", 
            "Who was the first woman pilot to fly solo across the Atlantic?", "What was the first soft drink in space?",
            "Which is the only edible food that never goes bad?", "What was the first toy to be advertised on television?",
            "What are the names of Cinderella’s stepsisters?", "Which two countries have not missed one of the modern-day Olympics?",
            "Which woman has won the most tennis grand slam titles?"));

        ArrayList<String> answers = new ArrayList<String>(Arrays.asList("World Wide Web", "50 meters", "Horse", "Fear of dogs", "Samsung", "Marie Curie", "Amelia Earhart", "Coca Cola",
                            "Honey", "Mr Potato Head from Toy Story", "Anastasia and Drizella", "Greece and Australia", "Serena Williams"));

        ArrayList<String> ansopt1 = new ArrayList<String>(Arrays.asList("Wide World Web", "100 meters", "Goat", "Fear of sinuses", "Apple", "Malala", "Rosa Parks", "Sprite", "Cheese", "Barbie", "Mary and Ella", "China & America", "Maria Sharapova"));
        ArrayList<String> ansopt2 = new ArrayList<String>(Arrays.asList("World's Wide Web", "100 feet", "Dog", "Fear of spiders", "Google", "Bertha von Suttne", "Jane Addams", "Lemonade", "Chocolate", "Quick Sketch", "Abigal and Drardia", "Russia and Australia", "Billie Jean King"));
        ArrayList<String> ansopt3 = new ArrayList<String>(Arrays.asList("Wilson World Wide", "1000 feet", "Llama", "Fear of hyenas", "Windows", "Jane Addams", "Malala", "Fanta", "Pasta", "Easy-Bake Oven", "Anastasia and Ella", "Prussia and Sweden", "Venus Williams"));
    
        ArrayList<ArrayList> ansopt = new ArrayList<ArrayList>();

        ansopt.add(ansopt1);
        ansopt.add(ansopt2);
        ansopt.add(ansopt3);

        root.getChildren().addAll(titleLabel);  
        // root.getChildren().addAll(subLabel);

        int random = (int) (Math.random() * triviaqs.size());
        IntegerProperty money = new SimpleIntegerProperty(0);
        IntegerProperty numQ = new SimpleIntegerProperty(50);

        Label current = new Label();
        current.setFont(Font.font ("Courier New", FontWeight.BOLD, 25));
        current.setTranslateX(400);
        current.setTranslateY(500);
        current.setTextFill(Color.web("#E6E6FA"));

        Label triviaLabel = new Label(triviaqs.get(random));
        triviaLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 25));
        triviaLabel.setTranslateX(250);
        triviaLabel.setTranslateY(25);
        triviaLabel.setTextFill(Color.web("#E6E6FA"));

        Label moneyLabel = new Label("$" + money.getValue().toString());
        moneyLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 30));
        moneyLabel.setTranslateX(1350);
        moneyLabel.setTranslateY(75);
        moneyLabel.setTextFill(Color.web("#E6E6FA"));

        root.getChildren().addAll(current);
        root.getChildren().addAll(moneyLabel);
        root.getChildren().addAll(triviaLabel);
        
        RadioButton rb0 = new RadioButton(answers.get(random));
        rb0.setFont(Font.font ("Courier New", FontWeight.BOLD, 25));
        rb0.setTranslateX(400);
        rb0.setTextFill(Color.web("#E6E6FA"));

        RadioButton rb1 = new RadioButton(ansopt1.get(random));
        rb1.setFont(Font.font ("Courier New", FontWeight.BOLD, 25));
        rb1.setTranslateX(400);
        rb1.setTextFill(Color.web("#E6E6FA"));

        RadioButton rb2 = new RadioButton(ansopt2.get(random));
        rb2.setFont(Font.font ("Courier New", FontWeight.BOLD, 25));
        rb2.setTranslateX(400);
        rb2.setTextFill(Color.web("#E6E6FA"));

        RadioButton rb3 = new RadioButton(ansopt3.get(random));
        rb3.setFont(Font.font ("Courier New", FontWeight.BOLD, 25));
        rb3.setTranslateX(400);
        rb3.setTextFill(Color.web("#E6E6FA"));

        triviaqs.remove(random);
        answers.remove(random);
        ansopt1.remove(random);
        ansopt2.remove(random);
        ansopt3.remove(random);

        ToggleGroup group = new ToggleGroup();
        rb0.setToggleGroup(group);
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        ArrayList<RadioButton> buttons = new ArrayList<>();
        buttons.add(rb0);
        buttons.add(rb1);
        buttons.add(rb2);
        buttons.add(rb3);

        //scramble the list
        for (int i = 0; i < buttons.size() - 1; i++) {
            // Get a random index j from [i, arr.length)
            RadioButton temp = buttons.get(i);
            int j = i + (int) (Math.random() * (buttons.size() - i));

            // swap the values stored at i and j
            buttons.set(i, buttons.get(j));
            buttons.set(j, temp);
        }

        root.getChildren().addAll(buttons);
        buttons.get(0).setTranslateY(75);
        buttons.get(1).setTranslateY(125);
        buttons.get(2).setTranslateY(175);
        buttons.get(3).setTranslateY(225);
        
    // if (!(numQ.equals(0))) {
    //     int rand1 = (int) (Math.random() * triviaqs.length);
    //     current.setText(triviaqs[rand1]);
    //     rb0.setText(answers[rand1]);
    //     triviaqs[rand1] = null;
    //     answers[rand1] = null;
    //     ansopt[0][rand1] = null;
    //     ansopt[1][rand1] = null;
    //     ansopt[2][rand1] = null;
    // }
        rb0.setOnAction( e -> {
            if (rb0.isSelected()) {
                if (triviaqs.size() > 0) {
                    money.set(money.get() + 200);
                    moneyLabel.setText("$" + money.getValue().toString());
                    current.setText("Yay! You got it right! Good job :)");
                    // root.getChildren().addAll(current);
                    int rand1 = (int) (Math.random() * (triviaqs.size()));
                    rb0.setSelected(false);
                    triviaLabel.setText(triviaqs.get(rand1));
                    rb0.setText(answers.get(rand1));
                    rb1.setText(ansopt1.get(rand1));  
                    rb2.setText(ansopt2.get(rand1));
                    rb3.setText(ansopt3.get(rand1));
                    triviaqs.remove(rand1);
                    answers.remove(rand1);
                    ansopt1.remove(rand1);
                    ansopt2.remove(rand1);
                    ansopt3.remove(rand1);
                }
        //         else{
        //             Button back = new Button("Return to main screen");
        //             back.setFont(Font.font ("Courier New", FontWeight.BOLD, 18));
        //             back.setMaxHeight(250);
        //             back.setMaxHeight(250);
        //             back.setWrapText(true);

        //             back.setOnAction(e -> {
        //                 mainStage.setScene(mainScene);
        //             }
        // );
        //         }
            }
        });
        rb1.setOnAction(e -> {
            if (rb1.isSelected()) {
                if (triviaqs.size() > 0) {
                    current.setText("Sorry you got it wrong. Better luck next time!");
                    // root.getChildren().addAll(current);
                    int rand1 = (int) (Math.random() * (triviaqs.size()));
                    rb1.setSelected(false);
                    triviaLabel.setText(triviaqs.get(rand1));
                    rb0.setText(answers.get(rand1));
                    rb1.setText(ansopt1.get(rand1));  
                    rb2.setText(ansopt2.get(rand1));
                    rb3.setText(ansopt3.get(rand1));
                    triviaqs.remove(rand1);
                    answers.remove(rand1);
                    ansopt1.remove(rand1);
                    ansopt2.remove(rand1);
                    ansopt3.remove(rand1);
                } 
            }
        });


        rb2.setOnAction(e -> {
            if (rb2.isSelected()) {
                if (triviaqs.size() > 0) {
                    current.setText("Sorry you got it wrong. Better luck next time!");
                    // root.getChildren().addAll(current);
                    int rand1 = (int) (Math.random() * (triviaqs.size()));
                    rb2.setSelected(false);
                    triviaLabel.setText(triviaqs.get(rand1));
                    rb0.setText(answers.get(rand1));
                    rb1.setText(ansopt1.get(rand1));  
                    rb2.setText(ansopt2.get(rand1));
                    rb3.setText(ansopt3.get(rand1));
                    triviaqs.remove(rand1);
                    answers.remove(rand1);
                    ansopt1.remove(rand1);
                    ansopt2.remove(rand1);
                    ansopt3.remove(rand1);
                }
            }
        });
    

        rb3.setOnAction(e -> {
            if (rb3.isSelected()) {
                if (triviaqs.size() > 0) {
                    current.setText("Sorry you got it wrong. Better luck next time!");
                    // root.getChildren().addAll(current);
                    int rand1 = (int) (Math.random() * (triviaqs.size()));
                    rb3.setSelected(false);
                    triviaLabel.setText(triviaqs.get(rand1));
                    rb0.setText(answers.get(rand1));
                    rb1.setText(ansopt1.get(rand1));  
                    rb2.setText(ansopt2.get(rand1));
                    rb3.setText(ansopt3.get(rand1));
                    triviaqs.remove(rand1);
                    answers.remove(rand1);
                    ansopt1.remove(rand1);
                    ansopt2.remove(rand1);
                    ansopt3.remove(rand1);
                }
            }
        });
        
        return scene2;
        }

        private static void rb0(Object object) {
        }

        @Override
        public void start(Stage arg0) throws Exception {
            // TODO Auto-generated method stub

        }
}
