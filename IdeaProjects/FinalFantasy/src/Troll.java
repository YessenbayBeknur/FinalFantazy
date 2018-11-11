public class Troll extends MyPlayer {
    int h = 200;
    @Override
    public void attack(MyPlayer player) {
        player.setHealth(player.health() - damage());
    }

    @Override
    public int damage() {
        return 90;
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
