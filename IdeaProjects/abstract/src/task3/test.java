package task3;

public class test {
    public static void main(String[] args) {
        Monster troll = new Troll();
        troll.getAttackPower();
        troll.attack();
        troll.fleeBattle();

        troll = new Club(troll);
        troll.getAttackPower();
        troll.attack();
        troll.fleeBattle();

        troll = new knife(troll);
        troll.getAttackPower();
        troll.attack();
        troll.fleeBattle();


    }
}
