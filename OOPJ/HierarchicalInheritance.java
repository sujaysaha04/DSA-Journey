public class HierarchicalInheritance {
    public static void main(String[] args) {
        Fish1 f1=new Fish1();
        Bird b1=new Bird();
        Mammals m1=new Mammals();
        f1.eat();
        f1.swim();
        m1.breathe();
        b1.eat();
    }
}
class Animal1 {
    void eat() {
        System.out.println("They eat");
    }
    void breathe() {
        System.out.println("They breathe");
    }
}
class Fish1 extends Animal1 {
    void swim() {
        System.out.println("They swim");
    }
}
class Bird extends Animal1 {
    void fly() {
        System.out.println("They fly");
    }
}
class Mammals extends Animal1 {
    void walk() {
        System.out.println("They walk");
    }
}