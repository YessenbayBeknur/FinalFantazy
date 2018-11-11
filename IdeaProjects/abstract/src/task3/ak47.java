package task3;

public class ak47 extends MonsterDecorator {
    private Monster m;

    public ak47(Monster m){
        this.m = m;

    }


    @Override
    public void attack() {
        m.attack();
        System.out.println("The " + m.Who() + " swings at you with a ak47!");
    }

    @Override
    public void getAttackPower() {
        System.out.println("65");
    }

    @Override
    public void fleeBattle() {
        m.attack();
        System.out.println(" And loses his ak47 while running!");
    }
}
