package persons;

public class Elf extends Warrior implements Eatable, Runable{

    private String name;

    private int age;

    private int height;

    private String gender;

    private int force;


    public Elf(String name, int age, int height, String gender, int force) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void greetings() {
        System.out.println("Hello I am " + name + " my parameter is : age - " + age + " height - " + height + " gender - " + gender + " force - " + force);
    }


    @Override
    public void attack() {
        System.out.println("I am " + name + " and I attack!\tdamage -" + force);
    }

    @Override
    public void defence() {
        System.out.println("I am " + name + " and I defence!\tprotection " + force);
    }

    public int getForce() {
        return force;
    }

    @Override
    public void eat() {
        System.out.println("I am " + name + " and I can eat!");
    }

    @Override
    public void run() {
        System.out.println("I am " + name + " and I can run!");
    }
}
