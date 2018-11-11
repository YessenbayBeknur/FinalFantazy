package task6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class birdene extends Application{
    TextArea textArea = new TextArea();
    Write write = new Write();
    Word word = new Word(textArea);

    PasteCommand pasteCommand = new PasteCommand(word);
    CopyCommand copyCommand = new CopyCommand(word);
    CutCommand cutCommand = new CutCommand(word);

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        HBox buttons = new HBox(10);

        Button copy = new Button("Copy");
        Button cut = new Button("Cut");
        Button paste = new Button("Paste");


        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(copy,cut,paste);



        copy.setOnAction(e -> {
            write.setCommand(copyCommand);
            write.buttonWasPressed();

        });

        cut.setOnAction(e -> {
            write.setCommand(cutCommand);
            write.buttonWasPressed();

        });

        paste.setOnAction(e -> {
            write.setCommand(pasteCommand);
            write.buttonWasPressed();
        });

        pane.setBottom(buttons);
        pane.setCenter(textArea);

        Scene scene = new Scene(pane,400,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Word");
        primaryStage.show();


    }
}
