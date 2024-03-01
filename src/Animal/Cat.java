package Animal;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " їсть рибу.");
    }
}