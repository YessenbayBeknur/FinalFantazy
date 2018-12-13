public class Palochka extends Hero {
    private Hero hero;

    public Palochka(Hero p){
        this.hero = p;
    }


    public double getDefence() {
        return this.hero.getDefence();
    }

    public double getAttack(){
        return this.hero.getAttack();
    }

    public double getMagicDamage() {
        return this.hero.getMagicDamage() + 7;
    }


}