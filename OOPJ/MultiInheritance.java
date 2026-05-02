public class MultiInheritance {
    public static void main(String[] args) {
        Dog ob=new Dog();
        ob.legs=4;
        ob.eat();
        ob.leg();
    }
}
class Animals {
    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}
class Mammal extends Animals {
    int legs;
    void leg() {
        System.out.println("Legs:"+legs);
    }
}
class Dog extends Mammal {
    String breed;
}