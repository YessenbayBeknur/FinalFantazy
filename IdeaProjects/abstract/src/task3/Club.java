package task3;

public class Club extends MonsterDecorator {
    private Monster m;

    public Club(Monster m){
        this.m = m;

    }


    @Override
    public void attack() {
        m.attack();
        System.out.println("The " + m.Who() + " swings at you with a club!");
    }

    @Override
    public void getAttackPower() {
        System.out.println("42");
    }

    @Override
    public void fleeBattle() {
        m.attack();
        System.out.println(" And loses his club while running!");
    }
}
