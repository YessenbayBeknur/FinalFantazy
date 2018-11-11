package task6;

public class CutCommand implements Command {
    Word word;

    public CutCommand(Word word){
        this.word = word;
    }
    @Override
    public void execute() {
        this.word.cut();
    }


}
