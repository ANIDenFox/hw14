import Animal.Bird;
import Animal.Cat;
import Animal.Dog;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площа кола: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3, 8);
        System.out.println("Площа трикутника: " + triangle.calculateArea());



        Dog myDog = new Dog("Барон", 3);
        Cat myCat = new Cat("Мурзик", 2);
        Bird myBird = new Bird("Кєша" , 1);

        myDog.makeSound();
        myDog.eat();
        System.out.println("Вік собаки: " + myDog.getAge() + " роки");

        myCat.makeSound();
        myCat.eat();
        System.out.println("Вік кота: " + myCat.getAge() + " роки");

        myBird.makeSound();
        myBird.eat();
        System.out.println("Вік птаха: " + myBird.getAge() + " рік");
    }
}