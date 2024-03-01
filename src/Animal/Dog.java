package Animal;

public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " їсть кістку.");
    }
}