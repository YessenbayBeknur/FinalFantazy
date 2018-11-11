package task3;

public class katana extends MonsterDecorator {
    private Monster m;

    public katana(Monster m){
        this.m = m;

    }


    @Override
    public void attack() {
        m.attack();
        System.out.println("The " + m.Who() + " swings at you with a katana!");
    }

    @Override
    public void getAttackPower() {
        System.out.println("120");
    }

    @Override
    public void fleeBattle() {
        m.attack();
        System.out.println(" And loses his katana while running!");
    }
}
