import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
// import javafx.scene.layout.ColumnConstraints;
// import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Scene1 {
    
    public static Scene getScene1(Stage mainStage, Scene mainScene) throws FileNotFoundException {
        HBox root = new HBox();            
        Scene scene1 = new Scene(root, 1300, 700);
        GridPane layout0 = new GridPane();
        GridPane layout1 = new GridPane();
        
        // RowConstraints rowConstraints = new RowConstraints(100);
        // layout1.getRowConstraints().add(rowConstraints);
        // ColumnConstraints colConstraints = new ColumnConstraints(100);
        // layout1.getColumnConstraints().add(colConstraints);
        
        Label label1 = new Label("Dungeon of Riddles");
        Label label2 = new Label("In order to pass through his dungeon, you must answer the harrowing riddles of Tringus...");
        Label label3 = new Label("There are 10 riddles; you have 3 tries for each, and you need 7 points to pass. Good luck.");
        label1.setFont(Font.font ("Courier New", FontWeight.BOLD, 25));
        label2.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
        label3.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));




        Label questionLabel = new Label("Riddle:");
        questionLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
        Label successState = new Label();

        Button back = new Button("Return to main screen");
        back.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
        back.setMaxHeight(250);
        back.setMaxHeight(250);
        back.setWrapText(true);

        back.setOnAction( e -> {
            mainStage.setScene(mainScene);
        }
        );
        
        
        StringProperty correctAnswer = new SimpleStringProperty("");
        IntegerProperty triesLeft = new SimpleIntegerProperty(3);
        IntegerProperty maxQuestions = new SimpleIntegerProperty(10);
        IntegerProperty userPoints = new SimpleIntegerProperty(0);
        
        // TODO: formatting
        InputStream stream = new FileInputStream("images/tringus.png");
        Image image = new Image(stream);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        root.getChildren().addAll(layout0);
        root.getChildren().addAll(layout1);

        ArrayList<String> riddles = new ArrayList<String>(
            Arrays.asList("The current and tide obey my command, yet, I am hardly seen by man. Spotted and speckled, but by the sun I proudly reflect. What am I?",
            "What has roots, as nobody sees, is taller than trees, up, up it goes, yet it never grows?", 
            "It cannot be seen, cannot be felt, cannot be heard, cannot be smelt. It lies behind stars and under hills, and empty holes it fills. It comes out first and follows after, ends life and kills laughter.",
            "Alive without breath, as cold as death, never thirsty, always drinking, all in mail never clinking.",
            "What do you call a cow with no legs?", "What has one eye but can't see?", "The more you take, the more you leave behind. What am I?",
            "What first walks on four, then on two, and then on three?", "What always runs but never walks, often murmurs, never talks, has a bed but never sleeps, has a mouth but never eats?",
            "At night they come without being fetched. By day they are lost without being stolen. What are they?",
            "The one who makes it, sells it. The one who buys it, never uses it. The one that uses it never knows that he’s using it. What is it?",
            "What has a head, a tail, is brown, and has no legs?", "What English word has three consecutive double letters?",
            "What is black when you get it, red when you use it, and white when you are all through with it?", "You throw away the outside and cook the inside. Then you eat the outside and throw away the inside. What did you eat?",
            "Until I am measured I am not known, yet how you miss me when I have flown.", "You heard me before, you hear me again, then I die until you call me again.",
            "Say my name and I disappear. What am I?", "Forward, I am heavy, but backwards I am not. What am I?", "I am a box that holds keys without locks, yet they can unlock your soul. What am I?",
            "I'm full of holes, yet I'm full of water. What am I?")
        );


        ArrayList<String> answers = new ArrayList<String>(
            Arrays.asList("moon", "mountain", "darkness", "fish", "ground beef", "needle", "footsteps", "human", "river", "stars",
                            "coffin", "penny", "bookkeeper", "charcoal", "corn", "time", "echo", "silence", "ton", "piano", "sponge"));

        // give user 3 tries to figure out the riddle, if they don't get it then they don't get that point
        // need a certain amount of points to pass the level
        
        layout0.add(label1, 1, 0);
        layout0.add(label2, 1, 2);
        layout0.add(label3, 1, 3);
        layout0.add(iv1, 1, 4);
        
        layout1.add(questionLabel, 1, 2);
        GridPane.setRowIndex(questionLabel, 3);
        
        
        Label currentLabel = new Label();
        currentLabel.setMaxWidth(400);
        currentLabel.setWrapText(true);
        layout1.add(currentLabel, 1, 3);
        GridPane.setRowIndex(currentLabel, 12);

        TextField riddleGuess = new TextField();
        riddleGuess.setMaxWidth(100);
        riddleGuess.setMaxHeight(15);
        layout1.add(riddleGuess, 1, 4);

        Label userPointsLbl = new Label();
        layout1.add(userPointsLbl, 1, 5);
        
        if (!(maxQuestions.equals(0))) {
            int randIndex = (int) (Math.random() * riddles.size());
            currentLabel.setText(riddles.get(randIndex));
            correctAnswer.set(answers.get(randIndex));
            riddles.remove(randIndex);
            answers.remove(randIndex);
            triesLeft.set(3);
            
            maxQuestions.set(maxQuestions.get() - 1);
            System.out.println("this is the maxquestions value: " + maxQuestions.getValue().toString());
        }

        riddleGuess.setOnAction( e -> {
            var userGuess = riddleGuess.getText();
            riddleGuess.clear();
            userPointsLbl.setText("Points: " + userPoints.getValue().toString());
            userPointsLbl.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));


            System.out.println(correctAnswer);
            String expected = correctAnswer.get();

            if (expected.equals(userGuess)) {
                System.out.println("that is so true");
                userPoints.set(userPoints.get() + 1);
                currentLabel.setText("That answer is correct. You have been awarded one point.");
                currentLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
                userPointsLbl.setText("Points: " + userPoints.getValue().toString());
                
                if (maxQuestions.get() == 0 && userPoints.get() >= 7) {
                    currentLabel.setText("Congratulations, you have passed through the dungeon!");
                    currentLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
                    userPointsLbl.setText("Points: " + userPoints.getValue().toString() + "/10");
                    layout1.getChildren().remove(riddleGuess);
                }

                else if (maxQuestions.get() == 0 && userPoints.get() < 7) {
                    userPointsLbl.setText("Points: " + userPoints.getValue().toString() + "/10");
                    currentLabel.setText("Haha! Tringus got you, you shall not pass! Go back to the entrance...");
                    currentLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
                    // TODO add return to maingui button
                    layout1.getChildren().remove(riddleGuess);
                }


                if (!(maxQuestions.get() == 0)) {
                    int randIndex = (int) (Math.random() * riddles.size());
                    currentLabel.setText(riddles.get(randIndex));
                    correctAnswer.set(answers.get(randIndex));
                    riddles.remove(randIndex);
                    answers.remove(randIndex);
                    triesLeft.set(3);
                    
                    maxQuestions.set(maxQuestions.get() - 1);
                    System.out.println("this is the maxquestions value: " + maxQuestions.getValue().toString());
                }
            }

            else if (!(expected.equals(userGuess))) {
                triesLeft.set(triesLeft.get() - 1);
                if (maxQuestions.get() == 0 && userPoints.get() >= 7) {
                    currentLabel.setText("Congratulations, you have passed through the dungeon!");
                    currentLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
                    userPointsLbl.setText("Points: " + userPoints.getValue().toString() + "/10");
                    userPointsLbl.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
                    layout1.getChildren().remove(riddleGuess);
                }

                else if (maxQuestions.get() == 0 && userPoints.get() < 7) {
                    userPointsLbl.setText("Points: " + userPoints.getValue().toString() + "/10");
                    currentLabel.setText("Haha! Tringus got you, you shall not pass! Go back to the entrance...");
                    currentLabel.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
                    // TODO add return to maingui button
                    layout1.getChildren().remove(riddleGuess);
                    layout1.add(back, 1, 6);
                }

                if (triesLeft.get() > 0) {
                    successState.setText("That answer was incorrect! You have " + triesLeft.getValue().toString() + " tries left.");
                    successState.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));

                }
                else {
                    // successState.setText("That answer was incorrect! You have " + triesLeft.getValue().toString() + " tries left.");
                    successState.setText("You have no more tries! Time to move on.");
                    successState.setFont(Font.font ("Courier New", FontWeight.BOLD, 15));
                    if (!(maxQuestions.get() == 0)) {
                        int randIndex = (int) (Math.random() * riddles.size());
                        currentLabel.setText(riddles.get(randIndex));
                        correctAnswer.set(answers.get(randIndex));
                        riddles.remove(randIndex);
                        answers.remove(randIndex);
                        triesLeft.set(3);
                        
                        maxQuestions.set(maxQuestions.get() - 1);
                        System.out.println("this is the maxquestions value: " + maxQuestions.getValue().toString());
                    }
                }
            }

        });

        scene1.setUserData(new QuestionInfo("text", 3));
        layout0.setHgap(10);
        layout0.setVgap(10);
        layout1.setHgap(10);
        layout1.setVgap(10);

        return scene1;
    }
}