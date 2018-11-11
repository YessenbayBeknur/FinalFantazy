package task4;

public class whichOS extends OSsystem{
    @Override
    protected OS createOS(String item) {
        if (item.equals("windows")){
            return new Windows();
        }
        else if(item.equals("mac")){
            return new Mac();
        }
        else if(item.equals("linux")){
            return new Linux();
        }
        else return null;
    }
}