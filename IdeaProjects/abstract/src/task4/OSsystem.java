package task4;

public abstract class OSsystem {

    public OS typeOS(String type){
        OS os;
        os = createOS(type);

        os.button();
        os.command();

        return os;
    }

    protected abstract OS createOS(String type);
}
