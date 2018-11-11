package task4;

public abstract class OS {
    String name;

    void button() {
        System.out.println(name + "Button was created!");
    }

    void command(){
        System.out.println(name + "CommandLine was created!");
    }

}
