package task3;

public class Goblin extends Monster{
    public void attack(){
        System.out.print("\nThe goblin tries to hit you!");
    }
    public void getAttackPower(){
        System.out.print("\n25");

    }
    public void fleeBattle(){
        System.out.println("\nThe goblin shrieks in horror and runs away!");
    }
    public String Who(){
        return "goblin";
    }
}
