import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.*;
import javafx.stage.Stage;



public class Game extends Application {

    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();
        BorderPane action_scene = new BorderPane();
        borderPane.setCenter(action_scene);

        action_scene.setStyle("-fx-background-image:url('game_back.png');" +
                            "-fx-background-size: cover;");


        VBox vBox1 = new VBox(5);
        Button attack = new Button("Attack");
        Button magic = new Button("Magic");
        Button defence = new Button("Defence");
        Button item = new Button("item");
        vBox1.getChildren().addAll(attack, defence, magic, item);

        ProgressBar healthBar = new ProgressBar();
        healthBar.setProgress(100);
        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(healthBar);

        HBox bar = new HBox();
        bar.setStyle("-fx-background-color: black;");
        bar.getChildren().addAll(vBox1, vBox2);

        borderPane.setBottom(bar);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);

        primaryStage.setFullScreen(true);

        primaryStage.show();

    }
}
