public class Sword extends HeroDecorator {
    GameUnit p;
    public Sword(GameUnit p) {
        this.p = p;
    }

    @Override
    public int damage() {
        int chance = 1 + (int)(Math.random() + 10);
        if (chance == 1){return 0;}
        else if (chance == 2){return 180;}
        else return 40 + p.damage();
    }

    @Override
    public int health() {
        return p.health();
    }

    @Override
    public void setHealth(int health) {
        this.p.setHealth(health);
    }

    @Override
    public void setMana(int mana) {
        this.p.setMana(mana);
    }

    @Override
    public int mana() {
        return p.mana();
    }

    @Override
    public int magicDamage() {
        return p.magicDamage();
    }
}

