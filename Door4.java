import javafx.application.Application;
import javafx.scene.Node;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.PickResult;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.swing.LayoutStyle;

import java.util.ArrayList;



//CASINO STYLE BABY WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO

public class Door4 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("Blackjack");
        StackPane layout = new StackPane();

        String[][] cardNames = {{"2_of_clubs.png", "3_of_clubs.png", "4_of_clubs.png", "5_of_clubs.png","6_of_clubs.png","7_of_clubs.png","8_of_clubs.png","9_of_clubs.png","10_of_clubs.png","jack_of_clubs.png","queen_of_clubs.png","king_of_clubs.png","ace_of_clubs.png"},
                                {"2_of_diamonds.png", "3_of_diamonds.png", "4_of_diamonds.png", "5_of_diamonds.png","6_of_diamonds.png","7_of_diamonds.png","8_of_diamonds.png","9_of_diamonds.png","10_of_diamonds.png","jack_of_diamonds.png","queen_of_diamonds.png","king_of_diamonds.png","ace_of_diamonds.png"},
                                {"2_of_spades.png", "3_of_spades.png", "4_of_spades.png", "5_of_spades.png","6_of_spades.png","7_of_spades.png","8_of_spades.png","9_of_spades.png","10_of_spades.png","jack_of_spades.png","queen_of_spades.png","king_of_spades.png","ace_of_spades.png"},
                                {"2_of_hearts.png", "3_of_hearts.png", "4_of_hearts.png", "5_of_hearts.png","6_of_hearts.png","7_of_hearts.png","8_of_hearts.png","9_of_hearts.png","10_of_hearts.png","jack_of_hearts.png","queen_of_hearts.png","king_of_hearts.png","ace_of_hearts.png",}};
        

        Card[] deckSeen = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deckSeen[index] = new Card(rank, suit);
                index++;
            }
        }

        Card[] deckNum = new Card[52];
        int index2 = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 2; rank <= 10; rank++) {
                deckNum[index2] = new Card(rank, suit);
                index2++;
            }
        }
        int index3 = 35;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank <= 12; rank++) {
                deckNum[index3] = new Card(10, suit);
                index3++;
            }
        }
        int index4 = 47;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank <= 4; rank++) {
                deckNum[index4] = new Card(1, suit);
                index4++;
            }
        }


        play(layout, cardNames);

        compCards(layout, deckNum, cardNames);
        
        Button btn1 = makeButtons(layout, 100, 60, -500, 96, "Hit");
        Button btn2 = makeButtons(layout, 100, 60, 500, 96,"Hold");

        btn1.setOnAction(e -> {
            try {
                giveNewCard(layout, cardNames);
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        
        btn2.setOnAction(e -> {
            
        });
        


        Scene scene = new Scene(layout, 1250, 700);
        arg0.setScene(scene);
        arg0.show();  
        
        
        
    }

    public Button makeButtons(StackPane layout, int width, int length, int translateX, int translateY, String message){
        Button door = new Button(message);
        door.setPrefSize(width, length);
        door.setTranslateX(translateX);
        door.setTranslateY(translateY);
        layout.getChildren().add(door);
        return door;
        }

    public Card[] shuffle(Card[] arr){
        List<Card> list = Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);        
        return arr;
    }
        
    public int compCards(StackPane layout, Card[] deckNum, String[][] cards) throws FileNotFoundException{
        
        shuffle(deckNum);

        InputStream stream = new FileInputStream("images/CardBack.png");
        Image image = new Image(stream);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);

        
        InputStream stream2 = new FileInputStream("images/CardBack.png");
        Image image2 = new Image(stream2);
        ImageView iv2 = new ImageView();
        iv2.setImage(image2);

        layout.getChildren().addAll(iv1);
        layout.getChildren().addAll(iv2);


        if(deckNum[1].rank + deckNum[2].rank <= 16){
            Card card3 = deckNum[3];

            InputStream back3 = new FileInputStream("images/CardBack.png");
            Image imageback3 = new Image(back3);
            ImageView ivback3 = new ImageView();
            ivback3.setImage(imageback3);
            layout.getChildren().addAll(ivback3);

            if(deckNum[1].rank + deckNum[2].rank + card3.rank > 21){

                int suit1 = deckNum[1].suit;
                int suit2 = deckNum[2].suit;
                int suit3 = deckNum[3].suit;

                int rank1 = deckNum[1].rank;
                int rank2 = deckNum[2].rank;
                int rank3 = deckNum[3].rank;

                InputStream stream3 = new FileInputStream("images/" + cards[suit1][rank1].toString());
                Image image3 = new Image(stream3);
                ImageView iv3 = new ImageView();
                iv3.setImage(image3);
                cards[suit1][rank1] = "";

                InputStream stream4 = new FileInputStream("images/" + cards[suit2][rank2].toString());
                Image image4 = new Image(stream4);
                ImageView iv4 = new ImageView();
                iv4.setImage(image4);
                cards[suit2][rank2] = "";

                InputStream stream5 = new FileInputStream("images/" + cards[suit3][rank3].toString());
                Image image5 = new Image(stream5);
                ImageView iv5 = new ImageView();
                iv5.setImage(image5);
                cards[suit3][rank3] = ""; // fix this to actually remove
                
                layout.getChildren().addAll(iv3);
                layout.getChildren().addAll(iv4);
                layout.getChildren().addAll(iv5);


                Label winLabel = new Label("YOU WIN!");            
                layout.getChildren().addAll(winLabel);

            }

            else if(deckNum[1].rank + deckNum[2].rank + card3.rank <= 21){
                return deckNum[1].rank + deckNum[2].rank + card3.rank;
            }
        }

        
        return deckNum[1].rank + deckNum[2].rank;
        
         
        
    }

    public void giveNewCard(StackPane layout, String[][] cards) throws FileNotFoundException {
        String picRem = cards[(int) (Math.random() * 3)][(int) (Math.random() * cards[0].length - 1)];
        InputStream stream = new FileInputStream(picRem);
        Image image = new Image(stream);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        for(int i = 0; i < cards.length; i++){
            for(int j = 0; j < cards[i].length; j++){
                if(cards[i][j] == picRem){
                    cards[i][j] = "";
                }
            }
        }

        layout.getChildren().addAll(iv1);

    }
    
    public void play(StackPane layout, String[][] cards) throws FileNotFoundException{
        
        giveNewCard(layout, cards);
        giveNewCard(layout, cards);

            
        
    }
}

