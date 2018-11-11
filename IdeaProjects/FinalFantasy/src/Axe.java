public class Axe extends PlayerDecorator {
    MyPlayer p;
    public Axe(MyPlayer p){
        this.p = p;
    }
    @Override
    public void attack(MyPlayer player) {
        player.setHealth(player.health() - damage());
    }

    @Override
    public int damage() {
        return p.damage() + 60;
    }

    @Override
    public int health() {
        return p.health();
    }

    @Override
    public void setHealth(int health) {
        this.p.setHealth(health);
    }
}
