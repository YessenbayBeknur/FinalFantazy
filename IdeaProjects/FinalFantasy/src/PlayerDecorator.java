public abstract class PlayerDecorator extends MyPlayer {

    public abstract void attack(MyPlayer player);
    public abstract int damage();
    public abstract int health();
    public abstract void setHealth(int health);

}
