import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;


public class Scene3 {
    public void handleCloseButtonAction(ActionEvent stage) {
        ((Stage)(((Button)stage.getSource()).getScene().getWindow())).close();
    }
    public static Scene correctAnswer5(Stage stage) {            
        BorderPane layout12 = new BorderPane();
        Scene scene12 = new Scene(layout12, 1300, 700);
        layout12.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));
            
        Text text1 = new Text("\n\n\t\tCONGRATS!\n\tYour memory skills are a 10/10\n  Congrats on completing the challenge :D");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout12.setTop(text1);

        HBox hb = new HBox();
        layout12.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //back to main screen button
        Button correctButton = new Button("Go back to\nmain screen");
        correctButton.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        correctButton.setFont(font);
        correctButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(correctButton);
        correctButton.setOnAction(e -> stage.setScene(wrongAnswer1(stage)));

        //right button
        Button wrongButton = new Button("Exit");
        wrongButton.setPrefSize(200, 60); 
        wrongButton.setFont(font);
        HBox.setMargin(wrongButton, new Insets(70, 70, 70, 70));
        wrongButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(wrongButton);
        wrongButton.setOnAction((ActionEvent event) -> Platform.exit());
    
        return scene12;
    }
        
    public static Scene correctAnswer4(Stage stage) {            
        BorderPane layout11 = new BorderPane();
        Scene scene11 = new Scene(layout11, 1300, 700);
        layout11.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));
        
        Text text1 = new Text("\n\t     CORRECT AGAIN!\n\t    Very impressive\n Now, if you can answer this last question\n\tthat will be very impressive\n\n\tWhat color was the fourth door?");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout11.setTop(text1);

        HBox hb = new HBox();
        layout11.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //blue button
        Button correctButton = new Button("Blue");
        correctButton.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        correctButton.setFont(font);
        correctButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(correctButton);
        correctButton.setOnAction(e -> stage.setScene(wrongAnswer1(stage)));

        //right button
        Button wrongButton = new Button("Pink");
        wrongButton.setPrefSize(200, 60); 
        wrongButton.setFont(font);
        HBox.setMargin(wrongButton, new Insets(70, 70, 70, 70));
        wrongButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(wrongButton);
        wrongButton.setOnAction(e -> stage.setScene(correctAnswer5(stage)));
    
        return scene11;
    }
    public static Scene correctAnswer3(Stage stage) {            
        BorderPane layout10 = new BorderPane();
        Scene scene10 = new Scene(layout10, 1300, 700);
        layout10.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));
            
        Text text1 = new Text("\t\t CORRECT!\n    Let me guess, you are starting to get\n\t    sick of these blocks.\n\tBut, dont worry this is the\n\t   last block question!\n\n    Was letter F on the right or left?   ");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout10.setTop(text1);

        HBox hb = new HBox();
        layout10.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //left button
        Button correctButton = new Button("Left");
        correctButton.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        correctButton.setFont(font);
        correctButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(correctButton);
        correctButton.setOnAction(e -> stage.setScene(wrongAnswer1(stage)));

        //right button
        Button wrongButton = new Button("Right");
        wrongButton.setPrefSize(200, 60); 
        wrongButton.setFont(font);
        HBox.setMargin(wrongButton, new Insets(70, 70, 70, 70));
        wrongButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(wrongButton);
        wrongButton.setOnAction(e -> stage.setScene(correctAnswer4(stage)));
    

        return scene10;
    }
    public static Scene correctAnswer2(Stage stage) {            
        BorderPane layout9 = new BorderPane();
        Scene scene9 = new Scene(layout9, 1300, 700);
        layout9.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));

    
        Text text1 = new Text("\n\n\t\t CORRECT!\n\tNow, was the purple block on\n\t     the left or right?");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout9.setTop(text1);

        HBox hb = new HBox();
        layout9.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //left button
        Button correctButton = new Button("Left");
        correctButton.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        correctButton.setFont(font);
        correctButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(correctButton);
        correctButton.setOnAction(e -> stage.setScene(correctAnswer3(stage)));

        //right button
        Button wrongButton = new Button("Right");
        wrongButton.setPrefSize(200, 60); 
        wrongButton.setFont(font);
        HBox.setMargin(wrongButton, new Insets(70, 70, 70, 70));
        wrongButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(wrongButton);
        wrongButton.setOnAction(e -> stage.setScene(wrongAnswer1(stage)));
    
        return scene9;
    }

       
    public static Scene question2(Stage stage) {            
        BorderPane layout8 = new BorderPane();
        Scene scene8 = new Scene(layout8, 1300, 700);
        layout8.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));

        Text text1 = new Text("\t\n\n\n    Lets hope you have that memorized\n     Which letter block was green?");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout8.setTop(text1);

        HBox hb = new HBox();
        layout8.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //letter f button
        Button correctButton = new Button("Letter F");
        correctButton.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        correctButton.setFont(font);
        correctButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(correctButton);
        correctButton.setOnAction(e -> stage.setScene(correctAnswer2(stage)));

        //letter c button
        Button wrongButton = new Button("Letter C");
        wrongButton.setPrefSize(200, 60); 
        wrongButton.setFont(font);
        HBox.setMargin(wrongButton, new Insets(70, 70, 70, 70));
        wrongButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(wrongButton);
        wrongButton.setOnAction(e -> stage.setScene(wrongAnswer1(stage)));
        return scene8;
    }

    public static Scene correctAnswer1(Stage stage) {            
        BorderPane layout7 = new BorderPane();
        Scene scene7 = new Scene(layout7, 1300, 700);
        layout7.setBackground(new Background(new BackgroundImage(new Image("blocks.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(100, 150, true, true, true, true))));


        Text text1 = new Text("\n\t\t CORRECT!\n\t   That was easy, right?\n   It won't stay like that for long\n\n  Take a good look at the blocks below");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout7.setTop(text1);

        HBox hb = new HBox();
        layout7.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //continue to question 2 button
        Button contineButton = new Button("Continue");
        contineButton.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        contineButton.setFont(font);
        contineButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(contineButton);
        contineButton.setOnAction(e -> stage.setScene(question2(stage)));

        return scene7;
    }

    public static Scene wrongAnswer1(Stage stage) {            
        BorderPane layout6 = new BorderPane();
        Scene scene6 = new Scene(layout6, 1300, 700);
        layout6.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));

        Text text1 = new Text("\n\n   Oh no! That was the incorrect answer\n   I guess you don't have what it takes");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout6.setTop(text1);
        HBox hb = new HBox();
        layout6.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //return to main screen button
        Button correctButton = new Button("Exit");
        correctButton.setPrefSize(250, 80); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        correctButton.setFont(font);
        correctButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(correctButton);
        correctButton.setOnAction((ActionEvent event) -> Platform.exit());

        //how to go back to main screen
        //correctButton.setOnAction(e -> stage.setScene(start(stage)));

        return scene6;
    }

    public static Scene getNextScene1(Stage stage) {            
        BorderPane layout5 = new BorderPane();
        Scene scene5 = new Scene(layout5, 1300, 700);
        layout5.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));

        Text text1 = new Text("\n    Welcome to the first challenge!\n   You will be tested on your memory.\n   Let's start with an easy question?\n\n What color was the door you went through?");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        layout5.setTop(text1);

        HBox hb = new HBox();
        layout5.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //correct answer button
        Button correctButton = new Button("Purple");
        correctButton.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        correctButton.setFont(font);
        correctButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(correctButton);
        correctButton.setOnAction(e -> stage.setScene(correctAnswer1(stage)));

        //wrong answer button
        Button wrongButton = new Button("Green");
        wrongButton.setPrefSize(200, 60); 
        wrongButton.setFont(font);
        HBox.setMargin(wrongButton, new Insets(70, 70, 70, 70));
        wrongButton.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(wrongButton);
        wrongButton.setOnAction(e -> stage.setScene(wrongAnswer1(stage)));
        
        return scene5;
    }
    public static Scene exitScene(Stage stage) {            
        BorderPane layout4 = new BorderPane();
        Scene scene4 = new Scene(layout4, 1300, 700);
        layout4.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1750, 800, true, true, true, true))));
        Text text1 = new Text("\n\n\tOh... tryna escape I see.\n\tThat's hilarious. There is\n\tno escaping unless you can\n\tcomplete this challenge.");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 50));
        StackPane.setAlignment(text1, Pos.TOP_CENTER);
        layout4.setTop(text1);


        HBox hb = new HBox();
        layout4.setCenter(hb);
        hb.setAlignment(Pos.CENTER);

        //goback button
        Button goback = new Button("Go Back");
        goback.setPrefSize(250, 80); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        goback.setFont(font);
        goback.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(goback);
        goback.setOnAction(e -> stage.setScene(getScene3(stage)));
         
        return scene4;
    }


    public static Scene getScene3(Stage stage) {            
         BorderPane layout3 = new BorderPane();
         Scene scene3 = new Scene(layout3, 1300, 700);
         layout3.setBackground(new Background(new BackgroundImage(new Image("brick.jpg"),
            BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
            new BackgroundSize(1300, 700, true, true, true, true))));

        
        Text text1 = new Text("\n\n        So.... you have decided to enter through\n       this door even though I specifically warned\n       you not to. Well, there is no going back now\n       so why not test your worthiness to see if you\n       can pass through and escape this challenge.");
        text1.setFont(Font.font ("Courier New", FontWeight.BOLD, 35));
        text1.setFill(Color.BLACK);
        StackPane.setAlignment(text1, Pos.TOP_CENTER);
        layout3.setTop(text1);

        HBox hb = new HBox();
        layout3.setCenter(hb);
        hb.setAlignment(Pos.CENTER);


        //button1
        Button button1 = new Button("Continue");
        button1.setPrefSize(200, 60); 
        Font font = Font.font("Courier New", FontWeight.BOLD, 15);
        button1.setFont(font);
        button1.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        hb.getChildren().addAll(button1);
        button1.setOnAction(e -> stage.setScene(getNextScene1(stage)));
         


        //button2
        Button button2 = new Button("Exit");
        button2.setPrefSize(200, 60); 
        Font font2 = Font.font("Courier New", FontWeight.BOLD, 15);
        button2.setFont(font2);
        button2.setStyle("-fx-border-color: #9370DB; -fx-border-width: 5px;");
        HBox.setMargin(button2, new Insets(70, 70, 70, 70));
        hb.getChildren().addAll(button2);
        button2.setOnAction(e -> stage.setScene(exitScene(stage)));

        


        return scene3;
    }
    

}
