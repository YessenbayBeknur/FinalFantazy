package task6;


import javafx.scene.control.TextArea;

public class Word {
    String text;
    TextArea textArea;

    public Word(TextArea textArea){
        this.textArea = textArea;
    }

    public void copy(){
        text = this.textArea.getSelectedText();
    }

    public void cut(){
        text = this.textArea.getSelectedText();
        this.textArea.replaceSelection("");
    }

    public void paste(){
        this.textArea.setText(this.textArea.getText() + text);
    }

}
