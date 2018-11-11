package task3;

public class Elf extends Monster {
    public void attack(){
        System.out.print("\nThe elf tries to kick you!");
    }
    public void getAttackPower(){
        System.out.print("\n20");

    }
    public void fleeBattle(){
        System.out.println("\nThe elf shrieks in horror and runs away!");
    }
    public String Who(){
        return "elf";
    }
}
