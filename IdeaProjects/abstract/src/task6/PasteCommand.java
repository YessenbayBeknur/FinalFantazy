package task6;

public class PasteCommand implements Command {
    Word word;

    public PasteCommand(Word word){
        this.word = word;
    }
    @Override
    public void execute() {
        word.paste();
    }
}
