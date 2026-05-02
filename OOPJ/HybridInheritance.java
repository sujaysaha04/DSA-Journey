public class HybridInheritance {
    public static void main(String[] args) {
        Tuna t1=new Tuna();
        t1.swim();
        Peacock p1=new Peacock();
        p1.feather();
        Human h1=new Human();
        h1.think();
    }
}
class Animaal {
    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}
class Fishy extends Animaal {
    void swim() {
        System.out.println("Swim");
    }
}
class Tuna extends Fishy {
    void small() {
        System.out.println("Small");
    }
}
class Shark extends Fishy {
    void big() {
        System.out.println("Big");
    }
} 
class Birdy extends Animaal {
    void fly() {
        System.out.println("Fly");
    }
}
class Peacock extends Birdy {
    void feather() {
        System.out.println("Feathers");
    }
}
class Mammaal extends Animaal {
    void walk() {
        System.out.println("Walks");
    }
}
class Dog extends Mammaal {
    void bark() {
        System.out.println("Barks");
    }
}
class Cat extends Mammaal {
    void meow() {
        System.out.println("Meow");
    }
}
class Human extends Mammaal {
    void think() {
        System.out.println("Thinks");
    }
}