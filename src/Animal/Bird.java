package Animal;

public class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Цвірінь-цвірінь!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " Птах їсть зерно.");
    }
}