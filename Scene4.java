// import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.scene.layout.VBox;

// public class Scene4 {
//     public static VBox layout4 = new VBox();
//     public static Scene scene4 = new Scene(layout4, 1300, 700);
//     public static Scene getScene3() {            
        
//         Label label4 = new Label("This is the fourth Scene");
//         layout4.getChildren().addAll(label4);
//         return scene4;
//     }

// }
// import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.scene.layout.VBox;

// public class Scene4 {
//     public static VBox layout4 = new VBox();
//     public static Scene scene4 = new Scene(layout4, 1300, 700);
//     public static Scene getScene4() {            

//         Label label4 = new Label("This is the fourth Scene");
//         layout4.getChildren().addAll(label4);
//         return scene4;
//     }

// }
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.lang.Math;

import javax.swing.LayoutStyle;

import java.util.ArrayList;

//CASINO STYLE BABY WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO

public class Scene4 {

    public static Scene getScene4() throws FileNotFoundException {

        VBox layout4 = new VBox();
        Scene scene4 = new Scene(layout4, 1300, 700);

        Label label4 = new Label("This is the fourth Scene");
        layout4.getChildren().addAll(label4);

        

        String[][] cardNames = {
                { "images/2_of_clubs.png", "images/3_of_clubs.png", "images/4_of_clubs.png", "images/5_of_clubs.png", "images/6_of_clubs.png",
                        "images/7_of_clubs.png", "images/8_of_clubs.png", "images/9_of_clubs.png", "images/10_of_clubs.png", "images/jack_of_clubs.png",
                        "images/queen_of_clubs.png", "images/king_of_clubs.png", "images/ace_of_clubs.png" },
                { "images/2_of_diamonds.png", "images/3_of_diamonds.png", "images/4_of_diamonds.png", "images/5_of_diamonds.png",
                        "images/6_of_diamonds.png", "images/7_of_diamonds.png", "images/8_of_diamonds.png", "images/9_of_diamonds.png",
                        "images/10_of_diamonds.png", "images/jack_of_diamonds.png", "images/queen_of_diamonds.png", "images/king_of_diamonds.png",
                        "images/ace_of_diamonds.png" },
                { "images/2_of_spades.png", "images/3_of_spades.png", "images/4_of_spades.png", "images/5_of_spades.png", "images/6_of_spades.png",
                        "images/7_of_spades.png", "images/8_of_spades.png", "images/9_of_spades.png", "images/10_of_spades.png",
                        "images/jack_of_spades.png", "images/queen_of_spades.png", "images/king_of_spades.png", "images/ace_of_spades.png" },
                { "images/2_of_hearts.png", "images/3_of_hearts.png", "images/4_of_hearts.png", "images/5_of_hearts.png", "images/6_of_hearts.png",
                        "images/7_of_hearts.png", "images/8_of_hearts.png", "images/9_of_hearts.png", "images/10_of_hearts.png",
                        "images/jack_of_hearts.png", "images/queen_of_hearts.png", "images/king_of_hearts.png", "images/ace_of_hearts.png", } };

        Card[] deckSeen = new Card[52];
        int index = 0;
        for (int suit = 0; suit < 3; suit++) {
            for (int rank = 1; rank < 13; rank++) {
                deckSeen[index] = new Card(rank, suit);
                index++;
            }
        }

        Card[] deckNum = new Card[52];
        int index2 = 0;
        for (int suit = 0; suit < 3; suit++) {
            for (int rank = 2; rank < 10; rank++) {
                deckNum[index2] = new Card(rank, suit);
                index2++;
            }
        }
        int index3 = 35;
        for (int suit = 0; suit < 3; suit++) {
            for (int rank = 0; rank < 4; rank++) {
                deckNum[index3] = new Card(10, suit);
                index3++;
            }
        }
        int index4 = 47;
        for (int suit = 0; suit < 3; suit++) {
            for (int rank = 0; rank < 1; rank++) {
                deckNum[index4] = new Card(1, suit);
                index4++;
            }
        }

        play(layout4, cardNames);

        compCards(layout4, deckNum, cardNames);

        Button btn1 = makeButtons(layout4, 100, 60, -500, 96, "Hit");
        Button btn2 = makeButtons(layout4, 100, 60, 500, 96, "Hold");

        btn1.setOnAction(e -> {
            try {
                String picRem = cardNames[(int) (Math.random() * cardNames.length)][(int) (Math.random() * cardNames[0].length)];
    
                InputStream streamNewCard = new FileInputStream(picRem);
            Image imageNew = new Image(streamNewCard);
            ImageView ivNew = new ImageView();
            ivNew.setImage(imageNew);
            // for (int i = 0; i < cards.length; i++) {
            //     for (int j = 0; j < cards[i].length; j++) {
            //         if (cards[i][j] == picRem) {
            //             cards[i][j] = "";
            //         }
            //     }
            // }
            ivNew.setScaleX(100);
            ivNew.setScaleY(150);
    
            ivNew.setTranslateX(50);
            ivNew.setTranslateY(-100);
            
    
    
            layout4.getChildren().addAll(ivNew);
            } catch (FileNotFoundException ex) {
                System.out.println("AHHHHHHHHHHHH");
            }
        });

        btn2.setOnAction(e -> {

        });

        

        return scene4;

    }

    public static Button makeButtons(VBox layout, int width, int length, int translateX, int translateY, String message) {
        Button door = new Button(message);
        door.setPrefSize(width, length);
        door.setTranslateX(translateX);
        door.setTranslateY(translateY);
        layout.getChildren().add(door);
        return door;
    }

    public static Card[] shuffle(Card[] arr) {
        List<Card> list = Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
        return arr;
    }

    public static int compCards(VBox layout, Card[] deckNum, String[][] cards) throws FileNotFoundException {

        shuffle(deckNum);

        InputStream stream = new FileInputStream("images/CardBack.png");
        Image image = new Image(stream);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);

        iv1.setScaleX(50);
        iv1.setScaleY(75);
        
        iv1.setTranslateX(50);
        iv1.setTranslateY(50);

        InputStream stream2 = new FileInputStream("images/CardBack.png");
        Image image2 = new Image(stream2);
        ImageView iv2 = new ImageView();
        iv2.setImage(image2);

        iv2.setScaleX(50);
        iv2.setScaleY(75);
        
        iv2.setTranslateX(100);
        iv2.setTranslateY(100);

        layout.getChildren().addAll(iv1);
        layout.getChildren().addAll(iv2);

        if (deckNum[1].rank + deckNum[2].rank <= 16) {
            Card card3 = deckNum[3];

            InputStream back3 = new FileInputStream("images/CardBack.png");
            Image imageback3 = new Image(back3);
            ImageView ivback3 = new ImageView();
            ivback3.setImage(imageback3);

            ivback3.setScaleX(50);
            ivback3.setScaleY(75);
            
            ivback3.setTranslateX(150);
            ivback3.setTranslateY(150);

            layout.getChildren().addAll(ivback3);

            

            if (deckNum[1].rank + deckNum[2].rank + card3.rank > 21) {

                int suit1 = deckNum[1].suit;
                int suit2 = deckNum[2].suit;
                int suit3 = deckNum[3].suit;

                int rank1 = deckNum[1].rank;
                int rank2 = deckNum[2].rank;
                int rank3 = deckNum[3].rank;

                InputStream stream3 = new FileInputStream(cards[suit1][rank1]);
                Image image3 = new Image(stream3);
                ImageView iv3 = new ImageView();
                iv3.setImage(image3);
                //cards[suit1][rank1] = "";

                iv3.setScaleX(50);
                iv3.setScaleY(75);
                
                iv3.setTranslateX(100);
                iv3.setTranslateY(100);

                InputStream stream4 = new FileInputStream(cards[suit2][rank2]);
                Image image4 = new Image(stream4);
                ImageView iv4 = new ImageView();
                iv4.setImage(image4);
                //cards[suit2][rank2] = "";

                iv4.setScaleX(50);
                iv4.setScaleY(75);
                
                iv4.setTranslateX(150);
                iv4.setTranslateY(150);

                InputStream stream5 = new FileInputStream(cards[suit3][rank3]);
                Image image5 = new Image(stream5);
                ImageView iv5 = new ImageView();
                iv5.setImage(image5);
                //cards[suit3][rank3] = ""; // fix this to actually remove

                iv5.setScaleX(50);
                iv5.setScaleY(75);
                
                iv5.setTranslateX(200);
                iv5.setTranslateY(200);

                layout.getChildren().addAll(iv3);
                layout.getChildren().addAll(iv4);
                layout.getChildren().addAll(iv5);

                Label winLabel = new Label("YOU WIN!");
                layout.getChildren().addAll(winLabel);
            }

            else if (deckNum[1].rank + deckNum[2].rank + card3.rank <= 21) {
                return deckNum[1].rank + deckNum[2].rank + card3.rank;
            }
        }

        return deckNum[1].rank + deckNum[2].rank;

    }

    //public static void giveNewCard(VBox layout, String[][] cards) throws FileNotFoundException {

        
    //}

    public static void play(VBox layout, String[][] cards) throws FileNotFoundException {

        try {
            String picRem = cards[(int) (Math.random() * cards.length)][(int) (Math.random() * cards[0].length)];

            InputStream stream = new FileInputStream(picRem);
        Image image = new Image(stream);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        // for (int i = 0; i < cards.length; i++) {
        //     for (int j = 0; j < cards[i].length; j++) {
        //         if (cards[i][j] == picRem) {
        //             cards[i][j] = "";
        //         }
        //     }
        // }
        iv1.setScaleX(100);
        iv1.setScaleY(150);

        iv1.setTranslateX(50);
        iv1.setTranslateY(-100);
        


        layout.getChildren().addAll(iv1);
        } catch (NumberFormatException e) {
            System.out.println("AHHHHHHHHHHHH");
        }


        try {
            String picRem = cards[(int) (Math.random() * cards.length)][(int) (Math.random() * cards[0].length)];

            InputStream stream2 = new FileInputStream(picRem);
            Image image2 = new Image(stream2);
            ImageView iv2 = new ImageView();
            iv2.setImage(image2);
            // for (int i = 0; i < cards.length; i++) {
            //     for (int j = 0; j < cards[i].length; j++) {
            //         if (cards[i][j] == picRem) {
            //             cards[i][j] = "";
            //         }
            //     }
            // }
            iv2.setScaleX(100);
            iv2.setScaleY(150);

            iv2.setTranslateX(200);
            iv2.setTranslateY(-100);

            layout.getChildren().addAll(iv2);
            } catch (NumberFormatException e) {
                System.out.println("AHHHHHHHHHHHH");
            }

    }

}
