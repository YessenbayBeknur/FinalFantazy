
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class menu extends BorderPane {
    Label error = new Label("ERROR! at jaz nahy");
    Button button = new Button("Start");
    TextField nickname = new TextField();


    public menu(){
        Label title = new Label("Final Fantasy europeyka");
        title.setFont(new Font("Arial",54));
        title.setTextFill(Color.web("#cccc00"));


        Label label = new Label("Nickname", nickname);
        label.setContentDisplay(ContentDisplay.RIGHT);

        button.setAlignment(Pos.CENTER);

        Image image = new Image(getClass().getResourceAsStream("images/hero2.gif"));     //!!!!!!
        ImageView gif = new ImageView();
        gif.setImage(image);

        Label hpValue = new Label("HP: 100");
        hpValue.setFont(new Font("Arial",35));
        Label manaValue = new Label("Mana: 100");
        manaValue.setFont(new Font("Arial",35));
        Label attackValue = new Label("Damage: 5");
        attackValue.setFont(new Font("Arial",35));
        Label magicValue = new Label("Magic: 20");
        magicValue.setFont(new Font("Arial",35));

        VBox info = new VBox(5);
        info.getChildren().addAll(hpValue,manaValue,attackValue,magicValue);

        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(gif,info);
        hBox.setAlignment(Pos.CENTER);


        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(title,label,hBox,button);
        vBox.setAlignment(Pos.CENTER);


        error.setTextFill(Color.web("#ff0000"));
        error.setVisible(false);
        vBox.getChildren().add(error);


        this.setCenter(vBox);
        this.setBackground(new Background(new BackgroundFill(Color.web("#1a1a1a"), CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public Button getButton(){
        return button;
    }

    public Label getError(){
        return error;
    }

    public TextField getNickname(){
        return nickname;
    }
}
