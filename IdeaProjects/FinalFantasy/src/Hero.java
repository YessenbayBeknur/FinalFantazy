public class Hero implements GameUnit {
    int h = 400;
    int m = 500;


    public int damage() {
        int chance = 1 + (int)(Math.random() + 10);
        if (chance == 1){return 0;}
        else if (chance == 2){return 180;}
        else return 60;
    }

    public int health() {
        return h;
    }

    public void setHealth(int health) {
        h = health;
    }

    @Override
    public void setMana(int mana) {
        m = mana;
    }

    @Override
    public int mana() {
        return m;
    }

    @Override
    public int magicDamage() {
        return 90;
    }
}
