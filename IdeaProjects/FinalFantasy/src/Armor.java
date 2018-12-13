public class Armor extends Hero {
    private Hero hero;
    public Armor(Hero p){
        this.hero = p;
    }
    @Override
    public double getDefence() {
        return this.hero.getDefence() + 150;
    }

    public double getAttack(){
        return this.hero.getAttack();
    }

    public double getMagicDamage(){
        return this.hero.getMagicDamage();
    }
}
