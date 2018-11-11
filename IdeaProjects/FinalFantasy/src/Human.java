public class Human extends MyPlayer {
    int h = 400;
    @Override
    public void attack(MyPlayer player) {
        player.setHealth(player.health() - damage());
    }

    @Override
    public int damage() {
        return 30;
    }

    @Override
    public int health() {
        return h;
    }

    @Override
    public void setHealth(int health) {
        h = health;
    }
}
