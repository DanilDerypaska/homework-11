package persons;

public class Gnome extends Warrior implements Eatable, Runable {

    private String name;

    private int age;

    private int height;

    private String gender;

    private int force;



    public Gnome(String name, int age, int height, String gender, int force) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.force = force;
    }

    @Override
    public String toString() {
        return "Gnome{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public void attack() {
        System.out.println("I am " + name + " and I attack!\tdamage -" + force);
    }

    @Override
    public void defence() {
        System.out.println("I am " + name + " and I defence!\tprotection " + force);
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
