package persons;

public class ElfSwordMan extends Elf implements Eatable{

    public ElfSwordMan(String name, int age, int height, String gender, int force) {
        super(name, age, height, gender, force);
    }
    @Override
    public void attack() {
        System.out.println("I am " + getName() + " and I sword attack!\tdamage -" + getForce());
    }

    @Override
    public void eat() {
        System.out.println("I am " + getName() + " and I can eat!");
    }
}
