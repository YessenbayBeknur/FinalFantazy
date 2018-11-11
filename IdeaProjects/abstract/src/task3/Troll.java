package task3;

public class Troll extends Monster{
    public void attack(){
        System.out.print("\nThe troll tries to grab you!");
    }
    public void getAttackPower(){
        System.out.print("\n30");

    }
    public void fleeBattle(){
        System.out.println("\nThe troll shrieks in horror and runs away!");
    }
    public String Who(){
        return "troll";
    }
}
