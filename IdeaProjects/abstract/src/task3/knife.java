package task3;

public class knife extends MonsterDecorator {
    private Monster m;

    public knife(Monster m){
        this.m = m;

    }


    @Override
    public void attack() {
        m.attack();
        System.out.println("The " + m.Who() + " swings at you with a knife!");
    }

    @Override
    public void getAttackPower() {
        System.out.println("50");
    }

    @Override
    public void fleeBattle() {
        m.attack();
        System.out.println(" And loses his knife while running!");
    }
}
