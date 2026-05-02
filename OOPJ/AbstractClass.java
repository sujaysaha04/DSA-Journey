

public class AbstractClass {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.eat();
        h1.walk();
        Hen hen1=new Hen();
        hen1.eat();
        hen1.walk();
    }
}
abstract class Animal2 {
    void eat() {
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal2 {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Hen extends Animal2 {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}