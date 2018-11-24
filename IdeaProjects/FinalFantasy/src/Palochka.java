public class Palochka extends Hero {
    Hero p;

    Palochka(Hero p){
        this.p = p;
    }


    public double useMagic() { return this.p.useMagic() + 88;}




}