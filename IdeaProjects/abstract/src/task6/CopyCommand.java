package task6;

public class CopyCommand implements Command {
    Word word;

    public CopyCommand(Word word){
        this.word = word;
    }
    @Override
    public void execute() {
        word.copy();
    }
}
