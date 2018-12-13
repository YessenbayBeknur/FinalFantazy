public class Axe extends Hero {
    private Hero hero;

    public Axe(Hero p){
        this.hero = p;

    }

    public double getAttack(){
        return this.hero.getAttack() + 8;
    }

    public double getMagicDamage(){
        return this.hero.getMagicDamage();
    }

    public double getDefence() {
        return this.hero.getDefence();
    }


}
