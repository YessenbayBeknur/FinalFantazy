public class Test {

    public static void main(String[] args) {
        MyPlayer I = new Human();
        I = new Axe(I);

        MyPlayer troll = new Troll();
        troll = new Axe(troll);

        while (troll.health() > 0 && I.health() > 0){
            I.attack(troll);
            troll.attack(I);
        }
        if(troll.health() > I.health()) System.out.println("troll win");
        else System.out.println("human win");
    }
}
